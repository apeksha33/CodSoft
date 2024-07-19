import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        int numberOfTries = 0;
        int guess = 0;
        boolean hasWon = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        while (!hasWon) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess < 1 || guess > 100) {
                System.out.println("Invalid guess.  Please guess a number between 1 and 100");
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Try again!");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is too high. Try again!");
            } else {
                hasWon = true;
                System.out.println("Congratulations! You've guessed the correct number");
                System.out.println("It took you " + numberOfTries + " tries.");
            }
        }

        scanner.close();
    }
}
