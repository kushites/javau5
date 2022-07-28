package com.day13.uses;

import javax.persistence.EntityManager;

import com.day13.Mutil.Mutil;
import com.day13.bean.Address;
import com.day13.bean.Employee;

public class Main {
		public static void main(String[] args) {
			EntityManager em = Mutil.getem();
			
			Employee e = new Employee();
			e.setPid(1);
			e.setName("sanjay");
			e.setSalary(25000);
			e.setHomeAddress(new Address("mp","bhopal","462010"));
			e.setOfficeAddress(new Address("kn","bangalore","62010"));
			
			em.getTransaction().begin();
			em.persist(e);
			em.getTransaction().commit();
			
			
		}
}
