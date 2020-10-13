package com.octo.HiGuys.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MainController {
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("title", "Hi and Well come");
        return "home";
    }

    @GetMapping("/user-page")
    public String userPage(Model model){
        model.addAttribute("title", "Hi and Well come");
        return "user-page";
    }


}
