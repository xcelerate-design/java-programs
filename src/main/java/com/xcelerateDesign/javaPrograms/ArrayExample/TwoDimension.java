package com.xcelerateDesign.javaPrograms.ArrayExample;

import java.util.Scanner;

/**
 * @author Xcelerate Design on 2023-08-04
 * @project java-programs
 */

public class TwoDimension {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows :");
        int rows = sc.nextInt();
        int a[][] = new int[rows][];

        for (int rowsCount = 0; rowsCount < a.length; rowsCount++) {
            System.out.println("How many cols for row " + (rowsCount + 1) + " :");
            int columns = sc.nextInt();
            a[rowsCount] = new int[columns];
        }

        System.out.println("Enter your multidimensional array :");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " | ");
            }
            System.out.println("");
        }

    }

}
