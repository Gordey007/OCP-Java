package org.gordeyvasilev;

import java.util.ArrayList;
import java.util.List;

public class Sixth {
    public static void main(String[] args) {
        List numbersWow = new ArrayList(1);

//        List<> numbersWow1 = new ArrayList();
        // non-generalized collection.
        List numbersWow2 = new ArrayList<>();
        numbersWow2.add(1);
        numbersWow2.add("2");
//        numbersWow2.add(new Integer(4));
        numbersWow2.add(new String("4"));
        numbersWow2.add(new Object());
        System.out.println(numbersWow2.get(1));

        // error because Object
        // System.out.println(Integer.max(numbersWow2.get(1), 2));

        List<Integer> numbers = new ArrayList<>();
    }

    // error
//    void v(int x){
//        int x = 3;
//    }
}
