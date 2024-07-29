package com.sharath.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.sharath.dto.MasalaDto;

public class MasalaRepoImpl {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Servlet");
	EntityManager em = emf.createEntityManager();

	public boolean save(MasalaDto dto) {
		em.getTransaction().begin();
		em.persist(dto);
		em.getTransaction().commit();

		return true;

	}

	public List<MasalaDto> readAll() {

		Query query = em.createNamedQuery("readAll");
		return query.getResultList();

	}

	public List<MasalaDto> readByQty(int qty) {

		Query query = em.createNamedQuery("readByQty");
		query.setParameter("qty",qty);
		return query.getResultList();

	}
	
	public MasalaDto readById(int id) {

		Query query = em.createNamedQuery("readById");
		query.setParameter("id",id);
		return (MasalaDto) query.getSingleResult();

	}
	
	public List<MasalaDto> readByPrice(int price) {

		Query query = em.createNamedQuery("readByPrice");
		query.setParameter("price",price);
		return query.getResultList();

	}
	
	public boolean updatePriceByBrandAndId(int price,String brand,int id)
	{
		em.getTransaction().begin();
		Query query = em.createNamedQuery("updateByPrice");
		query.setParameter("brand", brand);
		query.setParameter("id",id);
		query.setParameter("price", price);
		query.executeUpdate();
		em.getTransaction().commit();
		
		return true;
		
	}

	public boolean deleteByPriceBrandAndId(int price,String brand,int id)
	{
		em.getTransaction().begin();
		Query query = em.createNamedQuery("deleted");
		query.setParameter("price", price);
		query.setParameter("brand", brand);
		query.setParameter("id",id);
		query.executeUpdate();
		em.getTransaction().commit();
		return true;
		
	}
}
