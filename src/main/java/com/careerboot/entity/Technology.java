package com.careerboot.entity;

import lombok.Data;

@Data
public class Skill {
    private final Long id;
    private final String name;
    private final Type type;

    public enum Type {
        HARD, SOFT
    }
}
