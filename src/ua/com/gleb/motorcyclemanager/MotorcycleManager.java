package ua.com.gleb.motorcyclemanager;

public class MotorcycleManager {
    public static void main(String[] args) {

        Motorcycle suzuki = new Motorcycle("Suzuki GSZ-R1000", 2021,
                1600, 600, Color.BLACK, EngineType.DIESEL, true);

        Motorcycle yamaha = new Motorcycle("Yamaha FZ1", 2007,
                9000, 700, Color.ORANGE, EngineType.GAS, false);


        System.out.println(suzuki);
        System.out.println(yamaha);

        System.out.println(yamaha.equals(suzuki));
    }
}
