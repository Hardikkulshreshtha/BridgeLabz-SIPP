package com.gla;
public class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "GLA University";
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }
    public static void updateInstituteName(String name) {
        instituteName = name;
    }
    public static void main(String[] args) {
        Course c1 = new Course("Java", 3, 5000);
        c1.displayCourseDetails();
        Course.updateInstituteName("GLA Online");
        c1.displayCourseDetails();
    }
} 