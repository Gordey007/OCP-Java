package org.gordeyvasilev.task38;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.o();

        try {
            b.a();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
