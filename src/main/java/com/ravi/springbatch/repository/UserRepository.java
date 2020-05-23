package com.ravi.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.springbatch.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
