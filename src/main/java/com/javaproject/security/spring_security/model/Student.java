package com.javaproject.security.spring_security.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private int id;
    private String name;
    private String technology;

    public Student() {
    }

    public Student(int id, String name, String technology) {
        this.id = id;
        this.name = name;
        this.technology = technology;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
}
