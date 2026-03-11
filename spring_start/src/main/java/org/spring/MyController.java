package org.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/site")
public class MyController {

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("name", "Виктор Кимаковский");
        model.addAttribute("age", 18);

        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("HTML");
        list.add("JavaScript");
        model.addAttribute("nameList", list);

        return "home";
    }

//    @ResponseBody
    @RequestMapping("/login")
    public ModelAndView login() {
        ModelAndView model = new ModelAndView();

        model.addObject("address", "ул. Ленина");
        model.addObject("house", 56);

        model.setViewName("login");
        return model;
    }
}
