package com.octo.HiGuys.controller;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import com.octo.HiGuys.models.Role;
import com.octo.HiGuys.models.User;
import com.octo.HiGuys.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(User user, Map<String, Object> model){
        User userFromDb = userRepo.findByUsername(user.getUsername());
        if(userFromDb != null){
            model.put("message", "User exists!");
            return "registration";}
        user.setActive(true);
        user.setRoles(Collections.singleton(Role.USER));
        userRepo.save(user);
        return "redirect:/login";
    }
}
