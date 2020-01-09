package com.encryptdecrypt.stategy;

public class UnicodeCrypto implements CryptoStrategy {

    @Override
    public String encrypto(String data, int key) {

        StringBuilder result = new StringBuilder();

        for (char item : data.toCharArray()) {
            char shiftItem = (char) (item + key);
            result.append(shiftItem);
        }

        return result.toString();
    }

    @Override
    public String decrypto(String data, int key) {

        StringBuilder result = new StringBuilder();

        for (char item : data.toCharArray()) {
            char shiftItem = (char) (item - key);
            result.append(shiftItem);
        }

        return result.toString();
    }
}
