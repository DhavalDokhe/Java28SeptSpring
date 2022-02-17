package com.CodeKul.Java28SeptSpring.login.repository;

import com.CodeKul.Java28SeptSpring.login.Domain.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepo extends JpaRepository<Registration,Integer> {
    Registration findByEmailAndPassword(String email,String password);
}
