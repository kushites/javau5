package day9.uses;

import day9.dao.Employeedao;
import day9.dao.Employeedaoimpl;

public class GiveBonus {
		public static void main(String[] args) {
			Employeedao edao = new Employeedaoimpl();
			boolean t =edao.givebonus(5000);
			System.out.println(t);
		}
}
