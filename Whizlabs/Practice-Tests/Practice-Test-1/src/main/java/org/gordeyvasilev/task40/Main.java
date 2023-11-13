package org.gordeyvasilev.task40;

public class Main {
    public static void main(String... args) {
        A a = new A();
        try {
            C c1 = (C)a;
            c1.meth();
        } catch (ClassCastException e) {
            System.out.println("ClassCastException");
        }
    }
}
