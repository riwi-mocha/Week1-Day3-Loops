import java.util.Scanner;

public class Task1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        
        while(true){
            try{
                System.out.print("Enter a number to calculate its factorial: ");
                number = scanner.nextInt();
                if(number >= 0) break;
                System.out.println("Error, the number must be positive");
            } catch (Exception e){
                System.out.println("Error getting the number");
                scanner.nextLine(); 
            }
        }
        int originalNumber = number;

        int result = 1;

        for(int i = 1; i <= number; i++){
            result = result * i;
        }

        System.out.println("Factorial of  " + originalNumber + " is " + result);

        scanner.close();
    }
}