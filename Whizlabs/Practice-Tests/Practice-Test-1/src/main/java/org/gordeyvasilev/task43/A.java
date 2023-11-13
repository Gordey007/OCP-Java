package org.gordeyvasilev.task43;

abstract class A extends B{
    abstract protected String getName();

    B b = new B();
    protected void setName(){
        name();
    }
}
