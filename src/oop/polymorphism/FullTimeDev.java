package oop.polymorphism;

public class FullTimeDev extends Employee{
    private double bonus;

    public FullTimeDev(String name,double salary,double bonus){
        super(name,salary);
        this.bonus = bonus;


    }
    @Override
    public double calculateTotalPay() {
        return getSalary() + bonus;
    }
}
