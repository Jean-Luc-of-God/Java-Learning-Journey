package oop.polymorphism.paymentmethods;

public class CreditCard extends PaymentMethod{
    @Override
    public String processPayment(double amount) {

        while(amount <0 ){

            return "Can not process a negative amount!";
        }

        return "Processed payment with Credit Card ";
    }

    public CreditCard(String owner, String cardNumber, double amount){
        super(cardNumber, owner, amount);
    }
    @Override
    public String toString() {
        return "Owner name: "+getCardOwner()+" || "+"Card Number: "+getCardId() + " || " + "Amount: "+getAmount();
    }
}
