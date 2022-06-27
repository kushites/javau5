package com.ans1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadNio {
    public static void main(String[] args) {
       try{
           Path p = Paths.get("abc.txt");
           List<String> list = Arrays.asList("delhi", "mumbai", "bangalore", "bhopal");
           Files.write(p,list);
           List <String>ans= Files.readAllLines(p);
           for(String a :ans){
               System.out.println(a);
           }
       }
       catch(IOException e){
           System.out.println("error");
       }

        
    }
}
