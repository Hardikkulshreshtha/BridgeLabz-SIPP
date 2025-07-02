package com.gla;
public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    public double getCGPA() {
        return CGPA;
    }
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}
class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }
    public void showName() {
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(1, "Ravi", 8.5);
        pg.showName();
        pg.setCGPA(9.0);
        System.out.println("CGPA: " + pg.getCGPA());
    }
} 