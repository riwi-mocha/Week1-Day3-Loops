import java.util.Scanner;

public class Activity8 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el limite superior: ");
        int superiorLimit = scanner.nextInt();

        int inferiorLimit;

        do {
            System.out.print("Ingrese el limite inferior: ");
            inferiorLimit = scanner.nextInt();
            if(inferiorLimit>superiorLimit){
                continue;
            } else {
                break;
            }
        } while (true);

        int sumNumWithinLimits = 0;
        int quantityNumOutLimits = 0;
        boolean numberEqualLimit = false;

        int numberInserted;

        do{

            System.out.print("Ingrese un numero entre " + inferiorLimit + " y " + superiorLimit + ": ");
            numberInserted = scanner.nextInt();

            if(numberInserted<superiorLimit && numberInserted>inferiorLimit){
                sumNumWithinLimits += numberInserted;
            } else if (numberInserted==superiorLimit || numberInserted==inferiorLimit) {
                numberEqualLimit = true;
            } else {
                quantityNumOutLimits++;
            }

        } while (numberInserted!=0);

        System.out.println("La suma de los numeros dentro de los limites es: " + sumNumWithinLimits);
        System.out.println("La cantidad de numeros fuera de los limites es: " + quantityNumOutLimits);
        if(numberEqualLimit){
            System.out.println("Se ha ingresado un numero igual a uno de los limites");
        } else {
            System.out.println("No se ha ingresado ningun numero igual a los limites");
        }

        scanner.close();


    }
}
