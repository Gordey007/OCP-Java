package org.gordeyvasilev.tenth;

public class B extends A implements I {

    // Error because default constructor not exists.
    // Employee(String s){
    //     System.out.println(s);
    // }

    @Override
    public void v() {
        System.out.println("Employee.v()");
    }
}
