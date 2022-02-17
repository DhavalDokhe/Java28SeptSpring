package com.CodeKul.Java28SeptSpring.bank.repositrory;

import com.CodeKul.Java28SeptSpring.bank.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
