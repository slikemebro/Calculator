package ua.com.gleb.human;

public class HumanManager {
    public static void main(String[] args) {
        Human h1 = new Human("Gleb", "Korobov", 18, Country.UKRAINE,
                "10.01.2004", ColorOfHair.BLOND, 3_212_012, 0);
        Human h2 = new Human("Nikita", "Zaets", 18, Country.UKRAINE,
                "23.05.2003", ColorOfHair.BLACK, 1_123_543, 0);

        Human h3 = new Children("Sasha", "Petrun", 20, Country.RUSSIAN,
                "23.05.1999", ColorOfHair.RED, 2_321_932, 0);

        System.out.println();
        System.out.println();

        h1.birthday();
        h2.changeHairColor(ColorOfHair.RED);
        h3.birthday();

        h2.death("20.05.2050");

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

        System.out.println();

        h3.takeShower();


    }
}
