package com.encryptdecrypt.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandler {

    public String readFile(String path){

        File file = new File(path);
        StringBuilder builder = new StringBuilder();

        try(Scanner scanner = new Scanner(file)){
            while (scanner.hasNext())
                builder.append(scanner.nextLine());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return builder.toString();
    }

    public void writeFile(String path, String data){

        File file = new File(path);

        try(PrintWriter printWriter = new PrintWriter(file)){
            printWriter.println(data);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
