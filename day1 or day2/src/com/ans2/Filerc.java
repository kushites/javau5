package com.ans2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filerc {
    public static void main(String[] args) {
        try {
            File f = new File("abc.txt");
            FileReader fr = new FileReader(f);
            char [] chr = new char[(int)f.length()];
            fr.read(chr);
           for(char c : chr){
               System.out.print(c);
           }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
