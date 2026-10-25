import java.util.Scanner;

public class Week4_Intermediate_SumUntilSentinelValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        
        System.out.println("Enter numbers to add to the total.");
        System.out.println("Enter -1 to stop.");
        
        /* Use a while loop that keeps reading integers and adding them to a running total. */
        while (true) {
            System.out.print("Enter an integer: ");
            int input = scanner.nextInt();
            
            if (input == -1) {
                break; /* Stop reading the instant the value -1 is entered, without including it in the total.*/
            }
            
            total += input;
        }
        
        /* Print the final total once the loop ends. */
        System.out.println("Final total: " + total);
        scanner.close();
    }
}
