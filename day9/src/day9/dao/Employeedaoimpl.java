package day9.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.JdbcConnection;

import day9.bean.Employee;
import day9.connection.DatabaseCon;
import day9.exceptions.Employeexception;

public class Employeedaoimpl implements Employeedao {

	@Override
	public String insertemployee(Employee emp) {
		String msg = "not inserted";
		try(Connection con = DatabaseCon.giveconnnection()){
			
		PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?)");
		ps.setInt(1, emp.getEid());
		ps.setString(2, emp.getName());
		ps.setString(3, emp.getAddress());
		ps.setInt(4, emp.getSalary());
		int x = ps.executeUpdate();
		if(x>0) {
			msg = "data inserted";
		}
		else {
			msg="not inserted";
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			msg =e.getMessage();
		}
		
		return msg;
	}

	@Override
	public List<Employee> getallstudent() throws Employeexception {
		List<Employee> ls = new ArrayList<>();
		try(Connection con = DatabaseCon.giveconnnection()){
			try {
				PreparedStatement ps = con.prepareStatement("select * from employee");
				ResultSet rs=ps.executeQuery();
			
				while(rs.next()) {
					Employee e = new Employee(rs.getInt("eid"),rs.getString("name"),rs.getString("address"),rs.getInt("salary"));
					ls.add(e);
				}
				return ls;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return ls;
		
	}

	@Override
	public boolean givebonus(int bonus) {
		try(Connection con = DatabaseCon.giveconnnection()){
			try {
				PreparedStatement ps = con.prepareStatement("select name,salary+? salary_bonus from employee");
				ps.setInt(1, bonus);
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					return true;
				}
				else {
					return false;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		return false;
		
	}

	@Override
	public String insertemployee2(Employee emp) {
		String msg = "not inserted";
		try(Connection con = DatabaseCon.giveconnnection()){
			
		PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?)");
		ps.setInt(1, emp.getEid());
		ps.setString(2, emp.getName());
		ps.setString(3, emp.getAddress());
		ps.setInt(4, emp.getSalary());
		int x = ps.executeUpdate();
		if(x>0) {
			msg = "data inserted";
		}
		else {
			msg="not inserted";
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			msg =e.getMessage();
		}
		
		return msg;
	}

	@Override
	public Employee searchbyid(int id) throws Employeexception {
		try(Connection con = DatabaseCon.giveconnnection()){
			try {
				PreparedStatement ps = con.prepareStatement("select * from employee where eid=?");
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					Employee e = new Employee(rs.getInt("eid"),rs.getString("name"),rs.getString("address"),rs.getInt("salary"));
					return e;
				}
				else {
					System.out.println("not employee found");
				}
			} catch (SQLException e) {
				
				new Employeexception(e.getMessage());
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			new Employeexception(e1.getMessage());
		}
		return null;
	}



	@Override
	public int searchbysal(int id) throws Employeexception {
		try(Connection con = DatabaseCon.giveconnnection()){
			PreparedStatement ps = con.prepareStatement("select salary from employee where eid =?");
			ps.setInt(1, id);
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				int s = rs.getInt("salary");
				return s;
			}
			else {
				throw new Employeexception("data not found");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new Employeexception(e.getMessage());
		}
		
	}

	@Override
	public List<Employee> getPartiem() throws Employeexception {
		List<Employee> ls = new ArrayList<>();
		try(Connection con = DatabaseCon.giveconnnection()){
			try {
				PreparedStatement ps = con.prepareStatement("select * from employee where salary <80000");
				ResultSet rs=ps.executeQuery();
			
				while(rs.next()) {
					Employee e = new Employee(rs.getInt("eid"),rs.getString("name"),rs.getString("address"),rs.getInt("salary"));
					ls.add(e);
				}
				return ls;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return ls;
		
	}

}
