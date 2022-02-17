package com.CodeKul.Java28SeptSpring.bank.domain;

import com.CodeKul.Java28SeptSpring.OneToMany.domain.Parts;
import com.CodeKul.Java28SeptSpring.service.domain.Bank;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String lastname;
    private String address;
    private String email;
    private Long contact;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch =FetchType.LAZY)
    @JsonManagedReference
    private List<BankDetails> bankDetails;
}
