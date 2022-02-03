package Uppgift2;

public class DieselCar extends Car{
    void engineStart(){
        System.out.println("Vrooooom");
    }

    @Override
    void startEngine() {
        System.out.println("Vrooooom");
    }
}
