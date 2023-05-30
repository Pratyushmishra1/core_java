package com.eleven;
//parent class
class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}
//child class1
class Car extends Vehicle {
    void accelerate() {
        System.out.println("Accelerating the car");
    }
}
//child class2
class Bike extends Vehicle {
    void pedal() {
        System.out.println("Pedaling the bike");
    }
}


public class myClass {

	//main method

	    public static void main(String[] args) {
	        Car car = new Car();
	        car.drive();       // Output: Driving a vehicle
	        car.accelerate();  // Output: Accelerating the car
	        
	        Bike bike = new Bike();
	        bike.drive();      // Output: Driving a vehicle
	        bike.pedal();      // Output: Pedaling the bike
	    }
	}


