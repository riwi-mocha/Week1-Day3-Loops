import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;

        System.out.println("Ingrese caracteres :");

        while (true) {
            ch = sc.next().charAt(0);
            if (ch == ' ') break;

            if ("aeiouAEIOU".indexOf(ch) != -1) {
                System.out.println("Es una vocal");
            } else {
                System.out.println("No es una vocal");
            }
        }

        sc.close();
    }
}
