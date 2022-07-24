package com.day11.uses;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.day11.bean.Address;
import com.day11.bean.Employee;
import com.day11.dao.Employeedao;
import com.day11.dao.Employeedaoimpl;

public class Insertemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=2;
		Set <Address> address = new HashSet<>();
	    while(i!=0) {
		System.out.println("Enter the state");
		String state = sc.next();
		System.out.println("Enter the city: ");
		String city = sc.next();
		System.out.println("Enter the Pincode");
		String pin = sc.next();
		System.out.println("Enter the type: ");
		String type = sc.next();
		
		Address ad = new Address(state, city, pin, type);
		
		address.add(ad);
		i--;
	    }
		
		System.out.println("Enter the Empid: ");
		int empid = sc.nextInt();
		
		System.out.println("Enter the Emp name: ");
		String name = sc.next();
		
		System.out.println("Enter the Emp gender");
		String gender = sc.next();
		
		System.out.println("Enther Emp Salary");
		int salary = sc.nextInt();
		
		Employee emp = new Employee(empid, name, gender, salary, address);
		
		Employeedao dao = new Employeedaoimpl();
		
		dao.insertemployee(emp);
	

	}

}
