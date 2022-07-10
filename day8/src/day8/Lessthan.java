package day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Lessthan {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String cs = "jdbc:mysql://localhost:3306/db2";

	try {
	 Connection conn= DriverManager.getConnection(cs,"root","sanjay%%");	
	
	 PreparedStatement ps = conn.prepareStatement("select * from employee where salary<80000 ");
	
	 ResultSet rs = ps.executeQuery();
	 
	 while(rs.next()) {
		 int empid = rs.getInt("eid");
		 String name = rs.getString("name");
		 String ad = rs.getString("address");
		 int salary = rs.getInt("salary");
		 System.out.println("Employee id: "+empid);
		 System.out.println("Employee name: "+name);
		 System.out.println("Employee address: "+ad);
		 System.out.println("Employee salary: "+salary);
		 System.out.println("===================================");
	 }
	 
	
	}catch(SQLException ex) {
		System.out.println(ex.getMessage());
	}

}
}
