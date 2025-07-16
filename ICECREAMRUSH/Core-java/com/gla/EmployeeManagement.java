package com.gla;
public class EmployeeManagement {
    static class Employee {
        static String companyName = "GLA Pvt Ltd";
        static int totalEmployees = 0;
        final int id;
        String name;
        String designation;
        public Employee(String name, int id, String designation) {
            this.name = name;
            this.id = id;
            this.designation = designation;
            totalEmployees++;
        }
        public void displayDetails() {
            if (this instanceof Employee) {
                System.out.println("Name: " + name);
                System.out.println("ID: " + id);
                System.out.println("Designation: " + designation);
                System.out.println("Company: " + companyName);
            }
        }
        public static void displayTotalEmployees() {
            System.out.println("Total Employees: " + totalEmployees);
        }
    }
    public static void main(String[] args) {
        Employee emp = new Employee("Ravi", 101, "Manager");
        if (emp instanceof Employee) {
            emp.displayDetails();
        }
        Employee.displayTotalEmployees();
    }
} 