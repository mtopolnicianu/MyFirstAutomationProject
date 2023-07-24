import java.util.Random;
import java.util.Scanner;

public class JavaIfElseAndSwitchExercises {

    private static final int SCISSORS = 2;
    private static final int ROCK = 0;
    private static final int PAPER = 1;

    public static void firstExample() {

        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        String playerChoice;
        int playerValue = -1;
        int computerValue = randomGenerator.nextInt(3);
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
        System.out.printf("Player chose %s, the value is %s.%n", playerChoice, playerValue);
    }

}




