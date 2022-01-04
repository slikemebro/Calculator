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
    private double distance = 0;

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

    public void adDistance(int additinalDistance){
        distance += additinalDistance;
        if (distance >= 200_000){
            destroyEngine();
        }
    }

    public void adDistance(double additinalDistance){
        distance += additinalDistance;
        if (distance >= 200_000){
            destroyEngine();
        }
    }

    public double getDistance() {
        return distance;
    }

    public void repair(){
        isReadyToDrive = true;
    }

    public void destroyEngine(){
        isReadyToDrive = false;
    }

    public void changeColor(Color color){
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Motorcycle)) return false;
        Motorcycle that = (Motorcycle) o;
        return isReadyToDrive == that.isReadyToDrive && Double.compare(that.getDistance(), getDistance()) == 0 && color == that.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, isReadyToDrive, getDistance());
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color=" + color +
                ", engineType=" + engineType +
                ", isReadyToDrive=" + isReadyToDrive +
                ", distance=" + Math.round(distance) +
                '}';
    }
}
