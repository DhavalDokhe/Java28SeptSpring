//package com.CodeKul.Java28SeptSpring.lombokdemo.controller;
//
//import com.CodeKul.Java28SeptSpring.lombokdemo.domain.LombokDemo;
//import com.CodeKul.Java28SeptSpring.lombokdemo.repository.LombokRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class LombokController {
//
//    @Autowired
//    private LombokRepository lombokRepository;
//
//    @PostMapping("saveLombok")
//    public String saveLombok(@RequestBody LombokDemo lombokDemo){
//        lombokRepository.save(lombokDemo);
//        return "saved";
//    }
//
//    @GetMapping("getLombok")
//    public List<LombokDemo> getData(){
//        return lombokRepository.findAll();
//    }
//}
