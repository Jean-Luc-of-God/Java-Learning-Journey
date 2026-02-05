package oop.polymorphism.dicountOnproducts;



public class Laptop extends Product{

    public Laptop(double price){
        super(price);
    }
    @Override
    public double getFinalPrice() {
        return getPrice();
    }

}
