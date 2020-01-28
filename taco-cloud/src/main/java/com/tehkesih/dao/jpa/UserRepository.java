package com.tehkesih.dao.jpa;

import org.springframework.data.repository.CrudRepository;

import com.tehkesih.User;

public interface UserRepository extends CrudRepository<User, Long>{

	User findByUsername (String username);
}
