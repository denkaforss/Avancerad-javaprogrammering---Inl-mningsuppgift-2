package Uppgift2;

public class CarFactory {

    public Car buildCar(String carType){

        if (carType.equals("electric")){
            return new ElectricCar();
        } else if (carType.equals("diesel")){
            return new DieselCar();
        } else {
            return null;
        }
    }
}
