package org.kfh;

public class Doctor {

    String name;

    String domain;

    Doctor(String name, String domain){
        this.name = name;
        this.domain = domain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setter for name called...");
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        System.out.println("setter for domain called...");
        this.domain = domain;
    }

    Doctor(){

    }
    void treatForWages(){
        System.out.println("Hey there I am a doctor : ");
        System.out.println(name + " specialised in " + domain);
    }
}
