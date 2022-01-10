package com.CodeKul.Java28SeptSpring.servicedemo.repository;

import com.CodeKul.Java28SeptSpring.servicedemo.domain.ServiceDemo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceDemoRepo extends JpaRepository<ServiceDemo,Integer> {
}
