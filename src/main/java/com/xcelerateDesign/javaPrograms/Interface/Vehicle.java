package com.xcelerateDesign.javaPrograms.Interface;

/**
 * @author Xcelerate Design on 2023-09-09
 * @project java-programs
 */

public interface Vehicle {

    void tyre();
    void engine();

    default void safety() {
        System.out.println("abc");
    }


    default void safety2() {
        System.out.println("abc");
    }
}
