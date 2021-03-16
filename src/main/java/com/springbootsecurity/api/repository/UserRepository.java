package com.springbootsecurity.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootsecurity.api.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
