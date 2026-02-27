package oop.polymorphism.paymentmethods;

public abstract class PaymentMethod {
    private String cardId;
    private String cardOwner;
    private double amount;

    public PaymentMethod(String cardId, String cardOwner, double amount) {
        this.cardId = cardId;
        this.cardOwner = cardOwner;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }



    public String getCardOwner() {
        return cardOwner;
    }

    public void setCardOwner(String cardOwner) {
        this.cardOwner = cardOwner;
    }


    public abstract String processPayment(double amount);

}
