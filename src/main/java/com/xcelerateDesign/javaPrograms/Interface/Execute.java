package com.xcelerateDesign.javaPrograms.Interface;

import java.util.Scanner;

/**
 * @author Xcelerate Design on 2023-09-09
 * @project java-programs
 */

public class Execute {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String vehicleType = scanner.next();
        Vehicle vehicle = null;
        if ("car".equals(vehicleType)) {
            vehicle = new Car();
        } else if ("truck".equals(vehicleType)) {
            vehicle = new Truck();
        }
        vehicle.tyre();
        vehicle.engine();

        vehicle.safety();
    }
}
