package ua.com.gleb.carmaneger;

public class CarManager {
    public static void main(String[] args) {
        Car prius = new Car("Toyota Prius", 2008, 15000,
                1200, Color.GREEN);

        Car renault = new Car("Renault Laguna", 2000, 9700,
                1600, Color.WHITE);

        prius.adDistance(1000);
        prius.adDistance(1123);

        System.out.println(prius);
        System.out.println(renault);


        System.out.println(prius.equals(renault));
        System.out.println(renault.equals(renault));
    }
}
