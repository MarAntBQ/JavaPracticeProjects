package com.marcoantonio.mvcapp.repository;

import com.marcoantonio.mvcapp.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEployeeJpaRepository extends JpaRepository<Employee, Long> {
    //Select fields from eployee where eployeeid=['param']
    Employee findByEmployeeid(String employeeid);
}
