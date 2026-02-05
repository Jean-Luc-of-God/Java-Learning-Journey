package oop.polymorphism;

public abstract class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        while(name.isEmpty()){
            System.out.println("Name can not be empty!");
            System.out.print("Enter your names: ");
        }
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public abstract double calculateTotalPay();

}
