package com.xcelerateDesign.javaPrograms.overriding;

import java.util.Scanner;

class Execute {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Currently we make 'Car' or 'Truck'");
        System.out.println("Input vehicle name:");
        String vehicleName = scanner.next();
        Vehicle vehicle = null;
        if (vehicleName.equals("Car")) {
            vehicle = new Car();
        } else if (vehicleName.equals("Truck")) {
            vehicle = new Truck();
        }

        if (vehicle != null) {
            vehicle.name();
            vehicle.door();
            vehicle.tyre();
        } else {
            System.out.print("There is no vehicle we make on name: " + vehicleName);
        }

    }

}
