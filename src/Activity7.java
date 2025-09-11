import java.util.Scanner;

public class Activity7 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Ingrese un numero para generar la tabla de multiplicar: ");
        int numberInserted = scanner.nextInt();
        if(numberInserted==0){
            System.out.println("No se puede generar la tabla de multiplicar de 0.");
            scanner.close();
            return;
        }

        int currentProduct = 0;

        System.out.println("Tabla de multiplicar del " + numberInserted);
        for (int i = 1; i < 11; i++) {

            currentProduct = numberInserted*i;
            System.out.printf("%d * %d = %d\n",numberInserted,i,currentProduct);
        }

        scanner.close();

    }
}
