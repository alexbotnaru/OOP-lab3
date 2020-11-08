package com.company.polimorfizm;

public class Programmer extends Employee {
    private String codingLanguage;
    private String level;

    public Programmer(int age, char sex, String name, String surname, String function, String codingLanguage, String level) {
        super(age, sex, name, surname, function);
        this.codingLanguage = codingLanguage;
        this.level = level;
    }

    public String getCodingLanguage() {
        return codingLanguage;
    }

    public void setCodingLanguage(String codingLanguage) {
        this.codingLanguage = codingLanguage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public void work() {
        System.out.println("I'm Coding...");
    }

    @Override
    public double calculateSalary(double baseSalary) {
        return baseSalary+2500;
    }

    @Override
    public String printAll() {
        return
                "\nname : " + getName() + '\n' +
                "surname : " + getSurname() + '\n' +
                "age : " + getAge() + '\n' +
                "function : " + getFunction() + '\n' +
                "codingLanguage : " + codingLanguage + '\n' +
                "level : " + level + '\n' +
                "salary : " + calculateSalary(getBaseSalary()) + '\n';

    }
}
