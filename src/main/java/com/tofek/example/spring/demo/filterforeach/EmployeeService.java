package com.tofek.example.spring.demo.filterforeach;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    public static void main(String[] args) {
        System.out.println(findListOfEmployeeByDesignation("Manager"));
    }

    private static List<Employee> findListOfEmployeeByDesignation(String designation) {
        if(designation.equalsIgnoreCase("Manager")) {
            return DAOService.employeeList().stream().filter(e -> e.getDesignation().equalsIgnoreCase("Manager"))
                    .collect(Collectors.toList());
        }else if(designation.equalsIgnoreCase("Sr. Manager")) {

            return DAOService.employeeList().stream().filter(e -> e.getDesignation().equalsIgnoreCase("Manager"))
                    .collect(Collectors.toList());
        }else if(designation.equalsIgnoreCase("Delivery Manager")) {
            return  DAOService.employeeList().stream().filter(e -> e.getDesignation().equalsIgnoreCase("Manager"))
                    .collect(Collectors.toList());
        }else {
            return DAOService.employeeList().stream().filter(e -> e.getDesignation().equalsIgnoreCase("Manager"))
                    .collect(Collectors.toList());
        }
    }
}
