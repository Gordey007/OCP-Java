package org.gordeyvasilev.task42.a1;

import org.gordeyvasilev.task42.a2.A2;

// import org.gordeyvasilev.task42.a2.I2;
// implements I2
public class M2 extends A1 implements I1, I3 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.pubv1();
        a1.prv1();
        a1.defv1();

        A2 a2 = new A2();
        a2.pubv2();

        // a2.prv2(); // error
        // a2.defv2(); // error

        M2 m1 = new M2();
        m1.pubv1();
        m1.prv1();
        m1.defv1();
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
