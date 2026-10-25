public class Week3_Expert_ATMTransactionAuthorizer {
    public static void main(String[] args) {
        String dbUser = "ethangueta";
        int dbPin = 4568;
        double balance = 6500.0;
        
        String inputUser = "ethangueta";
        int inputPin = 4568;
        double withdrawalAmount = 2500.0;

        /* Use a nested if to check a username AND a 4-digit PIN before allowing anything else to proceed. */
        if (dbUser.equals(inputUser)) {
            if (dbPin == inputPin) {
                
                String tier = "";
                double dailyLimit = 0.0;
                
                /* 	Use an else-if ladder to determine the account's tier (Bronze/Silver/Gold/Platinum) from its balance. */
                if (balance >= 10000) { tier = "Platinum"; dailyLimit = 5000; }
                else if (balance >= 5000) { tier = "Gold"; dailyLimit = 3000; }
                else if (balance >= 1000) { tier = "Silver"; dailyLimit = 1000; }
                else { tier = "Bronze"; dailyLimit = 500; }

                /* 	Use a nested if in the withdrawal logic to check sufficient balance AND a tier-dependent daily limit. */
                double feeRate;
                switch (tier) {
                    case "Platinum": feeRate = 0.0; break;
                    case "Gold": feeRate = 0.01; break;
                    case "Silver": feeRate = 0.02; break;
                    case "Bronze": feeRate = 0.05; break;
                    default: feeRate = 0.05; break;
                }

                double totalDeduction = withdrawalAmount + (withdrawalAmount * feeRate);

                /* •	Use a switch on account tier to select a transaction fee percentage, then combine everything with
                if-else to APPROVE or DENY, printing the exact reason for any denial.*/
                if (withdrawalAmount <= dailyLimit) {
                    if (totalDeduction <= balance) {
                        System.out.println("APPROVE: Transaction successful.");
                        System.out.println("Remaining Balance: ₱" + (balance - totalDeduction));
                    } else {
                        System.out.println("DENY: Insufficient balance to cover withdrawal and " + (feeRate * 100) + "% fee.");
                    }
                } else {
                    System.out.println("DENY: Withdrawal exceeds the " + tier + " tier daily limit of ₱" + dailyLimit);
                }

            } else {
                System.out.println("DENY: Incorrect 4-digit PIN.");
            }
        } else {
            System.out.println("DENY: Invalid username.");
        }
    }
}
