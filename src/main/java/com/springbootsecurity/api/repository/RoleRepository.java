package com.springbootsecurity.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootsecurity.api.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
