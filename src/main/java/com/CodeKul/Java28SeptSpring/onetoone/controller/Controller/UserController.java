package com.CodeKul.Java28SeptSpring.onetoone.controller.Controller;

import com.CodeKul.Java28SeptSpring.onetoone.controller.Repository.AddressRepository;
import com.CodeKul.Java28SeptSpring.onetoone.controller.Repository.UserRepository;
import com.CodeKul.Java28SeptSpring.onetoone.controller.model.Address;
import com.CodeKul.Java28SeptSpring.onetoone.controller.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("saveUser")
    public String saveUser() {
        User user = new User();
        user.setName("Rahul");
        user.setEmail("rahul@gamil.com");

        Address address = new Address();
        address.setAddress("Pune");
        address.setPinCode(6554);

        user.setAddress(address);
        address.setUser(user);

        userRepository.save(user);
        addressRepository.save(address);
        return "User saved";

    }
}
