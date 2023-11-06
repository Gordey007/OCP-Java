package org.gordeyvasilev;

import java.io.IOException;

public class Tenth {
    static Integer i;

    public static void main(String[] args) {
        try {
            System.out.println(2 / i.intValue());
        } catch (ArithmeticException | NullPointerException exp) {
            System.out.println(exp.getClass().getSimpleName());
        }
    }
}
