public class Week1_Intermediate_TypeSafeShoppingCalculator {
    public static void main(String[] args) {
        /* Declare quantity (int), unitPrice (double), and storeName (String) with sensible initial values.*/
        int quantity = 3;
        double unitPrice = 315.89;
        String storeName = "TechGadgets Store";

        /* Compute totalCost using the correct arithmetic, storing the result in a properly typed variable*/ 
        /* In a comment, explain why totalCost should NOT be declared as an int.*/
        /* totalCost should NOT be declared as an int because unitPrice contains decimal values.*/
        /* Multiplying an int by a double results in a double, and forcing it into an int would truncate the cents, resulting in inaccurate monetary calculations.*/
        double totalCost = quantity * unitPrice;

        /* Print an itemized summary including the store name, quantity, unit price, and total.*/
        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: ₱" + unitPrice);
        System.out.println("Total Cost: ₱" + totalCost);
    }
}
