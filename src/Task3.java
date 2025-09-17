import java.util.Scanner;

public class Task3{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int number;

        System.out.println("Enter numbers (enter 0 to finish):");

        while(true){
            try{
                System.out.print("Enter a number: ");
                number = scanner.nextInt();

                if(number == 0){
                    break;
                }

                sum += number;
                count++;

            } catch (Exception e){
                System.out.println("Error: Please enter a valid number");
                scanner.nextLine();
            }
        }

        if(count > 0){
            double average = (double) sum / count;
            System.out.println("Sum of all numbers: " + sum);
            System.out.println("Average of all numbers: " + average);
            System.out.println("Total numbers entered: " + count);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}