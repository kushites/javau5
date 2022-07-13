package day9.uses;

import day9.bean.Employee;
import day9.dao.Employeedao;
import day9.dao.Employeedaoimpl;
import day9.exceptions.Employeexception;

public class Searchbyid {
		public static void main(String[] args) {
			Employeedao edao = new Employeedaoimpl();
			Employee e;
			try {
				e = edao.searchbyid(1);
				System.out.println(e);
			} catch (Employeexception e1) {
				// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
			}
			
		}
}
