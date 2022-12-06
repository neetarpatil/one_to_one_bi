package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Neeta");
		// entity manager will perform crud operation
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person p1=new Person();
		p1.setEmail("xyz@gmail.com");
		p1.setName("Neeta");
		
		Pan pan=new Pan();
		pan.setPan_num(123456);
		
		p1.setPan(pan);//
		
		pan.setPerson(p1);//
		
		entityTransaction.begin();
		entityManager.persist(p1);
		entityManager.persist(pan);
		entityTransaction.commit();
	
		
	}

}
