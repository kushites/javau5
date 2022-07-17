package com.day10.uses;

import com.day10.dao.Employeedao;
import com.day10.dao.Employeedaoimpl;

public class GiveBonus {

	public static void main(String[] args) {
		Employeedao edao = new Employeedaoimpl();
		String msg=edao.giveBonusToEmployee(2, 5000);
		System.out.println(msg);
		

	}

}
