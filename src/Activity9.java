import java.util.Scanner;

public class Activity9 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base (numero real): ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese el exponente (entero positivo): ");
        int exponent = scanner.nextInt();

        if(base == 0 && exponent == 0){
            System.out.println("La base y el exponente no pueden ser ambos cero.");
        } else if (exponent < 0) {
            System.out.println("El exponente debe ser un número entero positivo.");
        } else {

            double result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
            System.out.println("El resultado de " + base + " elevado a la " + exponent + " es: " + result);
        }

        scanner.close();
    }
}
