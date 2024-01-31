package com.example.demo.java.io;
import java.io.*;
public class File {


    public class Main {
        public static void main(String[] args) {
            File file = new File("");
            try {
                if (!file.exists()) {
                    file.createNewFile();
                    System.out.println("Файл создан");
                } else {
                    System.out.println("Файл не создан.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
