package org.gordeyvasilev;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        String[] list = {"r", "R"};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        ArrayList<String> gfg = new ArrayList<String>() {
            {
                add("Geeks");
                add("for");
                remove("for");
                add("Geeks");
            }
        };
    }
}
