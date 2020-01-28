package com.tehkesih;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor (access=AccessLevel.PRIVATE, force=true)
@Entity
public class Ingredient {

	@Id
	private final String id;
	private final String name;
	private final Type types;
	
	public static enum Type {
		WRAP (1, "WRAP"), 
		PROTEIN (2, "PROTEIN"), 
		VEGGIES (3, "VEGGIES"), 
		CHEESE (4, "CHEESE"), 
		SAUCE (5, "SAUCE");
		
		private final int id;

		private final String type;
		
		private Type(int id, String type) {
			this.id = id;
			this.type = type;
		}
		
		public int getId() {
			return id;
		}

		public String getType() {
			return type;
		}
	}
}
