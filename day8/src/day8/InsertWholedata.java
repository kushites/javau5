package day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertWholedata {
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
		String cs = "jdbc:mysql://localhost:3306/db2";

		try {
		 Connection conn= DriverManager.getConnection(cs,"root","sanjay%%");	
		
		 PreparedStatement st= conn.prepareStatement("insert into employee values(?,?,?,?)");
		 st.setInt(1, empid);
		 st.setString(2, name);
		 st.setString(3, address);
		 st.setInt(4, salary);
		 int result = st.executeUpdate();
		
		 if(result>0) 
		 {
			 System.out.println("inserted");
		 }
		 else {
			 System.out.println("not inserted");
		 }
		
		
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
