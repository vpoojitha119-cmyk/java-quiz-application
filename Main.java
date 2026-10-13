
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "Which language is used for Android development?",
            "Which keyword creates a class in Java?",
            "Which data type stores whole numbers?",
            "Which symbol ends a Java statement?",
            "Which method starts a Java program?"
        };

        String[][] options = {
            {"HTML", "Java", "CSS", "SQL"},
            {"method", "new", "class", "void"},
            {"String", "double", "int", "boolean"},
            {".", ",", ";", ":"},
            {"start()", "main()", "run()", "begin()"}
        };

        int[] answers = {2, 3, 3, 3, 2};

        String playAgain;

        do {
            int score = 0;

            System.out.println("\n===== JAVA QUIZ =====");

            for (int i = 0; i < questions.length; i++) {

                System.out.println("\nQ" + (i + 1) + ". " + questions[i]);

                for (int j = 0; j < 4; j++) {
                    System.out.println((j + 1) + ". " + options[i][j]);
                }

                int choice;

                do {
                    System.out.print("Enter your answer (1-4): ");
                    choice = sc.nextInt();

                    if (choice < 1 || choice > 4) {
                        System.out.println("Invalid choice! Try again.");
                    }
                } while (choice < 1 || choice > 4);

                if (choice == answers[i]) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong!");
                    System.out.println("Correct answer: "
                            + options[i][answers[i] - 1]);
                }
            }

            System.out.println("\n===== QUIZ RESULT =====");
            System.out.println("Score: " + score + "/5");
            System.out.println("Percentage: " + (score * 100 / 5) + "%");

            System.out.print("\nDo you want to play again? (yes/no): ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thank you for playing!");

        sc.close();
    }
}
