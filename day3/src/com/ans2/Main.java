package com.ans2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Address ad = new Address();
        ad.setState("mp");
        ad.setCity("bhopal");
        ad.setPincode("462010");
        Student  s = new Student(121, "sanjay",ad,"sanjay@gmail.com","sanjay%%");
        File f = new File("student.txt");
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
            oos.flush();
            oos.close();
            fos.close();
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s1 = (Student) ois.readObject();
            System.out.println("Student roll: "+s1.getRoll());
            System.out.println("Student name: "+s1.getName());
            System.out.println("Student email: "+s1.getEmail());
            System.out.println("Student pass: "+s1.getPassword());
            System.out.println("Student State: "+s1.address.getState());
            System.out.println("Student city: "+s1.address.getCity());
            System.out.println("Student pin: "+s1.address.getPincode());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
