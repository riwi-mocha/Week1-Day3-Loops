import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int quantityNumbers = 0;
        int currentNumber = 0;

        while (true) {
            
            System.out.print("Ingrese un numero entero positivo: ");
            currentNumber = scanner.nextInt();
            
            if (currentNumber<0) {
                System.out.println("Error, el numero debe ser positivo.");
                continue;
            }

            quantityNumbers++;
            sum+= currentNumber;


            if(currentNumber == 0){
                System.out.println("La suma de los numeros es " + sum);
                System.out.println("El promedio es " + ((double)sum/quantityNumbers));
                break;
            }

        }

        scanner.close();

    }
}
