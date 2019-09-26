package exercises;

import java.util.Scanner;

public class TestScoreStatistics{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int userEntry = 0;
        int count = 0;
        int high = 0;
        int low = 100;
        int average;
        int total = 0;

        while(userEntry != 999){

            System.out.println("Enter a user test score>>>");
            userEntry = input.nextInt();

            if(userEntry > high && userEntry <= 100){
                high = userEntry;
                total = total + userEntry;
                ++count;

            }
            else if(userEntry < low && userEntry >= 0){
                low = userEntry;
                total = total + userEntry;
                ++count;
            }
            else
                System.out.println("Error.");

            average = total / count;

        }
        System.out.println();
    }
}
