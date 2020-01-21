package com.tehkesih.dao.jdbc;

import com.tehkesih.component.Ingredient;

public interface IngredientRepository {

	
	Iterable<Ingredient> findAll();
	
	Ingredient findById (String id);
	
	Ingredient save(Ingredient ingredient);
}
