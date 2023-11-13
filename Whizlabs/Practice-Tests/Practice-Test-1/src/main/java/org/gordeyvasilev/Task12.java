package org.gordeyvasilev;

public class Task12 {
    public static void main(String[] args) {
        try {
            print();
        } catch (Exception ignored) {}
    }

    private static void print() {
        try {
            throw new NullPointerException();
        } catch (ClassCastException e) {
            System.out.println("NullPointerException");
        } finally {
            System.out.println("finally");
        }

        System.out.println("test");
    }
}
