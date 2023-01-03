package org.kfh;

import java.util.List;

public class PracticingDoctor implements Doctor {

//    private Contact contact;

    private List<Contact> contacts;

    String name;

    String domain;

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    PracticingDoctor(String name, String domain, List<Contact> contacts) {
        this.name = name;
        this.domain = domain;
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //System.out.println("setter for name called...");
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        //System.out.println("setter for domain called...");
        this.domain = domain;
    }

    PracticingDoctor() {

    }

    @Override
    public void treatForWages() {
        System.out.println("Hey there I am a doctor : ");
        System.out.println(name + " specialised in " + domain);
        System.out.println("And you can reach me on : ");
        contacts.forEach(System.out::println);
    }
}
