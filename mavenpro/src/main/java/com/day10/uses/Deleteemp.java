package com.day10.uses;

import com.day10.dao.Employeedao;
import com.day10.dao.Employeedaoimpl;

public class Deleteemp {

	public static void main(String[] args) {
		Employeedao edao = new Employeedaoimpl();
		
		boolean f =edao.deleteEmployee(3);
		
		System.out.println(f);
	}

}
