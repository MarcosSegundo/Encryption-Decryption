package com.encryptdecrypt.stategy;

public class CesarCypher implements CryptoStrategy {

    @Override
    public String encrypto(String data, int key) {

        StringBuilder builder = new StringBuilder();

        for(char letter: data.toCharArray()) {

            if (Character.isAlphabetic(letter) && Character.isUpperCase(letter)) {
                builder.append((char)((letter + key - 'A') % 26 + 'A'));
            } else if (Character.isAlphabetic(letter) && Character.isLowerCase(letter)) {
                builder.append((char)((letter + key - 'a') % 26 + 'a'));
            } else {
                builder.append(letter);
            }
        }

        return builder.toString();
    }

    @Override
    public String decrypto(String data, int key) {

        StringBuilder builder = new StringBuilder();

        for(char letter: data.toCharArray()) {

            if (Character.isAlphabetic(letter) && Character.isUpperCase(letter)) {
                builder.append((char)((letter + 26 - key - 'A') % 26 + 'A'));
            } else if (Character.isAlphabetic(letter) && Character.isLowerCase(letter)){
                builder.append((char)((letter + 26 - key - 'a') % 26 + 'a'));
            } else {
                builder.append(letter);
            }
        }

        return builder.toString();
    }
}
