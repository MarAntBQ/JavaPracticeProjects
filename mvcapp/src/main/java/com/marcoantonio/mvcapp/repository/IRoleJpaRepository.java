package com.marcoantonio.mvcapp.repository;

import com.marcoantonio.mvcapp.model.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Role JPA Interface
 * @author javatechnolessons
 * @version 1.0
 */
@Repository
public interface IRoleJpaRepository extends JpaRepository<Role,Long>{
    Role findByName(String name);

}

