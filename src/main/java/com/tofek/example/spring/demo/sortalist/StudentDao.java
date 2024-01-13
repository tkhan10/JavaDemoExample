package com.tofek.example.spring.demo.sortalist;

import com.tofek.example.spring.demo.lambda.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDao {

    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Tofek",20, Arrays.asList("Math", "English")));
        students.add(new Student(3, "Tofek",20, Arrays.asList("Math", "English")));
        students.add(new Student(1, "Tofek",20, Arrays.asList("Math", "English")));
        return students;
    }
}
