package oop.polymorphism;

public class Intern extends Employee{
    public Intern(String name, double salary){
        super(name,salary);
    }
    @Override
    public double calculateTotalPay() {
        return getSalary();
    }
}
