package ua.com.gleb.motorcyclemanager;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Motorcycle)) return false;
        Motorcycle that = (Motorcycle) o;
        return isReadyToDrive == that.isReadyToDrive && Objects.equals(name, that.name) && color == that.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, isReadyToDrive);
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color=" + color.getColor() +
                ", engineType=" + engineType +
                ", isReadyToDrive=" + isReadyToDrive +
                '}';
    }
}
