package com.xcelerateDesign.javaPrograms.Interface;

/**
 * @author Xcelerate Design on 2023-09-09
 * @project java-programs
 */

public class Car implements Vehicle {

    @Override
    public void tyre() {
        System.out.println("4 tyres");
    }

    @Override
    public void engine() {
        System.out.println("1200 cc");
    }

}
