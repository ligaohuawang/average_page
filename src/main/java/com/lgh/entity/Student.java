package com.lgh.entity;

public class Student {
    private Integer id;
    private String name;
    private String password;

    public Integer getId() {
        return id;
    }

    public Student(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
