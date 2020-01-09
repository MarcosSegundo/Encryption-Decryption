package com.encryptdecrypt.factory;

import com.encryptdecrypt.stategy.CesarCypher;
import com.encryptdecrypt.stategy.CryptoContext;
import com.encryptdecrypt.stategy.UnicodeCrypto;

public class CryptoAlgorithmStaticFactory {

    public static CryptoContext create(String algorithm){

        switch (algorithm){
            case "":
            case "shift": return new CryptoContext(new CesarCypher());
            case "unicode": return new CryptoContext(new UnicodeCrypto());
            default: return null;
        }
    }
}
