package com.example.student_ajax_token.model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String className;

    public Student(String name, String className) {
        this.name = name;
        this.className = className;
    }

    public Student(Long id, String name, String className) {
        this.id = id;
        this.name = name;
        this.className = className;
    }

    public Student() {
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }


}
