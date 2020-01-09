package com.encryptdecrypt.util;

public class OutputHandler {

    public static void out(String path, String data) {

        if (path.isEmpty()) {
            System.out.println(data);
        } else {
            FileHandler fileHandler = new FileHandler();
            fileHandler.writeFile(path, data);
        }
    }
}
