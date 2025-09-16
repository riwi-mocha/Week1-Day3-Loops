import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int secret = rand.nextInt(100) + 1;
        int attempts = 10;
        boolean guessed = false;

        System.out.println("Adivine el numero entre 1 y 100. Tiene 10 intentos.");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Intento " + i + ": ");
            int guess = sc.nextInt();

            if (guess == secret) {
                System.out.println("Correcto! Adivino en " + i + " intentos.");
                guessed = true;
                break;
            } else if (guess < secret) {
                System.out.println("El numero es mayor.");
            } else {
                System.out.println("El numero es menor.");
            }
        }

        if (!guessed) {
            System.out.println("Se acabaron los intentos. El numero era: " + secret);
        }

        sc.close();
    }
}
