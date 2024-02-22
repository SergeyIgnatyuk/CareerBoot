package com.careerboot.controller;

import com.careerboot.model.User;
import com.careerboot.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Objects;

@AllArgsConstructor
@Slf4j
@Controller
@RequestMapping("/auth")
public class AuthController {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @GetMapping("/signin")
    public String registerForm() {
        return "signin";
    }

    @GetMapping("/signup")
    public String registerForm(Model model) {
        model.addAttribute(new User());
        return "signup";
    }

    @PostMapping("/signup")
    public String registerNewUser(@ModelAttribute @Valid User user, BindingResult result) {
        if (!Objects.equals(user.getPassword(), user.getConfirmPassword())) {
            result.rejectValue("confirmPassword", "error.user", "passwords are not the same");
        }
        if (result.hasErrors()) {
            return "signup";
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "redirect:/auth/signin";
    }

}
