package ua.com.gleb.motorcyclemanager;

import java.util.ArrayList;

import java.util.List;

public class MotorcycleManager {
    public static void main(String[] args) {

        Motorcycle suzuki = new StreetBike("Suzuki GSZ-R1000", 2021,
                1600, 600, Color.BLACK, TypeOfWheel.SOFT, EngineType.DIESEL, true);

        Motorcycle yamaha = new SportBike("Yamaha FZ1", 2007,
                9000, 700, Color.ORANGE, TypeOfWheel.SPORT, EngineType.GAS, false);

        List<Motorcycle> motorcycle = new ArrayList<>();

        motorcycle.add(yamaha);
        motorcycle.add(suzuki);

        System.out.println(motorcycle);
        System.out.println();

        suzuki.adDistance(250000);
        yamaha.adDistance(250000);
        yamaha.changeColor(Color.BLACK);

        suzuki.repair();
        yamaha.repair();

        System.out.println(yamaha.equals(suzuki));


    }
}
