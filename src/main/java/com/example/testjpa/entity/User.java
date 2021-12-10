package com.example.testjpa.entity;


import javax.persistence.*;
import java.time.LocalDate;


@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDate createdDate;

    @PrePersist
    private void setCreatedDate(){
        setCreatedDate(LocalDate.now());
    }

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(Long id, String name, LocalDate createdDate) {
        this.id = id;
        this.name = name;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }
}
