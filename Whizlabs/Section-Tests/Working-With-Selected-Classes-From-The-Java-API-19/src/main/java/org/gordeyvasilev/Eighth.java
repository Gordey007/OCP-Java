package org.gordeyvasilev;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Eighth {
    public static void main(String[] args) {
        System.out.println(LocalDate.of(2015, 2, 27)
                .plusDays(3).getMonth());
    }
}
