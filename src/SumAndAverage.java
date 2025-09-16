import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, sum = 0, count = 0;

        System.out.println("Ingrese numeros (0 para terminar):");

        while (true) {
            number = sc.nextInt();
            if (number == 0) break;
            sum += number;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Suma: " + sum);
            System.out.println("Media: " + average);
        } else {
            System.out.println("No se ingresaron numeros.");
        }

        sc.close();
    }
}
