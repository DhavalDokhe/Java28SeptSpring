package com.CodeKul.Java28SeptSpring.manyTomany.repository;

import com.CodeKul.Java28SeptSpring.manyTomany.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
