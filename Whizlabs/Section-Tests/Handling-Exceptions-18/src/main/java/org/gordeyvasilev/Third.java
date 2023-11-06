package org.gordeyvasilev;

import java.io.IOException;

public class Third {
    static Integer i;

    public static void main(String[] args) {

        /**
         * When we are using multi-catch,
         * it is not allowed to specify two or more exceptions of the same hierarchy in the multi-catch statement.
         */
        try {
            System.out.println(i.doubleValue());
        }
        catch (IllegalAccessError | ArithmeticException e) {
            System.out.println(e.getClass().getSimpleName());
        }
//        catch (IllegalAccessError | RuntimeException e) {
//            System.out.println(e.getClass().getSimpleName());
//        }
//        catch (NullPointerException | IOException e) {
//            System.out.println(e.getClass().getSimpleName());
//        }
//        catch (RuntimeException | IOException e) {
//            System.out.println(e.getClass().getSimpleName());
//        }


        // Types in multi-catch must be disjoint:
        // 'java.lang.NullPointerException' is a subclass of 'java.lang.RuntimeException'
//        try {
//            System.out.println(i.doubleValue());
//        } catch (NullPointerException | RuntimeException e) {
//            System.out.println(e.getClass().getSimpleName());
//        } catch (ArithmeticException | RuntimeException e) {
//            System.out.println(e.getClass().getSimpleName());
//        }
    }
}
