package com.day10.uses;

import java.util.List;

import com.day10.bean.Employee;
import com.day10.dao.Employeedao;
import com.day10.dao.Employeedaoimpl;

public class GetAllEmp {

	public static void main(String[] args) {
		Employeedao edao = new Employeedaoimpl();
		List<Employee>list =  edao.getAllEmployee();
		for(int i=0; i<list.size(); i++) {
			System.out.println( "Employee id: "+list.get(i).getEmpid());
			System.out.println( "Employee name: "+list.get(i).getName());
			System.out.println( "Employee address: "+list.get(i).getAddress());
			System.out.println( "Employee salary: "+list.get(i).getSalary());
			System.out.println("==================================================");
		}
	}

}
