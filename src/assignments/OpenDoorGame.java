package assignments;

import java.util.Scanner;

public class OpenDoorGame {

    public static void main(String[] args){

        int choice;
        String result = null;

        Scanner input = new Scanner(System.in);

        System.out.print("Pick from doors one through three>>>>");
        choice = input.nextInt();

        if(choice == 1)
            result = "You won aching bones, your bones will ache for eternity. Have fun, buddy.";
        else if(choice == 2)
            result = "You found the black hole door! The Earth will perish for your foolish choices.";
        else if(choice == 3)
            result = "I don't know man, here's a keychain from Detroit. That's pretty dope, right?";
        else
            result = "There is no door " + choice + ". Great job messing up a simple task, idiot";

        System.out.print(result);

    }
}
