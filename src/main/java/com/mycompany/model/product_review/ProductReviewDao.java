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
public class ProductReviewDao extends AbstractDao
{

	public ProductReview getByID(Integer id)
	{
		return session().get(ProductReview.class, id);
	}
	
	public void save(ProductReview productReview)
	{
		session().saveOrUpdate(productReview);
	}
	
	public List<ProductReview> getList(Integer productID)
	{
		CriteriaBuilder criteriaBuilder = session().getCriteriaBuilder();
		CriteriaQuery<ProductReview> criteriaQuery = criteriaBuilder.createQuery(ProductReview.class);
		Root<ProductReview> root = criteriaQuery.from(ProductReview.class);
		ParameterExpression<Integer> parameter = criteriaBuilder.parameter(Integer.class);
		criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("productID"), parameter));
		TypedQuery<ProductReview> query = session().createQuery(criteriaQuery);
		query.setParameter(parameter, productID);
		
		return query.getResultList();
	}
}
