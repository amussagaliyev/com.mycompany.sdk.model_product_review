package com.mycompany.model.product_review;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.mycompany.model.core.AbstractDao;

@Repository
public class StatusDao extends AbstractDao<Status>
{
	public Status getByCode(String code)
	{
		Query query = entityManager().createNamedQuery("Status.getByCode", Status.class).setParameter("code", code);
		return (Status) query.getSingleResult();
	}
	
}
