package oop.polymorphism.paymentmethods;

public abstract class PaymentMethod {
    private String cardId;
    private String cardOwner;
    private double amount;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PaymentMethod(String cardId, String cardOwner, double amount) {

        setCardId(cardId);
        setCardOwner(cardOwner);
        try{
            setAmount(amount);

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("Invalid amount");
        }
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if(amount <0 ){

            throw new IllegalArgumentException("The amount to deposit can not be negative");
        }
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
