package com.ans1;

import java.io.*;

public class Readerc {
    public static void main(String[] args) {
        File f = new File("abc.txt");
        try {
            f.createNewFile();


        BufferedReader bf=new BufferedReader(new FileReader("abc.txt"));

        String l = bf.readLine();
        while(l!=null){
            System.out.println(l);
            l= bf.readLine();

        }
        bf.close();

        }
        catch(IOException e){
            System.out.println("input out error");
        }
        catch(Exception e){
            System.out.println("error");
        }
    }


}
