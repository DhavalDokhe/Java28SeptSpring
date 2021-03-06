package com.CodeKul.Java28SeptSpring.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {


    Employee findByIdAndName(Integer id, String name);

    List<Employee> findByIdOrName(Integer id, String name);

    List<Employee> findByNameStartingWith( String name);

    List<Employee> findByNameEndingWith( String name);
}
