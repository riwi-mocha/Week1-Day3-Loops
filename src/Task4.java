import java.util.Scanner;

public class Task4{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumbers = 0;
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        while(true){
            try{
                System.out.print("How many numbers do you want to enter? ");
                totalNumbers = scanner.nextInt();
                if(totalNumbers > 0) break;
                System.out.println("Error: Please enter a positive number");
            } catch (Exception e){
                System.out.println("Error: Please enter a valid number");
                scanner.nextLine(); 
            }
        }

        System.out.println("Enter " + totalNumbers + " numbers:");

        for(int i = 1; i <= totalNumbers; i++){
            while(true){
                try{
                    System.out.print("Enter number " + i + ": ");
                    int number = scanner.nextInt();

                    if(number > 0){
                        positiveCount++;
                    } else if(number < 0){
                        negativeCount++;
                    } else {
                        zeroCount++;
                    }
                    break;

                } catch (Exception e){
                    System.out.println("Error: Please enter a valid number");
                    scanner.nextLine(); // Clear buffer
                }
            }
        }

        System.out.println("\nResults:");
        System.out.println("Numbers greater than 0: " + positiveCount);
        System.out.println("Numbers less than 0: " + negativeCount);
        System.out.println("Numbers equal to 0: " + zeroCount);
        System.out.println("Total numbers entered: " + totalNumbers);

        scanner.close();
    }
}