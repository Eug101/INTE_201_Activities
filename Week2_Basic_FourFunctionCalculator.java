import java.util.Scanner;

public class Week2_Basic_FourFunctionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /* Read two integers from the user (or declare them if input isn't required yet). */
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        
        /* Print the result of +, -, *, /, and % applied to the two numbers, each on its own labeled line. */
        System.out.println("Addition (+): " + (num1 + num2));
        System.out.println("Subtraction (-): " + (num1 - num2));
        System.out.println("Multiplication (*): " + (num1 * num2));
        System.out.println("Division (/): " + (num1 / (double) num2)); // cast to double for precision
        System.out.println("Modulo (%): " + (num1 % num2));
        
        /* Use a comment to note which operation(s) behave differently for negative operands
           The modulo (%) operator behaves differently with negative numbers in Java. The sign of the result always matches 
           the sign of the dividend (the first operand).
         */
         
        scanner.close();
    }
}
