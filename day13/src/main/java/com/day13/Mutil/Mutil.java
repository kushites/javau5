package com.day13.Mutil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Mutil {
		private static EntityManagerFactory emf;
		
		static {
			emf = Persistence.createEntityManagerFactory("EmployeeUnit");
			
		}
		public static EntityManager getem() {
			return emf.createEntityManager();
		} 
}
