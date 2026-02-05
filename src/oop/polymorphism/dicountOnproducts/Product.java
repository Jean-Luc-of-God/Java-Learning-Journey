package oop.polymorphism.dicountOnproducts;

import java.util.Scanner;

public abstract class Product {
    Scanner scanner = new Scanner(System.in);
    private double price;
    public Product(double price){
        this.price = price;
    }

    public abstract double getFinalPrice();

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        while(price < 0 ){
            System.out.println("We can not allow a negative price");
            System.out.print("Enter the non negative price: ");
            price = scanner.nextDouble();
        }
        this.price = price;
    }
}
