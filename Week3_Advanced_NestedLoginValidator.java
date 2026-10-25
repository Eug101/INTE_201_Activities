public class Week3_Advanced_NestedLoginValidator {
    public static void main(String[] args) {
        String dbUser = "admin";
        String dbPass = "secure123";
        boolean isAccountLocked = false;

        // Test variables (Deliberately provide wrong values here to test failure paths)[span_10](start_span)[span_10](end_span)
        String inputUser = "admin";
        String inputPass = "secure123";
        boolean inputLocked = false;

        /* Check the username first */
        if (dbUser.equals(inputUser)) {
            /* Only if it matches, check the password inside a nested if */
            if (dbPass.equals(inputPass)) {
                /* Only if BOTH match, check a third condition inside an even deeper nested if */
                if (!inputLocked) {
                    System.out.println("Login successful. Welcome!");
                } else {
                    /* Print a specific, different failure message depending on which stage failed */
                    System.out.println("Login Failed: Account is currently locked.");
                }
            } else {
                System.out.println("Login Failed: Incorrect password.");
            }
        } else {
            System.out.println("Login Failed: Username does not exist.");
            /* Test all failure paths by deliberately providing wrong values at each stage. */
        }
    }
}
