package com.careerboot.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
    @Column(name="user_address_country")
    private String country;
    @Column(name="user_address_city")
    private String city;
    @Column(name="user_address_street")
    private String street;
    @Column(name="user_address_home")
    private String home;
    @Column(name="user_address_apartment")
    private String apartment;
}
