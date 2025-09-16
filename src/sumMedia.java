
import java.util.Scanner;

public class sumMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        int sum = 0;
        int counter = 0;
        double media;

        while (num != 0) {
            System.out.print("Enter a number (0 to exit): ");
            num = scanner.nextInt();
            sum += num;
            if (num != 0) {
                counter++;
            }
        }
        if (counter > 0) {
            media = (double) sum / counter;
            System.out.println("The sum of the entered numbers is: " + sum);
            System.out.println("The average of the entered numbers is: " + media);
        } else {
            System.out.println("You didn't enter any numbers.");
        }
        scanner.close();
    }
}
