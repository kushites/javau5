package com.ans3;

import java.io.*;
import java.util.Scanner;

public class Countr {
    public static void main(String[] args) {
        File f = new File("input.txt");
        try {
            f.createNewFile();
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write("rlsjfljrr");
            bw.newLine();
            bw.write("rowsldfowjorsldf");
            bw.newLine();
            bw.write("rollercoaster");
            bw.newLine();
            bw.write("thisracecarisgood");
            bw.close();
            System.out.println("Enter the text file");
            Scanner sc = new Scanner(System.in);
            String search = sc.next();
            System.out.println("Enter the Character");
            char c =sc.next().charAt(0);
            FileReader fr = new FileReader(search);
            int r = fr.read();
            int ans =0;
            while(r!=-1){
                char se = (char) r;
                if(se==c){
                    ans++;
                }
                r=fr.read();
            }
            System.out.println("In "+search+" the "+c+" is "+ans+" times ");
            fr.close();
        }catch(Exception e){
            System.out.println("Error");
        }

    }
}
