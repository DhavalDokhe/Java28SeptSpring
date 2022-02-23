package com.CodeKul.Java28SeptSpring.mailing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    @Autowired
    private MailSender mailSender;

    @PostMapping("sendMail")
    public  String sendMail(){
        String from="dhavaldokhe@gmail.com";
        String to="patelallauddin53@gmail.com";

        SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
        simpleMailMessage.setSubject("Hiee");
        simpleMailMessage.setText("Hello Petel...!!");
                simpleMailMessage.setCc("abhishekdolas547@gmail.com");
                simpleMailMessage.setFrom(from);
                simpleMailMessage.setTo(to);
                mailSender.send(simpleMailMessage);
                return "mail sent";
    }

}
