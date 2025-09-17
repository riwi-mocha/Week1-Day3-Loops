import java.util.Scanner;

public class Task9{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base = 0.0;
        int exponent = 0;

        while(true){
            try{
                System.out.print("Enter the base (real number): ");
                base = scanner.nextDouble();
                break;
            } catch (Exception e){
                System.out.println("Error: Please enter a valid real number");
                scanner.nextLine(); 
            }
        }

        while(true){
            try{
                System.out.print("Enter the exponent (positive integer): ");
                exponent = scanner.nextInt();
                if(exponent >= 0) break;
                System.out.println("Error: The exponent must be a positive integer (or zero)");
            } catch (Exception e){
                System.out.println("Error: Please enter a valid integer");
                scanner.nextLine(); 
            }
        }

      
        double result = 1.0;

        for(int i = 1; i <= exponent; i++){
            result = result * base;
        }

        System.out.println(base + " raised to the power of " + exponent + " = " + result);

        scanner.close();
    }
}