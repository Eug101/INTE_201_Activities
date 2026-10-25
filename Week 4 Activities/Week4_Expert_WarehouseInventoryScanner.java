import java.util.Scanner;

public class Week4_Expert_WarehouseInventoryScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*Represent a warehouse as a 2D array of item counts, using -1 to mean a damaged shelf.*/
        int[][] warehouse = {
            {20, 15, -1, 50},
            {10, -1, 3, 25}, // 3 is critically low
            {-1, 12, 8, 40}
        };
        
        int choice;
        
        /*Use a do-while driven menu that runs until the user chooses to exit.*/
        do {
            System.out.println("\n--- Warehouse Inventory System ---");
            System.out.println("1. Calculate Total Inventory");
            System.out.println("2. Restock First Critically Low Shelf");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");
            choice = scanner.nextInt();
            
            if (choice == 1) {
                calculateTotal(warehouse);
            } else if (choice == 2) {
                restockShelf(warehouse, scanner);
            }
            
        } while (choice != 3);
        
        System.out.println("System exited.");
        scanner.close();
    }
    
    public static void calculateTotal(int[][] warehouse) {
        int total = 0;
        
        for (int i = 0; i < warehouse.length; i++) {
            for (int j = 0; j < warehouse[i].length; j++) {
                // for loop with continue to skip damaged shelves
                if (warehouse[i][j] == -1) {
                    continue; 
                }
                total += warehouse[i][j];
            }
        }
        System.out.println("Total available inventory: " + total);
    }
    /*Use a for loop with continue to total inventory while skipping damaged shelves.*/
    /*•	Use nested loops with break to find the first critically low shelf, 
    and a while loop plus return to simulate restocking with input validation.*/
    
    public static void restockShelf(int[][] warehouse, Scanner scanner) {
        int targetRow = -1;
        int targetCol = -1;
        
        // Nested loops with break to find the first critically low shelf (< 5 items)
        for (int i = 0; i < warehouse.length; i++) {
            for (int j = 0; j < warehouse[i].length; j++) {
                if (warehouse[i][j] != -1 && warehouse[i][j] < 5) {
                    targetRow = i;
                    targetCol = j;
                    break; // Break inner loop
                }
            }
            if (targetRow != -1) {
                break; // Break outer loop once found
            }
        }
        
        if (targetRow == -1) {
            System.out.println("No critically low shelves found.");
            return;
        }
        
        System.out.println("Critically low shelf found at Row " + targetRow + 
                           ", Col " + targetCol + " (Current count: " + warehouse[targetRow][targetCol] + ")");
        
        // while loop plus return to simulate restocking with input validation
        while (true) {
            System.out.print("Enter quantity to restock (must be > 0): ");
            int amount = scanner.nextInt();
            
            if (amount > 0) {
                warehouse[targetRow][targetCol] += amount;
                System.out.println("Shelf successfully restocked! Returning to menu.");
                return; // Return exits the loop and the method immediately
            } else {
                System.out.println("Invalid input. Please enter a positive number.");
            }
        }
    }
}
