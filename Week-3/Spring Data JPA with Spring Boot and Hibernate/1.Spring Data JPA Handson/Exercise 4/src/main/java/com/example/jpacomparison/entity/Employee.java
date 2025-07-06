package com.example.jpacomparison.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    private Integer id;
    private String name;
    private String role;

    // Constructors
    public Employee() {}

    public Employee(Integer id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
