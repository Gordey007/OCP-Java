package org.gordeyvasilev;

public class B extends A{
    static void sv(){
        System.out.println("B.sv");

        try{
            System.out.println("try");
        } catch(Exception e) {
            System.out.println("catch");
        }

        try{
            System.out.println("try2");
        } finally {
            System.out.println("finally");
        }
    }

//    static final void sfv(){
//        System.out.println("B.sv");
//    }
}
