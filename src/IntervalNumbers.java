import java.util.Scanner;

public class IntervalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lower, upper;

        do {
            System.out.print("Ingrese el limite inferior: ");
            lower = sc.nextInt();
            System.out.print("Ingrese el limite superior: ");
            upper = sc.nextInt();
        } while (lower >= upper);

        int number, sum = 0, outside = 0;
        boolean equalToLimit = false;

        System.out.println("Ingrese numeros (0 para terminar):");

        while (true) {
            number = sc.nextInt();
            if (number == 0) break;

            if (number > lower && number < upper) {
                sum += number;
            } else {
                outside++;
            }

            if (number == lower || number == upper) {
                equalToLimit = true;
            }
        }

        System.out.println("Suma dentro del intervalo: " + sum);
        System.out.println("Cantidad fuera del intervalo: " + outside);
        if (equalToLimit) {
            System.out.println("Se introdujo al menos un numero igual a los limites.");
        }

        sc.close();
    }
}
