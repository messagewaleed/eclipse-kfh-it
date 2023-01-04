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

//        System.out.println("Please enter the id to search");

//        System.out.println("Name for the entered id :" + dao.getPersonNameById(new Scanner(System.in).nextInt()));

//        System.out.println("Person details for the entered id: " + dao.getAllDetailsById(new Scanner(System.in).nextInt()));

        System.out.println("Please enter the name and location");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String location = scan.nextLine();

        dao.addNewPerson(name, location);

        System.out.println("New person registered");


//        System.out.println("Enter id:");
//        dao.deletePerson(new Scanner(System.in).nextInt());
//
//        System.out.println("Person detail deleted...");







        System.out.println("Updated registered persons list :");
            dao.getAllPersons().forEach(System.out::println);








    }
}
