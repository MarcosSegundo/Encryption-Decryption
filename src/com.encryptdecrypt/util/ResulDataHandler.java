package com.encryptdecrypt.util;

import com.encryptdecrypt.stategy.CryptoContext;

public class ResulDataHandler {

    public static String getResultData(String mode, CryptoContext cryptoContext, String data, int key){
        switch (mode){
            case "":
            case "enc": return cryptoContext.encripto(data, key);
            case "dec": return cryptoContext.decrypto(data, key);
            default: return null;
        }
    }
}
