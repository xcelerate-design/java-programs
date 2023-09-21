package com.xcelerateDesign.javaPrograms.abstraction;

/**
 * @author Xcelerate Design on 2023-09-08
 * @project java-programs
 */

public class Car extends Vehicle {

    @Override
    void tyre() {
        System.out.println("4 tyres");
    }

    @Override
    void brand() {
        System.out.println("Ford");
    }


}
