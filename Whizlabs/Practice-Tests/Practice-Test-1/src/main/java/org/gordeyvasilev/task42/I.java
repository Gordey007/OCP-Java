package org.gordeyvasilev.task42;

public abstract interface I {
    public static void main(String[] args) {
        System.out.println("interface.main");
        main1("33");
    }

    public static void main1(String... args) {
        System.out.println("interface.main1 (static)");
    }

    private static void main2(String... args) {
        System.out.println("interface.main2 (private)");
    }

    default void main3(String... args) {
        System.out.println("interface.main3 (default)");
    }
}
