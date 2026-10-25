public class Week4_Basic_NumberSquarePrinter{
    public static void main(String[] args) {
        /* Use a for loop to count from 1 to 10 */
        /* Change the loop bound to 20 and confirm the output still updates correctly.*/
        int limit = 20; 
        
        /* For each number, print the number and its square on the same line, clearly labeled. */
        System.out.println("Number | Square");
        System.out.println("----------------");
        
        for (int i = 1; i <= limit; i++) {
            System.out.println("  " + i + "    |   " + (i * i));
        }
    }
}
