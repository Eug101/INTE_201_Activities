public class Week2_Advanced_CompoundGrowthIncrementTracker {
    public static void main(String[] args) {
        
        double balance = 1000.0;
        System.out.println("Initial Balance: ₱" + balance);
        /* Starting from an initial balance, apply += and *= across at least 3 separate 
        statements to simulate growth over time, printing the balance after each step. */
        
        balance += 500.0; // Statement 1
        System.out.println("Balance after adding ₱500: ₱" + balance);
        
        balance *= 1.05; // Statement 2 (5% interest)
        System.out.println("Balance after 5% interest: ₱" + balance);
        
        balance += 200.0; // Statement 3
        System.out.println("Balance after adding ₱200: ₱" + balance);
        
        System.out.println("\n--- Increment Tracker ---");
        int count = 5;
        
        /* Declare a counter variable and print the result of count++ 
        inside a printIn(), then print count again immediately after.*/
        System.out.println("Result of count++: " + (count++)); 
        System.out.println("Value of count immediately after: " + count);
        
        /* •	Repeat with ++count and explain in a comment exactly 
        why the two printed values differ. */
        System.out.println("Result of ++count: " + (++count));
        
        /*
         * Explanation of why the two printed values differ:
         * 1. Postfix (count++): The current value of 'count' (5) is evaluated and printed FIRST. 
         *    Then, the variable is incremented to 6 in the background.
         * 2. Prefix (++count): The variable is incremented FIRST (from 6 to 7). 
         *    Then, the new evaluated value (7) is returned and printed.
         */
    }
}
