package org.kfh;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class GeneralPhysician implements Doctor{ //implements InitializingBean, DisposableBean {

    private Contact contact;

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void treatForWages(){
        System.out.println("Hello I practice General Medicine");
        System.out.println("Below is what you can reach me on:");
        System.out.println(contact);
    }


    public void callAtEnd()  {
        System.out.println("GeneralPhysician bean about to be disposed off...");
    }


    public void callAtStart() {
        System.out.println("GeneralPhysician bean instantiated...");
    }

    void workForJustSavingLives(){
        System.out.println("My prime objective is to save lives...");
    }
}
