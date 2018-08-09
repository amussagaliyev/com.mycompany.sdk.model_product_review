package com.mycompany.model.product_review;

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
}
