package org.gordeyvasilev;

public class A {
    A() {
        System.out.println("4 Constructor A");
    }

    {
        System.out.println("3 Dynamic block A");
    }

    static int si;

    static {
        System.out.println("1 Static block A.1");
        System.out.println(si);
        si = 1;
    }

    static {
        System.out.println("2 Static block A.2");
        System.out.println(si);
    }
}
