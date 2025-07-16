package com.gla;
interface Refuelable {
    void refuel();
}
class Vehicle {
    String model;
    int maxSpeed;
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}
class ElectricVehicle extends Vehicle {
    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }
    public void charge() {
        System.out.println(model + " is charging.");
    }
}
class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }
    @Override
    public void refuel() {
        System.out.println(model + " is refueling.");
    }
}
public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla", 200);
        PetrolVehicle pv = new PetrolVehicle("Honda", 180);
        ev.charge();
        pv.refuel();
    }
} 