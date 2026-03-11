package org.spring;

import org.spring.entity.User;
import org.spring.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/home")
    public String home(Model model) {
        return "home";
    }

    @RequestMapping("/register")
    public String register(Model model) {
        return "register";
    }

    @RequestMapping(path="/createUser", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute User user, @RequestParam("fullName") String fn, Model model) {

//        System.out.println(user);
//        System.out.println("FIO: " + fn);

        userService.registerUser(user);
//        model.addAttribute("msg", "Пользователь зарегистрирован успешно");
        model.addAttribute("user", user);

        return "success";
    }
}
