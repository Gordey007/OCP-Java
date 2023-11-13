package org.gordeyvasilev;

public class Task27 {
    public static void main(String[] args) {
        int y = 5;
        if (false && y-- > 0)
            System.out.println(y);
        else if (true || y-- == 6)
            System.out.println(y);
        else
            ;

        if (true | y-- > 0)
            System.out.println(y);

        String s = "2";

        if (s == "2"){
            System.out.println(s);
        }
    }
}
