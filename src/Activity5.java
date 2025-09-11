import java.util.Scanner;

public class Activity5 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese un caracter: ");
            String character = scanner.nextLine().toLowerCase();
            if(character.equals(" ")){
                System.out.println("Cerrando...");
                break;
            }

            if(character.length() >= 2){
                System.out.println("Error, solo puedes ingresar un caracter.");
                continue;
            }


            if(character.equals("a") || character.equals("e") || character.equals("i") || character.equals("o") || character.equals("u")){
                System.out.println("VOCAL");
            } else {
                System.out.println("NO VOCAL");
            }
        }

        scanner.close();

    }
}
