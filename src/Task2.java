import java.util.Scanner;
import java.util.Random;

public class Task2{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(100) + 1; 
        int maxAttempts = 10;
        int attempts = 0;
        boolean hasWon = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have generated a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        while(attempts < maxAttempts && !hasWon){
            int remainingAttempts = maxAttempts - attempts;
            System.out.print("Enter your guess (attempts remaining: " + remainingAttempts + "): ");

            try{
                int guess = scanner.nextInt();
                attempts++;

                if(guess == targetNumber){
                    hasWon = true;
                    System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + attempts + " attempts!");
                } else if(guess < targetNumber){
                    System.out.println("The number is higher than " + guess);
                } else {
                    System.out.println("The number is lower than " + guess);
                }

            } catch (Exception e){
                System.out.println("Error: Please enter a valid number");
                scanner.nextLine(); 
            }
        }

        if(!hasWon){
            System.out.println("Game over! You've used all " + maxAttempts + " attempts.");
            System.out.println("The number was: " + targetNumber);
        }

        scanner.close();
    }
}