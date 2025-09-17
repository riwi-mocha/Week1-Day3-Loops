import java.util.Scanner;

public class Task7{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        while(true){
            try{
                System.out.print("Enter a number to see its multiplication table: ");
                number = scanner.nextInt();
                break;
            } catch (Exception e){
                System.out.println("Error: Please enter a valid number");
                scanner.nextLine(); 
            }
        }

        System.out.println("\nMultiplication table of " + number + ":");
       

        for(int i = 1; i <= 10; i++){
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }

        scanner.close();
    }
}