package com.careerboot.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
    @GetMapping("/register")
    public String registerForm() {
        return "register";
    }

    @GetMapping
    @PreAuthorize("hasAuthority('users:write')")
    public String usersForm() {
        return "users";
    }
}
