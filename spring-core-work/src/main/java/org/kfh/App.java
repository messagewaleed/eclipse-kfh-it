package org.kfh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.Doc;

public class App
{
    public static void main( String[] args )
    {
//        Requirement of calling Doctor's treatForWages()
//        Doctor doctor = new Doctor("Omer", "Orthopeadics");
//        doctor.treatForWages();




//        1. Load the context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//
////        2. Get a reference to the bean
        Doctor doctor = context.getBean("doctor", Doctor.class);
//
////        3. Call methods on th bean
        doctor.treatForWages();
    }
}
