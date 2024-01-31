package com.careerboot.entity;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Order {
    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate dueDate;
    private List<Project> projects;
    private User customer;
    private Company company;
    private Status status;
}
