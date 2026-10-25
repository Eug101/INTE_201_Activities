public class Week5_Intermediate_ClassStatisticsCalculator {
    public static void main(String[] args) {
        /*Declare an int array of at least 8 student scores*/
        int[] scores = {99, 92, 75, 88, 95, 70, 89, 94};
        
        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];
        
        /*•	Using loops (not built-in shortcuts), compute the sum, average, highest score, and lowest score.*/
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            
            if (scores[i] > highest) {
                highest = scores[i];
            }
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }
        
        double average = (double) sum / scores.length;
        
        /*Print all four statistics with clear labels.*/
        System.out.println("Class Statistics");
        System.out.println("Total Sum: " + sum);
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }
}
