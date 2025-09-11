public class Activity10 {
    
    public static void main(String[] args) {

        int[] productTableOfOne = productTable(1);
        for (int i = 0; i < productTableOfOne.length; i++) {
            System.out.println("1 x " + (i + 1) + " = " + productTableOfOne[i]);
        }

        System.out.println("-------------------");

        int[] productTableOfTwo = productTable(2);
        for (int i = 0; i < productTableOfTwo.length; i++) {
            System.out.println("2 x " + (i + 1) + " = " + productTableOfTwo[i]);
        }

        System.out.println("-------------------");

        int[] productTableOfThree = productTable(3);
        for (int i = 0; i < productTableOfThree.length; i++) {
            System.out.println("3 x " + (i + 1) + " = " + productTableOfThree[i]);
        }

        System.out.println("-------------------");

        int[] productTableOfFour = productTable(4);
        for (int i = 0; i < productTableOfFour.length; i++) {
            System.out.println("4 x " + (i + 1) + " = " + productTableOfFour[i]);
        }

        System.out.println("-------------------");

        int[] productTableOfFive = productTable(5);
        for (int i = 0; i < productTableOfFive.length; i++) {
            System.out.println("5 x " + (i + 1) + " = " + productTableOfFive[i]);
        }


    }

    public static int[] productTable(int number){
        int[] table = new int[10];
        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }
        return table;
    }
}
