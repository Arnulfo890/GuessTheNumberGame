package com.codewithme;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to Guess The Number Challenge");
        String proceedingStatement;
        int userInput;
        int guessNumber;

        while(true) {
            System.out.print("Wanna test your luck? (type = Yes): ");
            proceedingStatement = scanner.nextLine();
            if (proceedingStatement.equals("Yes") || proceedingStatement.equals("yes"))
                break;
            System.out.println("Error ---> Please Enter Yes");
        }
        while(true) {
            System.out.println("\nThis Program Uses a Random Picker so if you guess the Number Correctly it means you are a God :D ");
            System.out.print("Enter your lucky number between (1-10): ");
            Random randomNumberInitiator = new Random();
            guessNumber = randomNumberInitiator.nextInt(10) + 1;
            userInput = scanner.nextInt();
                if (userInput == guessNumber) {
                    System.out.println("\nThe Lucky Number is: " + guessNumber);
                    System.out.println("Congratulations! You Got The Correct Number!");
                    break;
                } else
                    System.out.println("\nThe Lucky Number is: " + guessNumber);
                    System.out.println("Wrong Number Try Again !!");
        }

    }
}
