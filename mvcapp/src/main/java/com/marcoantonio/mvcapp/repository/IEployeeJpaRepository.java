package com.marcoantonio.mvcapp.repository;

import java.util.List;

import com.marcoantonio.mvcapp.model.Employee;
import com.marcoantonio.mvcapp.model.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEployeeJpaRepository extends JpaRepository<Employee, Long> {
    //Select fields from eployee where eployeeid=['param']
    Employee findByEmployeeid(String employeeid);

    List<Employee> findByFirstName(String firstName);

    List<Employee> findByLastName(String lastName);

    List<Employee> findByRole(Role role);
}
