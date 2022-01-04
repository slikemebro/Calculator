package ua.com.gleb.motorcyclemanager;

public class Motorcycle {
    String name;
    int yearOfProduction;
    int price;
    int weight;
    Color color;
    EngineType engineType;
    boolean isReadyToDrive;

    public Motorcycle(String name, int yearOfProduction, int price, int weight,
                      Color color, EngineType engineType, boolean isReadyToDrive) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.engineType = engineType;
        this.isReadyToDrive = isReadyToDrive;
    }
}
