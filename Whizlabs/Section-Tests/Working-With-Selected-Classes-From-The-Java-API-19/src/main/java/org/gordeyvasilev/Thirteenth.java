package org.gordeyvasilev;

public class Thirteenth {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("1234567");
        System.out.println();

        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity());
    }
}
