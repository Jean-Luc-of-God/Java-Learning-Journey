package oop.polymorphism.dicountOnproducts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Selling {
    public static void main(String[] args) {
        List<Product>productsToSell = new ArrayList<>();
        double totalAmount= 0;
        Scanner scanner = new Scanner(System.in);

        Laptop lap = new Laptop(500);
        DamagedLaptop damagedLaptop = new DamagedLaptop(500);
        System.out.println("WELCOME TO JEAN LUC'S SHOP");
        System.out.println("==============================================");
        System.out.print("Please enter the price of the damaged laptop: ");
        damagedLaptop.setPrice(scanner.nextDouble());
        productsToSell.add(damagedLaptop);
        System.out.print("Enter the price of the new laptop: ");
        lap.setPrice(scanner.nextDouble());
        productsToSell.add(lap);

        System.out.println("-----------------+++++------------------------");
        for (Product product : productsToSell) {

            System.out.println("Laptop 1 selling for $" + product.getFinalPrice());
            totalAmount+=product.getFinalPrice();

        }
        System.out.println();
        System.out.println("-----------------+++++------------------------");
        System.out.println("TOTAL SUM TO BE PAID");
        System.out.println("-----------------+++++------------------------");
        System.out.println("The final  amount to be paid is: $ "+totalAmount);
    }
}
