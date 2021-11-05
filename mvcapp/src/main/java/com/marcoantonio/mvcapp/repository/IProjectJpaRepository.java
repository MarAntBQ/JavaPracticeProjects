package com.marcoantonio.mvcapp.repository;

import com.marcoantonio.mvcapp.model.Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProjectJpaRepository extends JpaRepository<Project, Long> {
    Project findByName(String name);
}
