package oop.polymorphism.dicountOnproducts;

public class DamagedLaptop extends Product{

    public DamagedLaptop(double price){
        super(price);
    }
    @Override
    public double getFinalPrice() {
        return getPrice() * 0.5;
    }
}
