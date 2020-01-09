package com.encryptdecrypt.util;

public class OptionsHandler {

    private String mode = "enc";
    private int key;
    private String data = "";
    private String in = "";
    private String out = "";
    private String alg = "";

    public OptionsHandler(String[] args){
        optionsInitializer(args);
    }

    private void optionsInitializer(String[] args){

        for (int i = 0; i < args.length; i += 2) {

            switch (args[i]) {
                case "-mode":
                    mode = args[i + 1]; break;
                case "-key":
                    key = Integer.parseInt(args[i + 1]); break;
                case "-data":
                    data = args[i + 1]; break;
                case "-in":
                    in = args[i + 1]; break;
                case "-out":
                    out = args[i + 1]; break;
                case "-alg":
                    alg = args[i + 1]; break;
            }
        }
    }

    public String getMode() {
        return mode;
    }

    public int getKey() {
        return key;
    }

    public String getData() {
        return data;
    }

    public String getIn() {
        return in;
    }

    public String getOut() {
        return out;
    }

    public String getAlg() {
        return alg;
    }
}
