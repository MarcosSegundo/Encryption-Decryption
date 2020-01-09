package com.encryptdecrypt.util;

public class DataHandler {

    public static String getData(String data, String in) {

        if (!data.isEmpty()) {
            return data;
        } else {
            FileHandler fileHandler = new FileHandler();
            return fileHandler.readFile(in);
        }
    }
}
