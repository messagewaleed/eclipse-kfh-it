package org.kfh.components;

import org.kfh.Contact;
import org.kfh.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("anDoctor")
@PropertySource("classpath:data.properties")
public class AnnotationsDoctor implements Doctor {

    @Value("${db.userName}")
    String name;

    @Value("${db.userRegId}")
    String regId;

    @Autowired
    @Qualifier("getOtherNames") //For the exact match
    private List<String> names;

    @Autowired //Yes we can use it directly on the field
    private Contact contact;

//    @Autowired
//    public AnnotationsDoctor(Contact contact) {
//        this.contact = contact;
//    }

//    @Autowired
//    @Qualifier("otherContact")//For the exact match
//    public void setContact(Contact contact) {
//        this.contact = contact;
//    }

    @Override
    public void treatForWages() {
        System.out.println("Hi there I am a doctor and below are my contact details:");

        System.out.println(contact);

        System.out.println("And my work details are :");
        System.out.println(name  + " with reg id : " + regId);

        System.out.println("Below are the registered names:");
        names.forEach(System.out::println);
    }
}
