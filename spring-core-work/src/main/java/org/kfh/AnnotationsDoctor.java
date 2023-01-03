package org.kfh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("anDoctor")
//@Service
//@Repository
//@Controller
public class AnnotationsDoctor implements Doctor {

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
        System.out.println("HI there I am a doctor and below are my contact details:");

        System.out.println(contact);
    }
}
