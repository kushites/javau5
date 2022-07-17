package com.day10.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Mavenutil {
			public static EntityManagerFactory emf;
			static {
				emf = Persistence.createEntityManagerFactory("EmployeeUnit");
			}
			public static EntityManager getcon() {
				return emf.createEntityManager();
			}
}
