package day7.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Jdbc {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the empid.:-");
		int empid = sc.nextInt();
		System.out.println("Enter the name:-");
		String name = sc.next();
		System.out.println("Enter the address:-");
		String address = sc.next();
		System.out.println("Enter the salary:-");
		int salary = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String cs = "jdbc:mysql://localhost:3306/db1";

		try {
		 Connection conn= DriverManager.getConnection(cs,"root","sanjay%%");	
		
		 Statement st= conn.createStatement();
		 
		 int x= st.executeUpdate("insert into employee values("+empid+",'"+name+"','"+address+"',"+salary+");");
		 
		 if(x >0 )
			 System.out.println("inserted..");
		 else
			 System.out.println("not inserted");
		 
		
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}

}
