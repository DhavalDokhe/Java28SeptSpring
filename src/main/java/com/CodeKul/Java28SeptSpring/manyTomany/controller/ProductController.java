package com.CodeKul.Java28SeptSpring.manyTomany.controller;

import com.CodeKul.Java28SeptSpring.manyTomany.domain.Product;
import com.CodeKul.Java28SeptSpring.manyTomany.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("saveProduct")
    public String saveProduct(@RequestBody Product product){
productRepository.save(product);
        return " Product save ";
    }
}
