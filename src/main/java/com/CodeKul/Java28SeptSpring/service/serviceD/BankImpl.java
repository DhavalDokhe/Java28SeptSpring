package com.CodeKul.Java28SeptSpring.service.serviceD;

import com.CodeKul.Java28SeptSpring.service.domain.Bank;
import com.CodeKul.Java28SeptSpring.service.repository.BankRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankImpl implements BankService{

    @Autowired
    private BankRepo bankRepo;

    @Override
    public void saveBank(Bank bank) {
        bankRepo.save(bank);
    }
}
