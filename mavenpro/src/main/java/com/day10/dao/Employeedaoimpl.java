package com.day10.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.transaction.Transaction;
import javax.transaction.Transactional;

import com.day10.bean.Employee;
import com.day10.util.Mavenutil;

public class Employeedaoimpl implements Employeedao{

	/**
	 *
	 */
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployee() {
	EntityManager em	= Mavenutil.getcon();
		
		Query  q = em.createQuery("From Employee",Employee.class);
		List<Employee> list = q.getResultList();
		em.close();
		return list;
		
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		String msg = "not found";
		EntityManager em = Mavenutil.getcon();
		EntityTransaction t = null;
		t = em.getTransaction();
		t.begin();
		Employee e =em.find(Employee.class, empId);
		t.commit();
		em.close();
		return e.getAddress();
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		String msg = "not found";
		EntityManager em = Mavenutil.getcon();
		Employee e = em.find(Employee.class, empId);
		if(e!=null) {
		em.getTransaction().begin();
		e.setSalary(e.getSalary()+bonus);
		em.persist(e);
		em.getTransaction().commit();
		msg="Bonus is given";
		}
		
		return msg;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		
		boolean msg = false;
		EntityManager em = Mavenutil.getcon();
		Employee e = em.find(Employee.class, empId);
		if(e!=null) {
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
		msg=true;
		}
		
		return msg;
	}

	@Override
	public String[] getNameAndAddress(int empId) {
		String [] arr = new String[2];
		EntityManager em = Mavenutil.getcon();
		EntityTransaction t = null;
		t = em.getTransaction();
		t.begin();
		Employee e =em.find(Employee.class, empId);
		if(e!=null) {
			arr[0]=e.getName();
			arr[1]=e.getAddress();
		}
		t.commit();
		em.close();
		return arr;
		
	}

}
