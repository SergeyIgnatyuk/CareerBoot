package com.careerboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class Project {
    private long id;
    private String name;
    private String description;
    private long hours;
    private float cost;
    private List<Technology> technologies;
}
