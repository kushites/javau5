package day9.uses;

import java.util.List;

import day9.bean.Employee;
import day9.dao.Employeedao;
import day9.dao.Employeedaoimpl;
import day9.exceptions.Employeexception;

public class Getallemp {
			public static void main(String[] args) {
				Employeedao em = new Employeedaoimpl();
				try {
					List<Employee> ls =em.getallstudent();
					System.out.println(ls);
				} catch (Employeexception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			}
}
