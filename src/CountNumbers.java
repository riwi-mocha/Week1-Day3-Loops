import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positives = 0, negatives = 0, zeros = 0;

        System.out.print("Cuantos numeros va a ingresar? ");
        int total = sc.nextInt();

        for (int i = 0; i < total; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int number = sc.nextInt();

            if (number > 0) positives++;
            else if (number < 0) negatives++;
            else zeros++;
        }

        System.out.println("Mayores que 0: " + positives);
        System.out.println("Menores que 0: " + negatives);
        System.out.println("Iguales a 0: " + zeros);

        sc.close();
    }
}
