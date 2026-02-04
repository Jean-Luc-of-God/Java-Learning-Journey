package oop.encapsulation.constructors;

public class Car {
    private String carBrand;
    private String carColor;
    private String plateNo;

    public Car(String carBrand,String carColor,String plateNo){
        this.carBrand = carBrand;
        this.carColor = carColor;
        this.plateNo = plateNo;
    };

    public void setCarBrand(String newCarBrand){
        if(newCarBrand.isEmpty()){
            System.out.println("Car brand field can not be empty");
        }
        else{
            carBrand = newCarBrand;
        }
    }
    public String getCarBrand(){
        return carBrand;
    }

    public void setCarColor(String newCarColor){
        if(newCarColor.isEmpty()){
            System.out.println("The car color field can not be empty!");
        }
        else {
            newCarColor = carColor;
        }
    }

    public String getCarColor(){
        return carColor;
    }

    public void setPlateNo(String newPlateNo){
        if (newPlateNo.isEmpty()){
            System.out.println("The plate number field can not be empty!");
        }
        else{
            plateNo = newPlateNo;
        }
    }

    public String getPlateNo(){
        return plateNo;
    }

    @Override
    public String toString() {
        return "This car is of " + carBrand + " brand, and is colored " + carColor + " ,and it has a plate number of " + plateNo  ;
    }
}
