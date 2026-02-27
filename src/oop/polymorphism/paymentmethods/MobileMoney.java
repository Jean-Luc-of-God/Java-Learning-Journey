package oop.polymorphism.paymentmethods;

public class MobileMoney extends PaymentMethod{
    @Override
    public String processPayment(double amount) {

        return "Card processed with Momo: "+"card Owner: "+getCardOwner();

    }

    public MobileMoney(String owner, String cardNumber, double amount){
        super(cardNumber, owner, amount);
    }
    @Override
    public String toString() {
        return "Owner name: "+getCardOwner()+" || "+"Card Number: "+getCardId() + " || " + "Type: Mobile Money" + " || " + "Amount: "+getAmount();
    }
}
