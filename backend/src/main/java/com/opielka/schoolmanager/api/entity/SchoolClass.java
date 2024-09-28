package com.opielka.schoolmanager.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SchoolClass {
    @Id
    private long id;
    private String student;


    public SchoolClass() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }
}
