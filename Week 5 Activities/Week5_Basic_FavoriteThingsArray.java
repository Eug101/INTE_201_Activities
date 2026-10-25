public class Week5_Basic_FavoriteThingsArray {
    public static void main(String[] args) {
        /*Declare and initialize a String array with 5 of your favorite things.*/
        String[] favorites = {"Anime", "Music", "Trivias", "Educational Content", "Learning"};
        
        System.out.println("My Favorite Things:");
        /*Print each item numbered (1 through 5) using a loop*/
        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }
        
        // Print the array's total length using .length
        System.out.println("\nTotal number of favorite things: " + favorites.length);
    }
}
