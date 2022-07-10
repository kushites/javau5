package day7.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Searchwithid {
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
		String cs = "jdbc:mysql://localhost:3306/db1";

		try {
		 Connection conn= DriverManager.getConnection(cs,"root","sanjay%%");	
		
		 Statement st= conn.createStatement();
		 
		 ResultSet rs = st.executeQuery("select * from employee where eid="+id+"");
		 
		 if(rs.next()) {
			 
			 int empid = rs.getInt("eid");
			 String name = rs.getString("name");
			 String address= rs.getString("address");
			 int salary = rs.getInt("salary");
			 System.out.println("Employee id: "+ empid);
			 System.out.println("Employee name: "+name);
			 System.out.println("Employee address: "+address);
			 System.out.println("Employee name: "+salary);
		 }
		 else {
			 System.out.println("employee not exist");
		 }
		 
		
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}

	} 

}
