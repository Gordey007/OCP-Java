package org.gordeyvasilev;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Seventh {
    public static void main(String[] args) {
        LocalDate ld =  LocalDate.of(-1,1,1);

        LocalDateTime ldt = ld.atTime(10, 10);

        System.out.println(ld);
        System.out.println(ldt);

        // Error because mouth 1-12
        // LocalDate ld1 = LocalDate.of(-1,-1,1);
        // System.out.println(ld1);
    }
}
