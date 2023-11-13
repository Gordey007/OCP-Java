package org.gordeyvasilev;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] i1 = {0, 1};
        int[] i2 = {0, 1};

        int[][] i3 = {{1}, {1}};
        int[][] i4 = {{1}, {1}};

        int[][][] i5 = {{{1}, {1}, {1}}};
        int[][][] i6 = {{{1}, {1}, {1}}};

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        System.out.println(Arrays.equals(i1, i2));
//        System.out.println(Arrays.deepEquals(i1, i2));

        System.out.println(Arrays.equals(i3, i4));
        System.out.println(Arrays.deepEquals(i3, i4));

        System.out.println(Arrays.deepEquals(i5, i6));
    }
}
