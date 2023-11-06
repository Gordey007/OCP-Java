package org.gordeyvasilev.tenth;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        // Employee b = (A)a; // error
        // b.v();

        B b2 = new B();

        A a2 = (A)b2;
        a2.v();

        ((A)b2).v();

        ((A) new B()).v();
    }
}
