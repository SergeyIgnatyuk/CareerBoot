package com.careerboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Technology {
    private long id;
    private String name;
    private Type type;

    public enum Type {
        FRONT, BACK
    }
}
