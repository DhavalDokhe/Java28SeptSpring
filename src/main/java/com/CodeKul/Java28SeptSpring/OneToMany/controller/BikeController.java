package com.CodeKul.Java28SeptSpring.OneToMany.controller;

import com.CodeKul.Java28SeptSpring.OneToMany.domain.Bike;
import com.CodeKul.Java28SeptSpring.OneToMany.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BikeController {

    @Autowired
    private BikeRepository bikeRepository;

    @PostMapping("saveBike")
    public String saveBike(@RequestBody Bike bike){
        bikeRepository.save(bike);
        return "Bike Saved";
    }
}
