package org.gordeyvasilev.task42.a1;

import org.gordeyvasilev.task42.a2.A2;

// import org.gordeyvasilev.task42.a2.I2;
// implements I2
public class M extends A2 implements I1, I3 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.pubv1();
        a1.prv1();
        a1.defv1();

        A2 a2 = new A2();
        a2.pubv2();

        // a2.prv2(); // error
        // a2.defv2(); // error

        M m1 = new M();
        m1.pubv2();
        m1.prv2();
        // m1.defv2(); // because in another package.
    }

    /**
     *
     */
    @Override
    public void df1() {
        I1.super.df1();
    }

    /**
     *
     */
    @Override
    public void df3() {
        I3.super.df3();
    }
}
