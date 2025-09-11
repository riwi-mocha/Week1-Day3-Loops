import java.util.Scanner;

public class Activity8 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el limite superior: ");
        int superiorLimit = scanner.nextInt();

        int inferiorLimit;

        do {
            System.out.print("Ingrese el limite inferior: ");
            inferiorLimit = scanner.nextInt();
            if(inferiorLimit>superiorLimit){
                continue;
            } else {
                break;
            }
        } while (true);

    }
}
