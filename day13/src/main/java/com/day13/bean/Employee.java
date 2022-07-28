package com.day13.bean;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity

public class Employee extends Person {
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="city", column=@Column(name="homecity")),
		@AttributeOverride(name="state", column=@Column(name="homestate")),
		@AttributeOverride(name="pincode", column=@Column(name="homepin"))
	})
			
	private Address homeAddress;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="city", column=@Column(name="Officecity")),
		@AttributeOverride(name="state", column=@Column(name="Officestate")),
		@AttributeOverride(name="pincode", column=@Column(name="Officepin"))
	})
	private Address officeAddress; 
	private int salary;
	
	
	
	public Employee() {
	
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}	
	
	
}
