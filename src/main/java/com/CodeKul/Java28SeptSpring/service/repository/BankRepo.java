package com.CodeKul.Java28SeptSpring.service.repository;

import com.CodeKul.Java28SeptSpring.service.domain.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepo extends JpaRepository<Bank,Integer> {
}
