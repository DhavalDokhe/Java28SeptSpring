package com.CodeKul.Java28SeptSpring.manyTomany.repository;

import com.CodeKul.Java28SeptSpring.manyTomany.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
