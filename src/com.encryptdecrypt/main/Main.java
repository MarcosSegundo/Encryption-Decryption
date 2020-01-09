package com.encryptdecrypt.main;

import com.encryptdecrypt.stategy.CryptoContext;
import com.encryptdecrypt.util.OptionsHandler;

import static com.encryptdecrypt.factory.CryptoAlgorithmStaticFactory.create;
import static com.encryptdecrypt.util.DataHandler.getData;
import static com.encryptdecrypt.util.OutputHandler.out;
import static com.encryptdecrypt.util.ResulDataHandler.getResultData;

public class Main {

    public static void main(String[] args) {

        OptionsHandler options = new OptionsHandler(args);

        //Dados selecionados conforme a entrada.
        String input = getData(options.getData(), options.getIn());

        CryptoContext cryptoContext = create(options.getAlg());

        //Dados Encriptados ou Decriptados conforme o modo selecionado.
        String resultData = getResultData(options.getMode(), cryptoContext, input, options.getKey());

        //Saída dos dados conforme opção do usuário.
        out(options.getOut(), resultData);
    }
}
