import java.util.Scanner;

public class Task6{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = 0;
        int secondNumber = 0;

        while(true){
            try{
                System.out.print("Enter the first number: ");
                firstNumber = scanner.nextInt();
                break;
            } catch (Exception e){
                System.out.println("Error: Please enter a valid number");
                scanner.nextLine(); 
            }
        }

        while(true){
            try{
                System.out.print("Enter the second number: ");
                secondNumber = scanner.nextInt();
                break;
            } catch (Exception e){
                System.out.println("Error: Please enter a valid number");
                scanner.nextLine(); 
            }
        }

        int start = Math.min(firstNumber, secondNumber);
        int end = Math.max(firstNumber, secondNumber);

        System.out.println("Even numbers between " + start + " and " + end + ":");

        boolean foundEven = false;
        for(int i = start; i <= end; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
                foundEven = true;
            }
        }

        if(!foundEven){
            System.out.println("No even numbers found in this range.");
        } else {
            System.out.println(); 
        }

        scanner.close();
    }
}