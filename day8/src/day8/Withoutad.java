package day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Withoutad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the empid.:-");
		int empid = sc.nextInt();
		System.out.println("Enter the name:-");
		String name = sc.next();

		
		System.out.println("Enter the salary:-");
		int salary = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String cs = "jdbc:mysql://localhost:3306/db2";

		try {
		 Connection conn= DriverManager.getConnection(cs,"root","sanjay%%");	
		
		 PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?,?)");
		 ps.setInt(1, empid);
		 ps.setString(2, name);
		 ps.setString(3, null);
		 ps.setInt(4, salary);
		 int x = ps.executeUpdate();
		
		 if(x >0 ) {
			 System.out.println("inserted..");
		 }
		 else {
			 System.out.println("not inserted");
		 }
		
		}catch(SQLException ex) {
			ex.printStackTrace();
		}

	}
}
