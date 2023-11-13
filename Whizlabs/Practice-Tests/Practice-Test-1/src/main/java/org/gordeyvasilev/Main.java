package org.gordeyvasilev;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.sv();
        B.sv();

        B.sv2();
        b.sv2();

        System.out.println("Hello world!");
    }
}