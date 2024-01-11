package com.tofek.example.spring.demo.filterforeach;

import java.util.ArrayList;
import java.util.List;

public class DAOService {

    public static List<Employee> employeeList(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Employee 1", "Manager", "Google"));
        list.add(new Employee(3,"Employee 3", "Sr. Manager", "MSF"));
        list.add(new Employee(5,"Employee 5", "Delivery Manager", "Adobe"));
        list.add(new Employee(8,"Employee 8", "Associate Manager", "Accenture"));

        return list;
    }
}
