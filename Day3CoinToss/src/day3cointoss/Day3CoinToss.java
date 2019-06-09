package day3cointoss;

import java.util.Random;

public class Day3CoinToss {

    public String tossACoin() {
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) % 2;

        if (toss == 0) {
            return "HEADS";
        } else {
            return "TAILS";
        }

    }

    public static void main(String[] args) {
        //TODO code application logic here
        Day3CoinToss game = new Day3CoinToss();
        
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());

    }

}
