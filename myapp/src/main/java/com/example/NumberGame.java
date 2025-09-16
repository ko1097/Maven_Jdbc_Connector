package com.example;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public void letStart() {
        Random rand = new Random();
        int target = rand.nextInt(50) + 1;         // 1-50
        int TotalChance = rand.nextInt(5) + 1;    // 1-5
        Scanner sc = new Scanner(System.in);
        int guess;
        int attempts = 0;

        System.out.println("Welcome to Number Guessing Game! Guess a number between 1 and 50.");
        System.out.println("You have " + TotalChance + " attempts.");

        do {
            System.out.print("Guess the number: ");
            guess = sc.nextInt();
            attempts++;
            int chanceLeft = TotalChance - attempts;
            if (guess < target) {
                System.out.println("Too low! Kindly guess a higher number.");
            } else if (guess > target) {
                System.out.println("Too high! Kindly guess a lower number.");
            }

            if (guess != target && attempts < TotalChance) {
                System.out.println("You have " + chanceLeft + " attempts left.");
            }

        } while (guess != target && attempts < TotalChance);

        if (guess == target) {
            System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
        } else {
            System.out.println("OOPS! All your chances are over. The number was " + target + ".");
        }
        

        sc.close();
    }
}