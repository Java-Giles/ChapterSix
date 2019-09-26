package exercises;

import java.util.Scanner;

public class EvenEntryLoop {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int userEntry = 0;

        while(userEntry != 999){
            System.out.println("Please enter a number to see if it is even, press 999 to end the loop>>>");
            userEntry = input.nextInt();

            if(userEntry % 2 == 0)
                System.out.println("Good job!");
            else
                System.out.println("That isn't an even number, enter another.");
        }
    }
}
