package com.opielka.schoolmanager.api.to;

public class SchoolClassEto {
    private long id;
    private String student;

    public SchoolClassEto() {
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
