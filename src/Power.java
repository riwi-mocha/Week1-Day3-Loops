import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base (real): ");
        double base = sc.nextDouble();
        System.out.print("Ingrese el exponente (entero positivo): ");
        int exponent = sc.nextInt();

        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        System.out.println("Resultado: " + result);
        sc.close();
    }
}
