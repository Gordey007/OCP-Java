package org.gordeyvasilev.second;

public interface I {

    static final public int i = 0;

    abstract public void i();

    public default void pdv(){
        System.out.println("pdv");
    }
}