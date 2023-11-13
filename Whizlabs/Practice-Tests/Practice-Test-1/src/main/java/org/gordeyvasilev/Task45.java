package org.gordeyvasilev;

public class Task45 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");
        StringBuilder sb1 = new StringBuilder("java");
        String s = new String("java");
        String s1 = "java";

        System.out.println(s1 == "java");

        System.out.println(sb == sb1);

        System.out.println(sb.equals(sb1));
        System.out.println(sb.equals(s));
        System.out.println(sb.equals(s1));

        System.out.println(sb.toString().equals(sb1));
        System.out.println(sb.toString().equals(sb1.toString()));

        System.out.println(sb.toString() == s1);
        System.out.println(sb.toString().intern() == s1);

        // System.out.println(sb.compareTo(sb1));
    }
}
