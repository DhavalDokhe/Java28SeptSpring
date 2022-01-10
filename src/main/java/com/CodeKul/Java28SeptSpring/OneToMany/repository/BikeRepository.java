package com.CodeKul.Java28SeptSpring.OneToMany.repository;

import com.CodeKul.Java28SeptSpring.OneToMany.domain.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike,Integer> {
}
