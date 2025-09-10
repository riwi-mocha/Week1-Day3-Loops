import java.util.Scanner;

public class Activity1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        
        while(true){
            try{
                System.out.print("Ingrese un numero al que le gustaria calcular el factorial: ");
                number = scanner.nextInt();
                if(number >= 0) break;
                System.out.println("Error, el numero debe ser positivo");
            } catch (Exception e){
                System.out.println("Error al obtener el numero");
            }
        }
        int originalNumber = number;

        //Factorial

        int result = 1;

        while(true){

            if(number==0){
                result = result * 1;
                break;
            } else {
                result = result * number;
                number--;
            }

        }

        System.out.println("El factorial de " + originalNumber + " es " + result);

        scanner.close();
    }
}