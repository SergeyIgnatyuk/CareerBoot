package com.careerboot.entity;

import lombok.Data;

import java.util.List;

@Data
public class ProjectOrder {
    private Long id;
    private List<Project> projects;
}
