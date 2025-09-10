import java.util.Random;
import java.util.Scanner;

public class Activity2 {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(100)+1;

        int remainingTries = 10;
        int guessNumber;

        while (true) {

            if(remainingTries == 0){
                System.out.println("Haz perdido.");
                System.out.println("El numero era " + randomNumber);
                break;
            }
            remainingTries--;
            
            System.out.print("Ingresa un numero: ");
            guessNumber = scanner.nextInt();
            
            if(guessNumber == randomNumber){
                System.out.println("Haz adivinado el numero!!");
                System.out.println("Numero adivinado con " + (10-remainingTries) + " intentos.");
                break;
            } else if (guessNumber < randomNumber){
                System.out.println("Tu numero es menor.");
                System.out.println("Te quedan " + remainingTries + " intentos.");
            } else {
                System.out.println("Tu numero es mayor.");
                System.out.println("Te quedan " + remainingTries + " intentos.");
            }

        }

        scanner.close();

    }


}
