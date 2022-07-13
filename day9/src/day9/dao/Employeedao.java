package day9.dao;

import java.util.List;

import day9.bean.Employee;
import day9.exceptions.Employeexception;

public interface Employeedao {
		public String insertemployee(Employee emp);
		
		public List<Employee> getallstudent()throws Employeexception;
		
		public boolean givebonus(int bonus);
		
		public String insertemployee2(Employee emp)throws Employeexception;
		
		public Employee searchbyid(int id)throws Employeexception;
		
		public int searchbysal(int id)throws Employeexception;
		
		public List<Employee>getPartiem()throws Employeexception;
}
