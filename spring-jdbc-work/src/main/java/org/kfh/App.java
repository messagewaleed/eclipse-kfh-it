package org.kfh;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

       DbDao dao = context.getBean("dao", DbDao.class);

//        System.out.println("Number of registered persons : " + dao.getCountOfPersons());

        System.out.println("Please enter the id to search");

        System.out.println("Name for the entered id :" + dao.getPersonNameById(new Scanner(System.in).nextInt()));
    }
}
