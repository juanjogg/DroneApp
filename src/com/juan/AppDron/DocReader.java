package com.juan.AppDron;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocReader {


    private String source;

    public DocReader(String source){
        this.source = source;
    }

    public List<String> readFile(){
        List<String> commands = new ArrayList<>();
        File file = new File(source);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                commands.add(line.toUpperCase());
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return commands;
    }
}
