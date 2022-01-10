package com.CodeKul.Java28SeptSpring.onetoone.controller.Repository;

import com.CodeKul.Java28SeptSpring.onetoone.controller.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
