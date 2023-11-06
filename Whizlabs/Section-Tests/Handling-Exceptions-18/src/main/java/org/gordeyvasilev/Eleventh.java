package org.gordeyvasilev;

public class Eleventh {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (NullPointerException e) { // Not
            System.out.println("NullPointerException");
            System.out.println(1 / 0);
        } catch (Exception e) {
            System.out.println("Exception");
            System.out.println(1 / 0);
        } finally {
            System.out.println("finished");
        }
    }
}
