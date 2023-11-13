package org.gordeyvasilev;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get("Java/Java-8/Stream-API/src/main/resources/input"));

        String contents = new String(bytes, StandardCharsets.UTF_8);

        List<String> words = Arrays.asList(contents.split(" "));

        long cnt = words.stream().filter(w -> w.length() > 6).map(x -> x + "3").count();

        System.out.println(cnt);
    }
}