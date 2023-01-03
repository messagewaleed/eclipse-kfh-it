package org.kfh;

import org.kfh.components.AnnotationsDoctor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

@Configuration
public class App
{
    public static void main( String[] args )
    {
//        Requirement of calling Doctor's treatForWages()
//        Doctor doctor = new Doctor("Omer", "Orthopeadics");
//        doctor.treatForWages();




//        1. Load the context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationsContext.xml");
//
////        2. Get a reference to the bean
        Doctor doctor = context.getBean("anDoctor", AnnotationsDoctor.class);
//        Doctor doctor = context.getBean("doctor", Doctor.class);

//        GeneralPhysician physician = context.getBean("physician", GeneralPhysician.class);
//        Doctor otherPhysician = context.getBean("otherPhysician", GeneralPhysician.class);
//        GeneralPhysician anotherPhysician = context.getBean("physician", GeneralPhysician.class);
//
//        System.out.println(physician + "\n" + anotherPhysician);//false : prototype
//
////        3. Call methods on th bean
          doctor.treatForWages();
    }

    @Bean
    public List<String> getNames(){
        return Arrays.asList("Omar", "Shaikha", "Sunder", "Haneen");
    }

    @Bean
    public List<String> getOtherNames(){
        return Arrays.asList("Lulwa", "Atif", "Waleed");
    }



}
