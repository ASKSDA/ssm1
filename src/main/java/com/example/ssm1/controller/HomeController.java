package com.example.ssm1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes({"name", "age"})
public class HomeController {

    @RequestMapping("/session")
    public String session(Model model) {
        model.addAttribute("name", "tom");
        model.addAttribute("age", "23");
        return "redirect:/newSession";
    }

    @RequestMapping("/newSession")
    public String newSession(@SessionAttribute("name") String name,@SessionAttribute("age") Integer age){
        System.out.println(name + " "+ age);
        return "/";
    }
}
