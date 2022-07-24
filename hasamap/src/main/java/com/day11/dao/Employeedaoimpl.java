package com.day11.dao;

import javax.persistence.EntityManager;

import com.day11.bean.Employee;
import com.day11.util.MUtil;

public class Employeedaoimpl implements Employeedao {

	
	

	@Override
	public String insertemployee(Employee emp) {
		String ms = "not updated";
		EntityManager em = MUtil.getEm();
		em.getTransaction().begin();
		em.persist(emp);
		ms = "Updated";
		em.getTransaction().commit();
		
		
		return ms;
	}

}
