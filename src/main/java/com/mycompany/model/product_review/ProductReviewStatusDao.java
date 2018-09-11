package com.mycompany.model.product_review;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductReviewStatusDao extends CrudRepository<ProductReviewStatus, Integer>
{
}
