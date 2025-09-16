
import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Guess a number between 1 and 50. You have 10 tries.");
        int numberToGuess = random.nextInt(50) + 1; // The number to guess
        int userGuess = scanner.nextInt(); // User's guess

        int tries = 1;
        while (userGuess != numberToGuess && tries < 10) {
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
                tries++;
            } else {
                System.out.println("Too high! Try again.");
                tries++;
            }
            userGuess = scanner.nextInt(); // Get a new guess from the user
        }
        if (tries == 10) {
            System.out.println("Sorry, you've used all your tries. The correct number was: " + numberToGuess);
        } else {
            System.out.println("Congratulations! You've guessed the correct number: " + numberToGuess);
        }
        scanner.close();
    }
}
