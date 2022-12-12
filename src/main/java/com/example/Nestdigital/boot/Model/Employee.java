package com.example.Nestdigital.boot.Model;

public class Employee {
    private String id;
    private String empcode;
    private String empname;
    private String designation;
    private String salary;

    public Employee() {
    }

    public Employee(String id, String empcode, String empname, String designation, String salary) {
        this.id = id;
        this.empcode = empcode;
        this.empname = empname;
        this.designation = designation;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmpcode() {
        return empcode;
    }

    public void setEmpcode(String empcode) {
        this.empcode = empcode;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
