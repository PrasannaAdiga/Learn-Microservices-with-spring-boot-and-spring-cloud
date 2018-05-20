package com.user.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.user.api.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	public User findByFirstName(String userName);
}