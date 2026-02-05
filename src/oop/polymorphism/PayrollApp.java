package oop.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class PayrollApp {
    public static void main(String[] args) {
        FullTimeDev dev = new FullTimeDev("Divya Akacu",7000,1500);
        Intern intern =  new Intern("NAVA Erica",7000);

        List<Employee>employees = new ArrayList<>();

        employees.add(dev);
        employees.add(intern);

        for (Employee employee : employees) {
            System.out.println(" Paying  " + employee.getName() +", $" + employee.calculateTotalPay());

        }
    }
}
