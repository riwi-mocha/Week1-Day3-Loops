import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int start = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int end = sc.nextInt();

        System.out.println("Numeros pares en el rango:");

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
