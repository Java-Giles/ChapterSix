package examples;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int randPick= rand.nextInt(100) + 1;
        int choice = 999;
        int counter = 0;

        while( choice != randPick) {


            System.out.println("Pick a number between 1 and 100>>>> ");
            choice = input.nextInt();

            if (choice == randPick) {
                System.out.println("Congrats! You're a good guesser");
            } else if (choice > randPick) {
                System.out.println("Nope, the number was lower.");
            } else if (choice < randPick) {
                System.out.println("Nope, the number was higher.");
            }
            counter++;
        }
        System.out.println("It took you " + counter + " guesses.");
    }
}
