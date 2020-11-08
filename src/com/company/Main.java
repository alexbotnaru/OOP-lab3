package com.company;

import com.company.polimorfizm.*;

public class Main {

    public static void main(String[] args) {
        //polymorphism using abstract class
        Programmer programmer1 = new Programmer(25,'M',"Alex","Botnaru","programmer","Java","Junior" );
        programmer1.sayHello(programmer1.getName());
        System.out.println("My salary is : "+ programmer1.calculateSalary(programmer1.getBaseSalary()));
        programmer1.work();
        System.out.println(programmer1.printAll());
        System.out.println("----------------------------------------");

        //polymorphism using interface
        Tester tester1 = new Tester("Ion","Osipciuc",24,'M',"tester ","automated ");
        tester1.sayHello(tester1.getName());
        System.out.println("My salary is : " + tester1.calculateSalary((tester1.getBaseSalary())));
        tester1.work();
        System.out.println(tester1.printAll());
        System.out.println("----------------------------------------");

        //using interface and abstract class
        Designer designer1 = new Designer(22,'F',"Ana-Maria","Alcaza","designer","UI");
        designer1.sayHello(designer1.getName());
        System.out.println("My salary is : "+ designer1.calculateSalary(designer1.getBaseSalary()));
        designer1.work();
        System.out.println(designer1.printAll());
    }
}
