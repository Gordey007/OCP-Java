package org.gordeyvasilev;

import java.util.ArrayList;
import java.util.List;

public class Second {
    public static void main(String[] args) {
        List<Integer> i = new ArrayList<Integer>();

        i.add(1);
        i.add(3);
        i.add(4);
        i.add(2, 3); // similarly in sb.insert(2, 3l)

        i.removeIf(e -> e < 3);

        System.out.println(i);
    }
}
