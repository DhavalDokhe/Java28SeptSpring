package com.CodeKul.Java28SeptSpring.onetoone.controller.Repository;

import com.CodeKul.Java28SeptSpring.onetoone.controller.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
