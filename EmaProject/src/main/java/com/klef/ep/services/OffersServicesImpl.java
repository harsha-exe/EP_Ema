package com.klef.ep.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.klef.ep.models.Employee;
import com.klef.ep.models.Offers;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class OffersServicesImpl implements OffersServices {

	@Override
	public String addOffers(Offers o) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("EmaProject");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(o);
		em.getTransaction().commit();
		em.close();
		emf.close();
		return "Inserted Offer Successfully";
	}

	@Override
	public String updateOffers(Offers o) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("EmaProject");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Offers obj=em.find(Offers.class, o);
		obj.setSalary(o.getSalary());
		em.getTransaction().commit();
		em.close();
		emf.close();
		return "Updated Successfully";
	}

	@Override
	public String deleteOffers(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("EmaProject");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Offers o=em.find(Offers.class, id);
		em.remove(o);
		em.getTransaction().commit();
		em.close();
		emf.close();
		return "Deleted Successfully";
		
	}

	@Override
	public List<Offers> viewAllOffers() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("EmaProject");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Query qry=em.createQuery("select o from Offers o");
		List<Offers> al=qry.getResultList();
		return al;
	}

	@Override
	public Offers viewOffersById(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("EmaProject");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Offers o=em.find(Offers.class, id);
		return o;
	}

}
