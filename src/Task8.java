import java.util.Scanner;

public class Task8{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lowerLimit = 0;
        int upperLimit = 0;

        
        while(true){
            while(true){
                try{
                    System.out.print("Enter the lower limit of the interval: ");
                    lowerLimit = scanner.nextInt();
                    break;
                } catch (Exception e){
                    System.out.println("Error: Please enter a valid number");
                    scanner.nextLine(); 
            }

            while(true){
                try{
                    System.out.print("Enter the upper limit of the interval: ");
                    upperLimit = scanner.nextInt();
                    break;
                } catch (Exception e){
                    System.out.println("Error: Please enter a valid number");
                    scanner.nextLine(); 
                }
            }

            if(lowerLimit <= upperLimit){
                break;
            } else {
                System.out.println("Error: Lower limit must be less than or equal to upper limit");
                System.out.println("Please enter the limits again.");
            }
        }

        System.out.println("Interval: [" + lowerLimit + ", " + upperLimit + "]");
        System.out.println("Enter numbers (enter 0 to finish):");


        int sumInsideInterval = 0;
        int numbersOutsideInterval = 0;
        boolean foundEqualToLimits = false;

        while(true){
            try{
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();

                if(number == 0){
                    break;
                }

                if(number == lowerLimit || number == upperLimit){
                    foundEqualToLimits = true;
                }

                if(number > lowerLimit && number < upperLimit){
                    sumInsideInterval += number;
                } else {
                    numbersOutsideInterval++;
                }

            } catch (Exception e){
                System.out.println("Error: Please enter a valid number");
                scanner.nextLine(); 
            }
        }

        System.out.println("\nResults:");
        System.out.println("Sum of numbers inside open interval (" + lowerLimit + ", " + upperLimit + "): " + sumInsideInterval);
        System.out.println("Numbers outside the interval: " + numbersOutsideInterval);

        if(foundEqualToLimits){
            System.out.println("At least one number was entered equal to the interval limits");
        } else {
            System.out.println("No numbers were entered equal to the interval limits");
        }

        scanner.close();
    }
}