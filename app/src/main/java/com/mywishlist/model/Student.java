package com.mywishlist.model;

public class Student {
    private String name;
    private String lastName;
    private String email;
    private String fone;
    private String courseWish;

    public Student() {
    }

    public Student(String name, String lastName, String email, String fone, String courseWish) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.fone = fone;
        this.courseWish = courseWish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCourseWish() {
        return courseWish;
    }

    public void setCourseWish(String courseWish) {
        this.courseWish = courseWish;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", fone='" + fone + '\'' +
                ", courseWish='" + courseWish + '\'' +
                '}';
    }
}
