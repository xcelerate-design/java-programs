package com.xcelerateDesign.javaPrograms.Interface;

/**
 * @author Xcelerate Design on 2023-09-09
 * @project java-programs
 */

public class Truck implements Vehicle {
    @Override
    public void tyre() {
        System.out.println("6 tyres");
    }

    @Override
    public void engine() {
        System.out.println("1500 cc");
    }
}
