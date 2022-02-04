package ua.com.gleb.motorcyclemanager;

public class StreetBike extends Motorcycle{
    public StreetBike(String name, int yearOfProduction, int price, int weight, Color color, TypeOfWheel soft, EngineType engineType, boolean isReadyToDrive) {
        super(name, yearOfProduction, price, weight, color, engineType, isReadyToDrive);
    }
}
