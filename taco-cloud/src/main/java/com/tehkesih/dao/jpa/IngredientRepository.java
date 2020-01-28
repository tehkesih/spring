package com.tehkesih.dao.jpa;

import org.springframework.data.repository.CrudRepository;

import com.tehkesih.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String>{
	
}
