package day7.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Bonus {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException cnf) {
			System.out.println(cnf.getMessage());
		}
		String cs = "jdbc:mysql://localhost:3306/db1";
		try {
			Connection conn = DriverManager.getConnection(cs,"root","sanjay%%");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select name,salary+500 from employee");
			while(rs.next()) {
				String name= rs.getString("name");
				int salary = rs.getInt("salary+500");
				System.out.println("Employee name: "+name);
				System.out.println("Employee Bonus: "+salary);
				System.out.println("============================================");
			}
			
			
		}catch(SQLException sq) {
			System.out.println(sq.getMessage());
		}
	}
	
}
