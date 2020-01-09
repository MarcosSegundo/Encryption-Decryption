package com.encryptdecrypt.stategy;

public interface CryptoStrategy {

    String encrypto(String data, int key);

    String decrypto(String data, int key);
}
