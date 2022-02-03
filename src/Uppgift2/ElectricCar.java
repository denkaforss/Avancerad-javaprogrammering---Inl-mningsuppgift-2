package Uppgift2;

public class ElectricCar extends Car{
    /*void engineStart(){
        System.out.println("*Silence*");
    }*/

    @Override
    void startEngine() {
        System.out.println("Bzzzzzz");
    }
}
