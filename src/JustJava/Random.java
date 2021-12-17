package JustJava;

import com.shpp.cs.a.console.TextProgram;

public class Random extends TextProgram {
    public void run() {
        long prize = 0;
        long games = 0;
        long firstPlayer = 0;
        while (firstPlayer < 100_000_000){
            firstPlayer = 1;
            long coin = (long) (Math.random() * 2);
            games++;
            while (coin == 1){
                firstPlayer *= 2;
                coin = (long) (Math.random() * 2);
            }
            System.out.println("This game, you earned $" + firstPlayer);
            prize += firstPlayer;
            if (prize > 12_000) prize = 0;
            System.out.println("Your total is $" + prize);
        }
        System.out.println("It took " + games + " games to earn $" + prize);

    }
}
