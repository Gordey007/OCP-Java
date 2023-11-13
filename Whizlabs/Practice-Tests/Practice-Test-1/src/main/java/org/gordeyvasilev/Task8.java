package org.gordeyvasilev;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task8 {
    public static void main(String[] args) {
        get(1);

        for (int i = 0; i < 10; i++) {
            continue;
            // System.out.println(""); // error because of the compiler.
        }
    }

    public static Object get(int i) {
        if (i == 0)
            return new Object();
        if (i == 1)
            return new String("");
        else
            return new String("");
    }

    // error because no work with files
//    public static IOException t(){
//        try {
//            System.out.println("Task8");
////            byte[] bytes = Files.readAllBytes(Paths.get("Java/Java-8/Stream-API/src/main/resources/input"));
//            // return new IOException();
//        } catch (FileNotFoundException e) {
//            return new FileNotFoundException();
//        }
//        return null;
//    }
}
