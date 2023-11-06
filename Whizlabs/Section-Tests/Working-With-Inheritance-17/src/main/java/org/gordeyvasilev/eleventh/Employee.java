package org.gordeyvasilev.eleventh;

public class Employee extends Person {

    Employee(String s) {
        super(" ");
        System.out.println(s);
    }

    Employee() {
        this("kent");
        // super("Kent");
        // System.out.println("Employee ()");
        // super("") // error because need top row.
    }
}
