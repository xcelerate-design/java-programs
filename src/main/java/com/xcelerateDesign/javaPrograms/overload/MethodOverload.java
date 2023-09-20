package com.xcelerateDesign.javaPrograms.overload;

public class MethodOverload {

    public void sum() {
        System.out.println(5);
    }

    public void sum(int i) {
        System.out.println(i);
    }

    public void sum(int i, int j) {
        System.out.println(i + j);
    }

    public void sum(float i, float j) {
        System.out.println(i + j);
    }

    public void sum(int i, int j, int k) {
        System.out.println(i + j + k);
    }

    public static void main(String[] args) {
        MethodOverload c = new MethodOverload();
        c.sum();
        c.sum(10);
        c.sum(10, 20, 30);
    }

}
