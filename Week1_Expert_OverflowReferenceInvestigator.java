import java.util.Arrays;

public class Week1_Expert_OverflowReferenceInvestigator {
    public static void main(String[] args) {
        /* Demonstrate a byte variable overflowing */
        byte maxByte = 127;
        maxByte++; 
        System.out.println("Byte Overflow: " + maxByte); // Outputs: -128

        /* Create String variables using new String */
        String a = new String("test");
        String b = new String("test");
        
        /* WHY: 'a == b' evaluates to false because they are created with the 'new' keyword, */
        /* which allocates two distinct objects in memory with different reference addresses. */
        System.out.println("a == b: " + (a == b)); /* Outputs: false */
        System.out.println("a equals b: " + a.equals(b)); /* Outputs: true */

        /* Demonstrate array reference shared between two variables */
        int[] first = {10, 20, 30};
        int[] second = first; /* Shared reference */

        /* Print the first element of the original array */
        System.out.println("This is the original array: " + first[0]); // Outputs: 10
        
        /* Modifying through the shared reference */
        second[0] = 99; 
        
        /* Print the arrays after modification to show they reflect the same changes */
        System.out.println("first: " + Arrays.toString(first)); /* Outputs: [99, 20, 30] */
        System.out.println("second: " + Arrays.toString(second)); /* Outputs: [99, 20, 30] */
    }
}
