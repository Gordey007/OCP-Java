package org.gordeyvasilev;

public class Thirteenth {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            throw new RuntimeException("A");
        } catch (Exception e) {
            System.out.println("B");
        }
//        catch (RuntimeException e) { // Need up. RuntimeException, Exception.
//            System.out.println("C");
//        }
        finally {
            System.out.println("D");
        }
    }
}
