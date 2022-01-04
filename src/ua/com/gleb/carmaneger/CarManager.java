package ua.com.gleb.carmaneger;

public class CarManager {
    public static void main(String[] args) {
        Car prius = new PassengerCar("Toyota Prius", 2008, 15000,
                1200, Color.GREEN);

        Car renault = new Bus("Renault Laguna", 2000, 9700,
                1600, Color.WHITE);

        prius.adDistance(15000);
        renault.adDistance(15000);

        System.out.println(prius);
        System.out.println(renault);

        System.out.println(prius.isReadyToService());
        System.out.println(renault.isReadyToService());
    }
}
