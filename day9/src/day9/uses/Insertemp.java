package day9.uses;

import java.util.Scanner;

import day9.bean.Employee;
import day9.dao.Employeedao;
import day9.dao.Employeedaoimpl;

public class Insertemp {
	public static void main(String[] args) {
		Employeedao edao = new Employeedaoimpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roll: ");
		int roll = sc.nextInt();
		System.out.println("Enter the name: ");
		String name = sc.next();
		System.out.println("Enter the address: ");
		String address = sc.next();
		System.out.println("Enter the salary: ");
		int salary = sc.nextInt();
		Employee e = new Employee(roll,name,address,salary);
		String msg = edao.insertemployee(e);
		System.out.println(msg);
	}
	
	
	
}
