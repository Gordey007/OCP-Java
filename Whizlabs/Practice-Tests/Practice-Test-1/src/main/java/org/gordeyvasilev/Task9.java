package org.gordeyvasilev;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Task9 {
    public static void main(String[] args) {
        try {
            method();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }

    static void method() throws IOException {
        throw new FileNotFoundException();
    }
}
