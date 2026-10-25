public class Week2_Intermediate_GradeThresholdChecker {
    public static void main(String[] args) {
        /* Declare variables for a student's average grade and number of absences. */
        double average = 92.0;
        int absences = 3;
        
        /* Use && and || together (with parentheses) to determine if the student passes: 
        average >= 75 AND absences <= 3, OR average >= 90 regardless of absences. */
        boolean isEligible = (average >= 75 && absences <= 3) || (average >= 90);
        
        /* Print a clear PASS/FAIL message along with the reasoning. */
        if (isEligible) {
            System.out.println("PASS: The student meets the eligibility criteria.");
        } else {
            System.out.println("FAIL: The student does not meet the eligibility criteria (needs avg >= 75 and absences <= 3, or avg >= 90).");
        }
    }
}
