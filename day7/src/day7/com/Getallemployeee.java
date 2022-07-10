package day7.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Getallemployeee {
		public static void main(String[] args) {
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
			 
			 ResultSet rs = st.executeQuery("select * from employee");
			 
			 while(rs.next()) {
				 int empid = rs.getInt("eid");
				 String name = rs.getString("name");
				 String address= rs.getString("address");
				 int salary = rs.getInt("salary");
				 System.out.println("Employee id: "+ empid);
				 System.out.println("Employee name: "+name);
				 System.out.println("Employee address: "+address);
				 System.out.println("Employee name: "+salary);
				 System.out.println("---------------------------------");
			 }
			 
			
			}catch(SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
}
