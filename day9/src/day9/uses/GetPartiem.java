package day9.uses;

import java.util.List;

import day9.bean.Employee;
import day9.dao.Employeedao;
import day9.dao.Employeedaoimpl;
import day9.exceptions.Employeexception;

public class GetPartiem {
		public static void main(String[] args) {
			Employeedao edao = new Employeedaoimpl();
			List<Employee> ls;
			try {
				ls = edao.getPartiem();
				System.out.println(ls);
			} catch (Employeexception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
}
