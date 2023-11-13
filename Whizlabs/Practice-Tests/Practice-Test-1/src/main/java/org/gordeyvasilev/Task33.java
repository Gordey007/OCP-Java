package org.gordeyvasilev;

public class Task33 {
    public static void main(String[] args) {
        // for(int i = 0, int j =0;;); // error
        for (int i = 0, j = 0; i++ < 4; ) ;
        int x = 0;
        for (int i = 0; i < 3;
             i++,
                     System.out.println(i),
                     System.out.println("rr"),
                     printError(),
                     System.out.println("")
        )
        ;
    }


    static void printError() {
        int i = 0;
        switch (i) {
            case 0:
                System.out.println("0");
                break;
        }
        System.out.println("Error");
    }
}
