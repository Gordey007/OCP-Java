package org.gordeyvasilev;

public class Task {
    public static void main(String[] args) {
        double a = 1, b = 0, c = 2;

        System.out.println(2 % 0.0);
        System.out.println(1 / 0.0);
        System.out.println(-1 / 0.0);

        double mod1 = a % b, mod2 = b % c;

        double result = mod1 > mod2 ? mod1 : mod2;

        System.out.println(result);
    }
}
