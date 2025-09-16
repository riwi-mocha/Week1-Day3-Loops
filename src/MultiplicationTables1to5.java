public class MultiplicationTables1to5 {
    public static void main(String[] args) {
        for (int n = 1; n <= 5; n++) {
            System.out.println("Tabla del " + n + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
            System.out.println();
        }
    }
}
