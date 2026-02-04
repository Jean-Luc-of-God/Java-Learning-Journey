package oop.encapsulation.constructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CAR DETAILS");
        System.out.println("-----------------------------");
        System.out.print("Please enter your car Brand: ");
        String carBrand = scanner.nextLine();
        System.out.print("Please enter your car's color: ");
        String carColor = scanner.nextLine();
        System.out.print("Please enter your car's plate number: ");
        String carPlate = scanner.nextLine();


        Car car1 = new Car(carBrand,carColor,carPlate);
        System.out.println("HERE ARE YOUR CAR'S DETAILS");
        System.out.println(car1.toString());

    }
}
