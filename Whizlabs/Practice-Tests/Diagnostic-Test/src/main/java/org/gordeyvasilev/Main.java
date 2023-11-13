package org.gordeyvasilev;


public class Main {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.si);
        System.out.println(B.si);
        System.out.println(A.si);

        A.si = 2;
        System.out.println(b.si);
        System.out.println(B.si);
        System.out.println(A.si);

        B.si = 3;
        System.out.println(b.si);
        System.out.println(B.si);
        System.out.println(A.si);

        b.si = 4;
        System.out.println(b.si);
        System.out.println(B.si);
        System.out.println(A.si);
    }
}

