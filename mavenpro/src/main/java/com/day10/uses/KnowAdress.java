package com.day10.uses;

import com.day10.dao.Employeedao;
import com.day10.dao.Employeedaoimpl;

public class KnowAdress {

	public static void main(String[] args) {
		Employeedao edao = new Employeedaoimpl();
		String address=	edao.getAddressOfEmployee(1);
		System.out.println("Employee addresss: "+address);
	}

}
