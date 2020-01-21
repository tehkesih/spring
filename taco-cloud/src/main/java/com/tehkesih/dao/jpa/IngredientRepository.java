package com.tehkesih.dao.jpa;

import org.springframework.data.repository.CrudRepository;

import com.tehkesih.component.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, Long>{
	
}
