public class Task10{

    public static void main(String[] args) {

        System.out.println("Multiplication tables for numbers 1, 2, 3, 4, and 5:");
        System.out.println("=====================================================");

        for(int table = 1; table <= 5; table++){
            System.out.println("\nMultiplication table of " + table + ":");
            System.out.println("-------------------------");

            for(int i = 1; i <= 10; i++){
                int result = table * i;
                System.out.println(table + " x " + i + " = " + result);
            }
        }
    }
}