public class Week1_Advanced_UnitCastingConverter {
    public static void main(String[] args) {
        /* Read or declare a double value representing centimeters */
        double totalCentimeters = 294.6;

        /* •	Use explicit casting to compute and print the equivalent WHOLE meters, plus the remaining centimeters. */
        int wholeMeters = (int) (totalCentimeters / 100);
        double remainingCentimeters = totalCentimeters % 100;
        
        System.out.println("Total centimeters: " + totalCentimeters);
        System.out.println("Equivalent to: " + wholeMeters + " meters and " + remainingCentimeters + " centimeters");

        /* •	Separately, demonstrate one implicit widening example (int to double) 
        with a comment explaining why no cast is needed. */
        int wholeNumber = 80;
        double widenedNumber = wholeNumber; 
        /* No cast is needed here because going from a 32-bit int to a 64-bit double is a widening conversion; 
        the double type is large enough to safely hold the integer without any loss of magnitude or precision.*/
        System.out.println("\nImplicit widening: " + wholeNumber + " becomes " + widenedNumber);

        /* •	Demonstrate one explicit narrowing example (double to int) 
        with a comment explaining exactly what data is lost. */
        double exactMeasurement = 30.75;
        int truncatedMeasurement = (int) exactMeasurement;
        /* Data lost: The fractional or decimal part (.75) is entirely 
        discarded when narrowing from a floating-point type to an integer. */
        System.out.println("Explicit narrowing: " + exactMeasurement + " becomes " + truncatedMeasurement);
    }
}
