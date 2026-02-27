package oop.polymorphism.paymentmethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PayApp {
    public static void main(String[] args) {
        List <PaymentMethod> payments =  new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        System.out.println("WELCOME TO JEAN LUC'S BANK");

        while(running){
            System.out.println("What would you like to do this moment?");
            System.out.println("1. Make a payment");
            System.out.println("2. See my transaction history");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            int choose = sc.nextInt();
            sc.nextLine();

            switch (choose){
                case 1->{

                    System.out.println("----------------------------");
                    System.out.println("Choose a payment method");
                    System.out.println("1.PayPal");
                    System.out.println("2.Credit Card");
                    System.out.println("3.Mobile Money");
                    System.out.println("-----------------------------");
                    System.out.print("Choice: ");
                    int choice = sc.nextInt();
                    sc.nextLine();

                    if(choice == 1){
                        System.out.print("Enter your name: ");
                        String owner = sc.nextLine();
                        System.out.print("Enter your  cardNumber: ");
                        String cardNUmber = sc.nextLine();
                        System.out.println("Enter amount to deposit: ");
                        double amount = sc.nextDouble();
                        sc.nextLine();
                        PaymentMethod payment = new PayPal(owner,cardNUmber,amount);
                        payments.add(payment);
                        System.out.println(payment.processPayment(payment.getAmount()));
                        //(String owner,String cardNumber,double amount)
                    }

                    if (choice == 2){
                        System.out.print("Enter your name: ");
                        String owner = sc.nextLine();
                        System.out.print("Enter your  cardNumber: ");
                        String cardNUmber = sc.nextLine();
                        System.out.println("Enter amount to deposit: ");
                        double amount = sc.nextDouble();
                        sc.nextLine();
                        PaymentMethod payment = new CreditCard(owner,cardNUmber,amount);
                        payments.add(payment);
                        System.out.println(payment.processPayment(payment.getAmount()));
                    }

                    if (choice == 3){
                        System.out.print("Enter your name: ");
                        String owner = sc.nextLine();
                        System.out.print("Enter your  cardNumber: ");
                        String cardNUmber = sc.nextLine();
                        System.out.println("Enter amount to deposit: ");
                        double amount = sc.nextDouble();
                        sc.nextLine();
                        PaymentMethod payment = new MobileMoney(owner,cardNUmber,amount);
                        payments.add(payment);
                        System.out.println(payment.processPayment(payment.getAmount()));
                    }
                    break;
                }



                case 2 ->{
                    System.out.print("Enter your card number: ");
                    String cardNumber = sc.nextLine();

                    boolean found = false;

                    for (PaymentMethod payment : payments) {
                        if (payment.getCardId().equals(cardNumber)) {
                            System.out.println(payment);
                            found = true;
                        }

                    }
                    if(!found){
                        System.out.println("The card number you provided could not be found");
                    }



                    break;
                }


                case 0 ->{
                    System.out.println("Thank you for using Jean Luc's BANK, exiting....");
                    running = false;
                }
            }
        }


    }
}
