package com.company.polimorfizm;

public class PersonalData {
    private String name;
    private String surname;
    private int age;
    private char sex;
    private String function;
    private double baseSalary;

    public PersonalData(int age, char sex, String name, String surname, String function) {
        this.age = age;
        this.sex = sex;
        this.name = name;
        this.surname = surname;
        this.function = function;
        this.baseSalary = 5000;
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
}