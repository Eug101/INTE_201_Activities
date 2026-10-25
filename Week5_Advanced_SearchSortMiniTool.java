import java.util.Arrays;

public class Week5_Advanced_SearchSortMiniTool {
    public static void main(String[] args) {
        /*Using the same scores array, implement a linear search for a specific 
        target value, printing whether it was found and at what index.*/
        int[] scores = {99, 92, 75, 88, 95, 70, 89, 94};
        int target = 88;
        boolean found = false;
        int foundIndex = -1;
        
        // Linear search for a specific target value
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                found = true;
                foundIndex = i;
                break;
            }
        }
        
        if (found) {
            System.out.println("Target " + target + " was found at index: " + foundIndex);
        } else {
            System.out.println("Target " + target + " was not found in the array.");
        }
        
        /* 
         /*•	Explain in a comment why sorting a copy (rather than the original) might matter here:
        Sorting the original array alters the original sequence of the data. 
        In many practical applications (like tracking scores mapped to specific students 
        by their index or maintaining a chronological record), preserving the original 
        order is necessary. Sorting a copy allows us to view the data sequentially by value 
        without destructively modifying the original dataset's integrity.
         */
         
        // Sort a COPY of the array using Arrays.sort()
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);
        
        // Print both the original and sorted versions
        System.out.println("\nOriginal Array: " + Arrays.toString(scores));
        System.out.println("Sorted Array:   " + Arrays.toString(sortedScores));
    }
}
