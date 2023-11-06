package org.gordeyvasilev;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fifth {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<String>();

        lines.add("A");
        lines.add(new String("B"));
        lines.add(String.valueOf("C"));

        System.out.println(lines);

        String[] arr1 = new String[2];
        String[] arr2 = new String[3];
        String[] arr3 = new String[4];

        String[] arr1_ = arr1;
        String[] arr2_ = arr2;
        String[] arr3_ = arr3;

        arr1 = lines.toArray(arr1);
        arr2 = lines.toArray(arr2);
        arr3 = lines.toArray(arr3);

        System.out.println(arr1);
        System.out.println(arr2);
        Arrays.stream(arr3).forEach(System.out::print);

        System.out.println();
        System.out.println(arr1 == arr1_);
        System.out.println(arr2 == arr2_);
        System.out.println(arr3 == arr3_);
    }
}
