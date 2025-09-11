import java.util.Scanner;

public class Activity6 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el limite inferior: ");
        int inferiorLimit = scanner.nextInt();

        System.out.print("Ingresa el limite superior: ");
        int superiorLimit = scanner.nextInt();
        int firstEven = inferiorLimit % 2 == 1 ? (inferiorLimit + 1) : inferiorLimit;

        if(firstEven <= superiorLimit ){

            int currentEven = firstEven;
            while (true) {
                System.out.println(currentEven);
                currentEven+= 2;

                if(currentEven>superiorLimit) break;
            }


        }else {
            System.out.println("No hay numeros pares entre los numeros que diste:");
        }

        scanner.close();
    }


}
