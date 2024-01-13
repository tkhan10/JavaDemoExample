package com.tofek.example.spring.demo.sortalist;

import java.util.List;

public class Student {

    private int id;
    private String name;
    private int age;
    private List<String> subjects;

    public Student(int id, String name, int age, List<String> subjects) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", subjects=" + subjects +
                '}';
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
}
