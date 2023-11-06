package org.gordeyvasilev;

public class First {
    public static void main(String[] args) {
        // 16 + 4
        StringBuilder sb = new StringBuilder("abcd");
        StringBuilder sb2 = new StringBuilder(10);

        System.out.println(sb.capacity() + sb2.capacity());
    }
}
