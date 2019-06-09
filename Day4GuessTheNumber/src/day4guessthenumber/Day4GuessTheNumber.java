/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4guessthenumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author seanking
 */
public class Day4GuessTheNumber {

    int theNUMBER;
    int max;
    Scanner scanner = new Scanner(System.in);

    public Day4GuessTheNumber() {
        Random rand = new Random();
        max = 100;
        theNUMBER = Math.abs(rand.nextInt()) % (max - 1);
    }

    public void play() {
        while (true) {
            int move = scanner.nextInt();
            if (move > theNUMBER) {
                System.out.println("Your number is too big");
            } else if (move < theNUMBER) {
                System.out.println("You number is too small");

            } else {
                System.out.println("YOU GOT IT BRO");
                break;
            }
        }
    }

    public static void howBigIsMyNumber(int x) {
        if (x >= 0 && x <= 10) {
            System.out.println("Our number is pretty small");
        } else if (x >= 11 && x <= 100) {
            System.out.println("Our number is pretty big");
        } else {
            System.out.println("Our number is out of range");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Day4GuessTheNumber guessGame = new Day4GuessTheNumber();
        System.out.println("Welcome to my game. Try and guess my impossible " 
                + " number. It is between 0 " + guessGame.max + " inclusive. "
        + "Just try a number to get started.");
        guessGame.play();
    }

}
