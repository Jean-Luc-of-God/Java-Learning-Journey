package oop.polymorphism.paymentmethods;

public class CreditCard extends PaymentMethod{
    @Override
    public String processPayment(double amount) {

        if(amount <0 ){

            throw new IllegalArgumentException("Can not process negative amount!");
        }

        return "Processed payment with Credit Card ";
    }

    public CreditCard(String owner, String cardNumber, double amount){
        super(cardNumber, owner, amount);
    }
    @Override
    public String toString() {
        return "Owner name: "+getCardOwner()+" || "+"Card Number: "+getCardId() + " || " + "Type: Credit Card" + " || " + "Amount: "+getAmount();
    }
}
