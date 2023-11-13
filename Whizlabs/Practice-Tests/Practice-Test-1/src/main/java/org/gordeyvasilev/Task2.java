package org.gordeyvasilev;

import java.util.Collection;

public class Task2 {
    static long[][] arr1 = new long[0][];

    public static void main(String[] args) {
        arr1[0] = new long[0];
        System.out.println(arr1[0].length);
        System.out.println(arr1.length);

        long[][] arr2;
        long[] arr3 = {1, 2, 3};
        Object o = arr3;

        arr2 = new long[3][3];
        arr2[0] = (long[])o;
        arr2[0][0] = (long)o;

        System.out.println();
    }
}