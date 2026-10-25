class Student {
    String name;
    int[] quizzes;
    double average;

    public Student(String name, int[] quizzes) {
        this.name = name;
        this.quizzes = quizzes;
        this.average = calculateAverage();
    }

    private double calculateAverage() {
        int sum = 0;
        for (int score : quizzes) {
            sum += score;
        }
        return (double) sum / quizzes.length;
    }
}

public class Week5_Expert_ClassRankingSystem {
    public static void main(String[] args) {
        /*Create a Student class with a name and a quizzes array holding at least 4 scores each.*/
        /*Build an array of Student objects from a 2D array of raw quiz data.*/
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve"};
        int[][] rawQuizData = {
            {85, 90, 88, 92}, // Alice
            {78, 82, 80, 85}, // Bob
            {95, 92, 98, 90}, // Charlie
            {85, 90, 88, 92}, // Diana (Tie with Alice)
            {70, 75, 72, 68}  // Eve
        };

        // Build an array of Student objects from raw data
        Student[] students = new Student[names.length];
        for (int i = 0; i < names.length; i++) {
            students[i] = new Student(names[i], rawQuizData[i]);
        }

        /*Custom sort algorithm (Bubble Sort) to rank students by average (descending)*/
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].average < students[j + 1].average) {
                    // Swap
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        /*Print a formatted leaderboard and correctly handle a tie between two students with the same average.*/
        System.out.println("--- Class Leaderboard ---");
        System.out.printf("%-5s %-10s %-10s%n", "Rank", "Name", "Average");
        
        int currentRank = 1;
        for (int i = 0; i < students.length; i++) {
            // Handle tie: if not the first student and average matches the previous, keep the same rank
            if (i > 0 && students[i].average == students[i - 1].average) {
                System.out.printf("%-5d %-10s %.2f%n", currentRank, students[i].name, students[i].average);
            } else {
                currentRank = i + 1; // Update rank strictly to their position in the sorted array
                System.out.printf("%-5d %-10s %.2f%n", currentRank, students[i].name, students[i].average);
            }
        }

        /*Custom linear search returning a specific student's rank*/
        String targetStudent = "Diana";
        int rank = findStudentRank(students, targetStudent);
        System.out.println("\nSearch Result:");
        if (rank != -1) {
            System.out.println(targetStudent + "'s Rank is: " + rank);
        } else {
            System.out.println("Student not found.");
        }
    }

    /*Custom linear search method to find rank*/
    public static int findStudentRank(Student[] sortedStudents, String targetName) {
        int rank = 1;
        for (int i = 0; i < sortedStudents.length; i++) {
            if (i > 0 && sortedStudents[i].average != sortedStudents[i - 1].average) {
                rank = i + 1;
            }
            if (sortedStudents[i].name.equals(targetName)) {
                return rank;
            }
        }
        return -1; // Not found
    }
}
