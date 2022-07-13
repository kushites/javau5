package day9.uses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day9.bean.Employee;
import day9.dao.Employeedao;
import day9.dao.Employeedaoimpl;
import day9.exceptions.Employeexception;

public class Salarybyid {
		public static void main(String[] args) {
			Employeedao edao = new Employeedaoimpl();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the employee id to get salary: ");
			int id = sc.nextInt();
			int em=0;
			try {
				em = edao.searchbysal(id);
			} catch (Employeexception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			if(em!=0) {
				System.out.println(em);
			}
			
		}
}
