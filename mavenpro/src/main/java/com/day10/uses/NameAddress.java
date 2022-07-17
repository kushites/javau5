package com.day10.uses;

import java.util.Arrays;

import com.day10.dao.Employeedao;
import com.day10.dao.Employeedaoimpl;

public class NameAddress {
			public static void main(String[] args) {
				Employeedao edao = new Employeedaoimpl();
				
				String []arr=edao.getNameAndAddress(2);
				System.out.println(Arrays.toString(arr));
				
			}
}
