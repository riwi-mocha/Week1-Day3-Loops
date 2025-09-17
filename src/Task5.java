import java.util.Scanner;

public class Task5{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter characters (enter space to finish):");

        while(true){
            System.out.print("Enter a character: ");
            String input = scanner.nextLine();

            if(input.length() == 0){
                continue;
            }

            char character = input.charAt(0);

            if(character == ' '){
                System.out.println("Program finished.");
                break;
            }

            char lowerChar = Character.toLowerCase(character);

            if(lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' ||
               lowerChar == 'o' || lowerChar == 'u'){
                System.out.println("VOCAL");
            } else {
                System.out.println("NO VOCAL");
            }
        }

        scanner.close();
    }
}