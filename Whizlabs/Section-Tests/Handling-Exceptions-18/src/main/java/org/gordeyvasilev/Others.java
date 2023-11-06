package org.gordeyvasilev;

public class Others {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        }
        catch (OutOfMemoryError e) {
                System.out.println("Throwable");
        } catch (Throwable e) {
            System.out.println("Throwable");
        }
        finally {
            System.out.println("finally 1");
            try {
                System.out.println(1/0);
            } catch (Exception e) {
                System.out.println("finally.Exception");
            }

            System.out.println("finally 2");
            System.out.println(1/0);
            System.out.println("finally 3");
        }
    }
}
