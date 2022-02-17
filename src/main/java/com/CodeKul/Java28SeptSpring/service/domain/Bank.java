package com.CodeKul.Java28SeptSpring.service.domain;

import com.CodeKul.Java28SeptSpring.OneToMany.domain.Bike;
import com.CodeKul.Java28SeptSpring.bank.domain.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String bankName;

    private String ifccode;

    private  String branchName;


    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;


}
