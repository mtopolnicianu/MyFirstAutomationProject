import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class JavaIfElseAndSwitchExercises {

    private static final int SCISSORS = 2;
    private static final int ROCK = 0;
    private static final int PAPER = 1;
    private static Scanner scanner = new Scanner(System.in);

    public static void firstExample() {


        Random randomGenerator = new Random();

        String playerChoice;
        int playerValue = -1;
        do {

            int computerValue = randomGenerator.nextInt(3);
            String computerChoice;

            //The code for your solution goes below this comment
            if (computerValue == ROCK) {
                computerChoice = "rock";
            } else if (computerValue == PAPER) {
                computerChoice = "paper";
            } else {
                computerChoice = "scissors";
            }

            System.out.println("Please enter rock, paper or scissors ");
            playerChoice = scanner.nextLine().toLowerCase();
            if (playerChoice.equals("rock")) {
                playerValue = ROCK;
            } else if (playerChoice.equals("paper")) {
                playerValue = PAPER;
            } else if (playerChoice.equals("scissors")) {
                playerValue = SCISSORS;
            } else {
                System.out.printf("%s is not a valid chose.%n", playerChoice);
            }
            System.out.printf("Computer chose %s, player chose %s.%n", computerChoice, playerChoice);

            if (playerValue == computerValue) {
                System.out.println("It's a draw!");
            } else if ((playerValue - 1 == computerValue) || (playerValue == ROCK && computerValue == SCISSORS)) {
                System.out.println("Player wins!");
            } else {
                System.out.println("The computer wins!");
            }
        }
        while (getYesOrNo("Would you like to play again?"));
        scanner.close();
    }

    public static boolean getYesOrNo(String question) {
        String answer;
        while (true) {
            System.out.printf("%s%n", question);
            answer = scanner.nextLine();
            answer = answer.toLowerCase(Locale.ROOT);
            if (answer.equals("y")) {
                return true;
            }
            if (answer.equals("n")) {
                return false;
            }
        }
    }
}






