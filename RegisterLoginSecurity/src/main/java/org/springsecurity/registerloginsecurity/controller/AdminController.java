package org.springsecurity.registerloginsecurity.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springsecurity.registerloginsecurity.entity.Category;
import org.springsecurity.registerloginsecurity.entity.Post;
import org.springsecurity.registerloginsecurity.entity.User;
import org.springsecurity.registerloginsecurity.repository.UserRepo;
import org.springsecurity.registerloginsecurity.service.ICategoryService;
import org.springsecurity.registerloginsecurity.service.IPostService;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private IPostService postService;

    @Autowired
    private ICategoryService categoryService;

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/profile")
    public String profile(Principal principal, Model model) {
        String email = principal.getName();
        User user = userRepo.findByEmail(email);
        model.addAttribute("user", user);
        return "admin/profile";
    }

    @GetMapping("/")
    public String index() {
        return "admin/index";
    }

    @GetMapping("/loadAddItem")
    public String loadAddItem(Model model) {
        List<Category> categories = categoryService.getAllCategory();
        model.addAttribute("categories", categories);
        return "admin/add_item";
    }

    @GetMapping("/category")
    public String category(Model model) {
        model.addAttribute("categories", categoryService.getAllCategory());
        return "admin/category";
    }

    @PostMapping("/saveCategory")
    public String saveCategory(@ModelAttribute Category category, HttpSession session) {
        Boolean existCategory = categoryService.existsCategory(category.getName());
        if (existCategory) {
            session.setAttribute("errorMsg", "Category Name already exists");
        } else {
            Category savedCategory = categoryService.saveCategory(category);
            if(savedCategory == null) {
                session.setAttribute("errorMsg", "Category not saved");
            } else {
                session.setAttribute("sucMsg", "Saved Successfully");
            }
        }
        return "redirect:/admin/category";
    }

    @GetMapping("/deleteCategory/{id}")
    public String deleteCategory(@PathVariable Integer id, HttpSession session) {
        Boolean deleteCategory = categoryService.deleteCategory(id);
        if(deleteCategory) {
            session.setAttribute("sucMsg", "Category Delete Successfully");
        } else {
            session.setAttribute("errorMsg", "Category not deleted");
        }
        return "redirect:/admin/category";
    }

    @GetMapping("/loadEditCategory/{id}")
    public String loadEditCategory(@PathVariable Integer id, Model model) {
        model.addAttribute("category", categoryService.getCategoryById(id));
        return "admin/edit_category";
    }

    @PostMapping("/updateCategory")
    public String updateCategory(@ModelAttribute Category category, HttpSession session) {
        if(category.getName().equals("")) {
            session.setAttribute("errorMsg", "New Category name is empty");
            return "redirect:/admin/category";
        }
        Category oldCategory = categoryService.getCategoryById(category.getId());
        if(oldCategory != null) {
            oldCategory.setName(category.getName());
        }

        Category updateCategory = categoryService.saveCategory(oldCategory);
        if(!ObjectUtils.isEmpty(updateCategory)) {
            session.setAttribute("sucMsg", "Category Updated Successfully");
        } else {
            session.setAttribute("errorMsg", "Category not updated");
        }
        return "redirect:/admin/category";
    }

    @PostMapping("/savePost")
    public String savePost(@ModelAttribute Post post, HttpSession session, @RequestParam("file") MultipartFile image) throws IOException {
        String imageName = image.isEmpty() ? "default.jpg" : image.getOriginalFilename();
        post.setImage(imageName);

        Post savePost = postService.savaPost(post);

        if(savePost != null) {
            String saveFile = new File("src/main/resources/static/img").getAbsolutePath();
//            System.out.println(saveFile);

            if(!image.isEmpty()) {
                Path path = Paths.get(saveFile + File.separator + "post_img" + File.separator + image.getOriginalFilename());
//                System.out.println(path);
                Files.copy(image.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
                session.setAttribute("sucMsg", "Saved Successfully");
            }
        } else {
            session.setAttribute("errorMsg", "Post not saved");
        }
        return  "redirect:/admin/loadAddItem";
    }

    @GetMapping("/item")
    public String loadViewPost(Model model, @RequestParam(defaultValue = "") String ch) {
        List<Post> posts = null;
        if(ch != null && ch.length() > 0) {
            posts = postService.searchPost(ch);
        } else {
            posts = postService.getAllPost();
        }
        model.addAttribute("posts", posts);
        return "admin/items";
    }

    @GetMapping("/deleteItem/{id}")
    public String deleteItem(@PathVariable Integer id, HttpSession session) {
        Boolean deletePost = postService.deletePost(id);
        if(deletePost) {
            session.setAttribute("sucMsg", "Post Delete Successfully");
        } else {
            session.setAttribute("errorMsg", "Post not deleted");
        }
        return "redirect:/admin/item";
    }

    @GetMapping("/editItem/{id}")
    public String editItem(@PathVariable Integer id, Model model) {
        model.addAttribute("post", postService.getPostById(id));
        model.addAttribute("categories", categoryService.getAllCategory());
        return "admin/edit_items";
    }

    @PostMapping("/updatePost")
    public String updatePost(@ModelAttribute Post post, HttpSession session, @RequestParam("file") MultipartFile image) throws IOException {
        Post updatePost = postService.updatePost(post, image);
        if(updatePost != null) {
            session.setAttribute("sucMsg", "Post Updated Successfully");
        } else {
            session.setAttribute("errorMsg", "Post not updated");
        }
        return "redirect:/admin/editItem/"+post.getId();
    }
}
