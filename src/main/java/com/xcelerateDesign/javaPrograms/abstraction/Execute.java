package com.xcelerateDesign.javaPrograms.abstraction;

/**
 * @author Xcelerate Design on 2023-09-08
 * @project java-programs
 */

public class Execute {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle truck = new Truck();
        car.tyre();
        truck.brand();
    }
}
