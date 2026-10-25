public class Week2_Expert_PrecedencePuzzleSolver {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        
        // Expression 1
        // PREDICTED result: false
        boolean result1 = x + 5 * 2 > y && ++x == 6;
        System.out.println("Expression 1 Actual Result: " + result1);
        /*
        Prediction was true. Multiplication (*) happens before addition (+). 
        5 * 2 = 10, plus 5 = 15. 15 > 10 is true. 
        Logical AND (&&) evaluates the right side: ++x makes x 6, 6 == 6 is true.
        true && true = true. I predicted false by incorrectly reading left-to-right 
        addition before multiplication.
         */

        // Expression 2
        // PREDICTED result: 25
        int a = 10;
        int b = 5;
        int result2 = a++ + b * 3 - --b;
        System.out.println("Expression 2 Actual Result: " + result2);
        /*
        Prediction was 21. Actual is 21. 
        b * 3 evaluates first (5 * 3 = 15). 
        a++ evaluates as 10 (and a becomes 11).
        --b evaluates to 4 (since b was 5).
        Equation becomes: 10 + 15 - 4 = 21.
         */
         
        // Expression 3
        // PREDICTED result: true
        boolean result3 = (y % 3 == 1) || (x++ < 5) && (y > 5);
        System.out.println("Expression 3 Actual Result: " + result3);
        /*
        Prediction was true.
        y % 3 is 10 % 3 = 1. 1 == 1 is true.
        Because of short-circuit evaluation in the logical OR (||), 
        the left side is true, so the right side ((x++ < 5) && (y > 5)) is never evaluated.
        The result is true.
         */
    }
}
