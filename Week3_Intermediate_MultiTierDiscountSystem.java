public class Week3_Intermediate_MultiTierDiscountSystem {
    public static void main(String[] args) {
        /* Declare a double purchaseAmount variable */
        double purchaseAmount = 150.00;
        double discountPercent = 0.0;
        String tier = "";

        /* Use an else-if ladder with at least 4 branches to assign a discount percentage 
        (e.g., 0%, 5%, 10%, 15%) based on increasing amount ranges. */
        /* Make sure ranges are ordered correctly so no tier is unreachable. */
        if (purchaseAmount >= 200.0) {
            discountPercent = 0.15;
            tier = "15% Tier";
        } else if (purchaseAmount >= 100.0) {
            discountPercent = 0.10;
            tier = "10% Tier";
        } else if (purchaseAmount >= 50.0) {
            discountPercent = 0.05;
            tier = "5% Tier";
        } else {
            discountPercent = 0.0;
            tier = "0% Tier";
        }

        double finalPrice = purchaseAmount - (purchaseAmount * discountPercent);
        
        /* Print both the assigned discount tier and the final discounted price. */
        System.out.println("Discount Tier: " + tier);
        System.out.println("Final Discounted Price: ₱" + finalPrice);
    }
}
