package com.careerboot.entity;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class CurriculumVitae {
    private Long id;
    private String title;
    private String jobTitle;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private  String country;
    private String city;
    private String address;
    private String postalCode;
    private String drivingLicense;
    private String nationality;
    private String placeOfBirth;
    private LocalDate dateOfBirth;
    private String professionalSummary;
    private List<Skill> skills;
    private User user;
}
