package org.gordeyvasilev;

import java.util.Arrays;

public class Task32 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5}};

        for (int[] a: arr) System.out.println(Arrays.toString(a));
        // for (int a: arr) System.out.println(a); // error
    }
}
