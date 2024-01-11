package com.tofek.example.spring.demo.filterforeach;

public class Employee {

    private int empId;
    private String name;
    private String designation;
    private String projectName;

    public Employee(int empId, String name, String designation, String projectName) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
        this.projectName = projectName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", projectName='" + projectName + '\'' +
                '}';
    }
}
