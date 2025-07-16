package com.gla;
public class HospitalPatient {
    static class Patient {
        static String hospitalName = "GLA Hospital";
        static int totalPatients = 0;
        final int patientID;
        String name;
        int age;
        String ailment;
        public Patient(int patientID, String name, int age, String ailment) {
            this.patientID = patientID;
            this.name = name;
            this.age = age;
            this.ailment = ailment;
            totalPatients++;
        }
        public void displayDetails() {
            if (this instanceof Patient) {
                System.out.println("Patient ID: " + patientID);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Ailment: " + ailment);
                System.out.println("Hospital: " + hospitalName);
            }
        }
        public static void getTotalPatients() {
            System.out.println("Total Patients: " + totalPatients);
        }
    }
    public static void main(String[] args) {
        Patient p = new Patient(1, "Amit", 30, "Fever");
        if (p instanceof Patient) {
            p.displayDetails();
        }
        Patient.getTotalPatients();
    }
} 