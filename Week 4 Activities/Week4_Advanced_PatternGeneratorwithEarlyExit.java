public class Week4_Advanced_PatternGeneratorwithEarlyExit {
    public static void main(String[] args) {
        int size = 5;
    /* Use nested loops to print a right-triangle or square pattern of a given size. */
        for (int row = 1; row <= size; row++) {
            
            if (row == 3) {
                /* Add a separate condition using continue to skip printing one specific row or column value.  */
                continue; // continue statement
            }
            
            for (int col = 1; col <= size; col++) {
                
                if (col > row) {
                    /* Add a condition that uses break to stop the INNER loop early once a specific value or position is reached. */
                    break; // break statement
                }
                
                System.out.print("* ");
            }
            System.out.println();
            /* Clearly comment which lines demonstrate break and which demonstrate continue. */
        }
    }
}
