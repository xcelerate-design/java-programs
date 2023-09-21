package com.xcelerateDesign.javaPrograms.abstraction;

/**
 * @author Xcelerate Design on 2023-09-08
 * @project java-programs
 */

public class Truck extends Vehicle {
    @Override
    void tyre() {
        System.out.println("6 tyres");
    }

    @Override
    void brand() {
        System.out.println("RAM");
    }
}
