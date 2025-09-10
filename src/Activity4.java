import java.util.Scanner;

public class Activity4 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de numeros que usted ingresara: ");
        int quantityNumbers = scanner.nextInt();

        int numbersAboveCero = 0;
        int numbersBelowCero = 0;
        int numbersEqualCero = 0;

        for (int i = 0; i < quantityNumbers; i++) {
            
            System.out.print("Ingrese un numero: ");
            int currentNumber = scanner.nextInt();

            if(currentNumber>0){
                numbersAboveCero++;
            } else if(currentNumber<0){
                numbersBelowCero++;
            } else {
                numbersEqualCero++;
            }


        }

        System.out.println("La cantidad de numeros mayores a cero es " + numbersAboveCero);
        System.out.println("La cantidad de numeros menores a cero es " + numbersBelowCero);
        System.out.println("La cantidad de numeros iguales a cero es " + numbersEqualCero);

        scanner.close();

    }

}
