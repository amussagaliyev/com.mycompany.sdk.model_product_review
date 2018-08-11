package com.mycompany.model.product_review;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.mycompany.model.core.AbstractDao;

@Repository
public class StatusDao extends AbstractDao
{
	
	public Status getByCode(String code)
	{
		CriteriaBuilder criteriaBuilder = session().getCriteriaBuilder();
		CriteriaQuery<Status> criteriaQuery = criteriaBuilder.createQuery(Status.class);
		Root<Status> root = criteriaQuery.from(Status.class);
		ParameterExpression<String> parameter = criteriaBuilder.parameter(String.class);
		criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("code"),  parameter));
		TypedQuery<Status> query = session().createQuery(criteriaQuery);
		query.setParameter(parameter, code);
		
		return query.getSingleResult();
	}
	
}
