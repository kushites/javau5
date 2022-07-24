package com.day11.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MUtil {
		private static EntityManagerFactory emf;
		static {
			emf= Persistence.createEntityManagerFactory("EmployeeUnit1");
		}
		public static EntityManager getEm() {
			return emf.createEntityManager();
		}
}
