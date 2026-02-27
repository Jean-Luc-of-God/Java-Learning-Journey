package oop.polymorphism.paymentmethods;


public class PayPal extends PaymentMethod{


    @Override
    public String processPayment(double amount) {
        while(amount <0 ){

            return "Can not process a negative amount!";
        }
        return "Card processed with PayPal: "+"card Owner: "+getCardOwner();

    }

    public PayPal(String owner, String cardNumber, double amount){
        super(cardNumber, owner, amount);
    }

    @Override
    public String toString() {
        return "Owner name: "+getCardOwner()+" || "+"Card Number: "+getCardId() + " || " + "Amount: "+getAmount();
    }
}
