package org.gordeyvasilev;

public class Eleventh {
    public static void main(String[] args) {
        StringBuilder buf = new StringBuilder("123456789");

        char[] ch = new char[6];

        ch[0] = 'A';
        ch[1] = 'B';

        buf.getChars(1, 5, ch, 1);

        System.out.println(ch);
    }
}
