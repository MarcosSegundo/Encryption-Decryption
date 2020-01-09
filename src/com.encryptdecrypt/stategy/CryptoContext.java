package com.encryptdecrypt.stategy;

public class CryptoContext {

    private CryptoStrategy cryptoStrategy;

    public CryptoContext(CryptoStrategy cryptoStrategy){
        this.cryptoStrategy = cryptoStrategy;
    }

    public String encripto(String data, int key){
        return this.cryptoStrategy.encrypto(data, key);
    }

    public String decrypto(String data, int key){
        return this.cryptoStrategy.decrypto(data, key);
    }
}
