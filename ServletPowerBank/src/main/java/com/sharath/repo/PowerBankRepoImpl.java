package com.sharath.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.sharath.dto.PowerBankDto;

public class PowerBankRepoImpl implements PowerBankRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Servlet");
	EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(PowerBankDto dto) {
		if (em != null) {

			em.getTransaction().begin();

			em.persist(dto);
			em.getTransaction().commit();
			return true;

		}

		return false;
	}

	@Override
	public List<PowerBankDto> readAll() {

		Query namedQuery = em.createNamedQuery("readAll");

		return namedQuery.getResultList();
	}

	@Override
	public List<PowerBankDto> readByName(String name) {

		Query namedQuery = em.createNamedQuery("readByName", PowerBankDto.class);
		namedQuery.setParameter("name", name);

		return namedQuery.getResultList();
	}

	@Override
	public PowerBankDto readById(String id) {
		int i = Integer.parseInt(id);
		Query namedQuery = em.createNamedQuery("readById", PowerBankDto.class);
		namedQuery.setParameter("id", i);

		return (PowerBankDto) namedQuery.getSingleResult();

	}

	@Override
	public PowerBankDto readByNameAndMah(String name, String mah) {
		Query namedQuery = em.createNamedQuery("readByNameAndMah", PowerBankDto.class);
		namedQuery.setParameter("name", name);
		namedQuery.setParameter("mah", mah);

		return (PowerBankDto) namedQuery.getSingleResult();
	}

	@Override
	public boolean updatePriceByNameAndMah(String price, String name, String mah) {

		em.getTransaction().begin();
		Query namedQuery = em.createNamedQuery("updatePriceByNameAndMah");
		namedQuery.setParameter("price", price);
		namedQuery.setParameter("name", name);
		namedQuery.setParameter("mah", mah);
		int i = namedQuery.executeUpdate();

		if (i > 0) {
			em.getTransaction().commit();
			return true;
		}

		return false;
	}

	@Override
	public boolean deleteByNamePriceAndMah(String name, String price, String mah) {
		em.getTransaction().begin();
		Query namedQuery = em.createNamedQuery("deleteByNamePriceAndMah");
		namedQuery.setParameter("name", name);
		namedQuery.setParameter("price", price);
		namedQuery.setParameter("mah", mah);
		int i = namedQuery.executeUpdate();

		if (i > 0) {
			em.getTransaction().commit();
			return true;
		}

		return false;
	}
}
