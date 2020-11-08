package com.company.polimorfizm;

public class Tester implements Worker {
    private String name;
    private String surname;
    private int age;
    private char sex;
    private String function;
    private double baseSalary;
    private String typeOfTesting;
    public Tester(String name, String surname, int age, char sex, String function,String typeOfTesting) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.function = function;
        this.baseSalary = 5000;
        this.typeOfTesting = typeOfTesting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getTypeOfTesting() {
        return typeOfTesting;
    }

    public void setTypeOfTesting(String typeOfTesting) {
        this.typeOfTesting = typeOfTesting;
    }

    @Override
    public void sayHello(String name) {
        System.out.println("Hello,I'm " + name);
    }

    @Override
    public void work() {
        System.out.println("I'm testing apps...");
    }

    @Override
    public double calculateSalary(double baseSalary) {
        return baseSalary + 1500;
    }

    @Override
    public String printAll() {
        return
                "\nname : " + name + '\n' +
                        "surname : " + surname + '\n' +
                        "age : " + age + '\n' +
                        "function : " + function + '\n' +
                        "sex : " + sex + '\n' +
                        "salary : " + calculateSalary(baseSalary) + '\n' +
                        "type of testing : " + typeOfTesting;
    }
}
