package day9.uses;

import day9.bean.Employee;
import day9.dao.Employeedao;
import day9.dao.Employeedaoimpl;
import day9.exceptions.Employeexception;

public class Insertwithoutid {

	public static void main(String[] args) {
		Employeedao edao = new Employeedaoimpl();
		Employee e = new Employee();
		e.setEid(4);
		e.setName("ravi");
		e.setAddress(null);
		e.setSalary(40000);
		try {
			String ms = edao.insertemployee2(e);
			System.out.println(ms);
		} catch (Employeexception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

	}

}
