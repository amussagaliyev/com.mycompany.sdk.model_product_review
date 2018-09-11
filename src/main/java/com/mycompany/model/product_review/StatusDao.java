package com.mycompany.model.product_review;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusDao extends CrudRepository<Status, Integer>
{
	public Optional<Status> findByCode(String code);
	
}
