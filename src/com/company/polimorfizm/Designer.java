package com.company.polimorfizm;

public class Designer extends PersonalData implements Worker {
    private String type;

    public Designer(int age, char sex, String name, String surname, String function,String type) {
        super(age, sex, name, surname, function);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void work() {
        System.out.println("I'm drawing...");
    }

    @Override
    public double calculateSalary(double baseSalary) {
        return baseSalary + 1200;
    }

    @Override
    public String printAll() {
        return
                "\nname : " + getName()+ '\n' +
                        "surname : " + getSurname() + '\n' +
                        "age : " + getAge() + '\n' +
                        "function : " + getFunction() + '\n' +
                        "sex : " + getSex() + '\n' +
                        "type : " + type + '\n';
    }

    public void sayHello(String name){
        System.out.println("Hello, I'm " + getName());
    }
}
