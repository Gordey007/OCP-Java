package org.gordeyvasilev;

public class Seventh {
    public static void main(String[] args) {
        try {
            print("1.0");
        } catch (Exception e) {
            System.out.println("C");

            System.out.println(e.getMessage());
           // throw new RuntimeException(e);
        }
    }

    /**
     * throws - needs to be processed if the method is called.
     * */
    public static void print(String s) throws Exception {
        try {
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException exp) {
            System.out.println("A NumberFormatException");
            throw new Exception("NumberFormatException-Exception", new Exception());
        } finally {
            System.out.println("B finally");
        }
    }
}
