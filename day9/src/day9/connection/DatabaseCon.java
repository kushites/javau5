package day9.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseCon {
			public static Connection giveconnnection() {
				Connection con =null;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				}
				catch(ClassNotFoundException cnf) {
					System.out.println(cnf.getMessage());
				}
				String cs = "jdbc:mysql://localhost:3306/db3";
				
				try {
					con = DriverManager.getConnection(cs,"root","sanjay%%");
					
				}catch (SQLException se) {
					System.out.println(se.getMessage());
				}
				return con;
				
			} 
}
