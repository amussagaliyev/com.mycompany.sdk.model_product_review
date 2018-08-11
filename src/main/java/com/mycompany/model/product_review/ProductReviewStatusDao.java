package com.mycompany.model.product_review;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.mycompany.model.core.AbstractDao;

@Repository
public class ProductReviewStatusDao extends AbstractDao
{
	public List<ProductReviewStatus> getProductReviewStatuses(Integer productReviewID)
	{
		CriteriaBuilder criteriaBuilder = session().getCriteriaBuilder();
		CriteriaQuery<ProductReviewStatus> criteriaQuery = criteriaBuilder.createQuery(ProductReviewStatus.class);
		Root<ProductReviewStatus> root = criteriaQuery.from(ProductReviewStatus.class);
		ParameterExpression<Integer> parameter = criteriaBuilder.parameter(Integer.class);
		criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("productReviewID"),  parameter));
		TypedQuery<ProductReviewStatus> query = session().createQuery(criteriaQuery);
		query.setParameter(parameter, productReviewID);
		
		return query.getResultList();	
	}
	
	public void save(ProductReviewStatus productReviewStatus)
	{
		session().saveOrUpdate(productReviewStatus);
	}
	
}
