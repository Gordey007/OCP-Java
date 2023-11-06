package org.gordeyvasilev;

import java.time.Period;

public class Ninth {
    public static void main(String[] args) {
        Period p = Period.ofMonths(13);
        Object o = new Object();
        System.out.println(p.normalized());
    }
}