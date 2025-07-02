package com.gla;
public class VehicleRegistration {
    static class Vehicle {
        static double registrationFee = 5000;
        final String registrationNumber;
        String ownerName;
        String vehicleType;
        public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
            this.ownerName = ownerName;
            this.vehicleType = vehicleType;
            this.registrationNumber = registrationNumber;
        }
        public void displayDetails() {
            if (this instanceof Vehicle) {
                System.out.println("Owner Name: " + ownerName);
                System.out.println("Vehicle Type: " + vehicleType);
                System.out.println("Registration Number: " + registrationNumber);
                System.out.println("Registration Fee: " + registrationFee);
            }
        }
        public static void updateRegistrationFee(double fee) {
            registrationFee = fee;
        }
    }
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Ravi", "Car", "UP32AB1234");
        if (v instanceof Vehicle) {
            v.displayDetails();
        }
        Vehicle.updateRegistrationFee(6000);
        v.displayDetails();
    }
} 