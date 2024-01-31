package com.careerboot.controller;

import com.careerboot.entity.Project;
import com.careerboot.entity.Technology;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/order")
@SessionAttributes("order")
public class OrderController {

    @ModelAttribute
    public void addIngredientsToModel(Model model) {
        List<Project> projects = Arrays.asList(
                new Project(1L, "SysAid", "ITSM Help Desk", 8L, 1500f, List.of(new Technology(1L, "Groovy", Technology.Type.BACK))),
                new Project(2L, "Jira", "Tracker", 8L, 1500f, List.of(new Technology(2L, "Atlassian", Technology.Type.BACK)))
        );
    }

    @GetMapping
    public String showDesignForm() {
        return "order";
    }
}
