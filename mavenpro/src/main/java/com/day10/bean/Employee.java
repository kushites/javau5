package com.day10.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Employee")
public class Employee {
		@Id
		private int empid;
		private String name;
		private String address;
		private int salary;
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public Employee(int empid, String name, String address, int salary) {
			super();
			this.empid = empid;
			this.name = name;
			this.address = address;
			this.salary = salary;
		}
		public Employee() {
			
		}
}
