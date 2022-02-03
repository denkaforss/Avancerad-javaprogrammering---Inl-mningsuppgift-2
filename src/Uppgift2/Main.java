package Uppgift2;

public class Main {
    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();
        Car electricCar = carFactory.buildCar("electric");
        Car dieselcar = carFactory.buildCar("diesel");
        electricCar.startEngine();
        dieselcar.startEngine();

    }
}

