package day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Searchbyid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the empid.:-");
		int id = sc.nextInt();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String cs = "jdbc:mysql://localhost:3306/db2";

		try {
		 Connection conn= DriverManager.getConnection(cs,"root","sanjay%%");	
		
		 PreparedStatement ps = conn.prepareStatement("select * from employee where eid=?");
		 ps.setInt(1, id);
		 ResultSet rs = ps.executeQuery();
		 
		 if(rs.next()) {
			 int empid = rs.getInt("eid");
			 String name = rs.getString("name");
			 String ad = rs.getString("address");
			 int salary = rs.getInt("salary");
			 System.out.println("Employee id: "+empid);
			 System.out.println("Employee name: "+name);
			 System.out.println("Employee address: "+ad);
			 System.out.println("Employee salary: "+salary);
		 }
		 
		
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
