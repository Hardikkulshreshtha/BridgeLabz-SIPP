package com.gla;
interface Worker {
    void performDuties();
}
class Person {
    String name;
    int id;
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }
    @Override
    public void performDuties() {
        System.out.println(name + " (Chef) is cooking food.");
    }
}
class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }
    @Override
    public void performDuties() {
        System.out.println(name + " (Waiter) is serving customers.");
    }
}
public class RestaurantManagement {
    public static void main(String[] args) {
        Worker chef = new Chef("Amit", 1);
        Worker waiter = new Waiter("Ravi", 2);
        chef.performDuties();
        waiter.performDuties();
    }
} 