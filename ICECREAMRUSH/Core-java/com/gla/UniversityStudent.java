package com.gla;
public class UniversityStudent {
    static class Student {
        static String universityName = "GLA University";
        static int totalStudents = 0;
        final int rollNumber;
        String name;
        String grade;
        public Student(String name, int rollNumber, String grade) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.grade = grade;
            totalStudents++;
        }
        public void displayDetails() {
            if (this instanceof Student) {
                System.out.println("Name: " + name);
                System.out.println("Roll Number: " + rollNumber);
                System.out.println("Grade: " + grade);
                System.out.println("University: " + universityName);
            }
        }
        public static void displayTotalStudents() {
            System.out.println("Total Students: " + totalStudents);
        }
    }
    public static void main(String[] args) {
        Student s = new Student("Amit", 1, "A");
        if (s instanceof Student) {
            s.displayDetails();
        }
        Student.displayTotalStudents();
    }
} 