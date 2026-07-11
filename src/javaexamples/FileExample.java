package javaexamples;

import java.io.File;

public class FileExample {

    public static void main(String[] args) {

        File file = new File("config.properties");

        System.out.println(file.exists());
    }
}