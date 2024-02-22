package com.careerboot.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Embeddable
public class Passport {
    @Column(name = "user_passport_first_name")
    private String firstName;
    @Column(name = "user_passport_last_name")
    private String lastName;
    @Column(name = "user_passport_serial")
    private String serialNum;
    @Column(name = "user_passport_private")
    private String privateNum;
    @Column(name = "user_passport_service")
    private String service;
    @Column(name = "user_passport_date")
    private LocalDateTime date;
    @Embedded
    private Address address;
}
