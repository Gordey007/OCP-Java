package org.gordeyvasilev.tenth;

public interface I {
    public final int fi = 0;

    // final private int fi = 0; // error

    // final protected int fpi = 0; // error

    public abstract void v();

    public static void sv(){
        System.out.println("sv");
    }

    public default void dv(){
        System.out.println("dv");
        v2();
    }

    private void v2() {
        System.out.println("I.v2");
    }
}
