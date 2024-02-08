package com.careerboot.controller;

import com.careerboot.model.User;
import com.careerboot.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Data
@AllArgsConstructor
@Slf4j
@Controller
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @GetMapping("/signup")
    public String registerForm(Model model) {
        model.addAttribute(new User());
        return "signup";
    }

    @PostMapping("/signup")
    public String registerNewUser(@ModelAttribute User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "redirect:/auth/signin";
    }

}
