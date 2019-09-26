package exercises;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsLooped {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int yourGuess;
        int wins = 0;
        int tries = 0;
        String winResult = null;

        while(wins < 5 ) {
            System.out.println("Choose between Rock, Paper, or Scissors \n pick 1 for rock \n pick 2 for paper \n pick 3 for scissors \n Choice >>>>");
            yourGuess = input.nextInt();
            int opponentGuess= rand.nextInt(3) + 1;
            ++tries;

            if (yourGuess == 1) {
                if (opponentGuess == 1)
                    winResult = "You both tied.";
                else if (opponentGuess == 2)
                    winResult = "Paper covers rock, you lose.";
                else if (opponentGuess == 3) {
                    winResult = "Rock breaks scissors, you win.";
                    ++wins;
                }
            }
            else if (yourGuess == 2) {
                if (opponentGuess == 1) {
                    winResult = "Paper covers rock, you win.";
                    ++wins;
                }
                else if (opponentGuess == 2)
                    winResult = "You both tied.";
                else if (opponentGuess == 3)
                    winResult = "Paper cuts scissors, you lose.";
            }
            else if (yourGuess == 3) {
                if (opponentGuess == 1)
                    winResult = "Rock crushes scissors, you lose.";
                else if (opponentGuess == 2){
                    winResult = "Scissors cuts paper, you win.";
                    ++wins;
                }
                else if (opponentGuess == 3)
                    winResult = "You both tie.";
            }
            System.out.println(winResult);
        }
        System.out.println("You won in " + tries + " tries.");
    }
}
