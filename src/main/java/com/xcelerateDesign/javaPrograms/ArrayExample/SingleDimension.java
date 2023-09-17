package com.xcelerateDesign.javaPrograms.ArrayExample;

import java.util.Scanner;

/**
 * @author Xcelerate Design on 2023-08-04
 * @project java-programs
 */

public class SingleDimension {

    public static void main(String[] args) {

        String[] a = new String[3];
        System.out.println("Enter your array : ");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.next();
        }

        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }

    }

}
