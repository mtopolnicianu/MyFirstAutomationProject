import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class JavaIfElseAndSwitchExercises {

    private static final int SCISSORS = 2;
    private static final int ROCK = 0;
    private static final int PAPER = 1;
    private static Scanner scanner = new Scanner(System.in);

    public static void firstExercise() {


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

    public static void secondExercise() {
        Scanner scanner2 = new Scanner(System.in);
        String userChoice;
        System.out.println("Please choose one of the following options");
        System.out.println("1 - Capucino");
        System.out.println("2 - Latte");
        System.out.println("3 - Americano");
        System.out.println("4 - Mocha");
        System.out.println("5 - Macchiato");
        System.out.println("6 - Espresso");
        System.out.println("Q - Quit the program");

        do {
            userChoice = scanner2.nextLine();
            userChoice = userChoice.toLowerCase();
            System.out.println("You chose " + userChoice);
            switch (userChoice) {
                case "1":
                    System.out.println("Making Cappucino... ");
                    System.out.println("Steam the milk...");
                    System.out.println("Froth the milk...");
                    System.out.println("Make espresso...");
                    System.out.println("Add the milk to the espresso");
                    break;
                case "2":
                    System.out.println("Making Latte...");
                    System.out.println("Make espresso");
                    System.out.println("Steam the milk");
                    System.out.println("Add the milk to the espresso");
                    break;
                case "3":
                    System.out.println("Making the Americano...");
                    break;
                case "4":
                    System.out.println("Making Mocha...");
                    break;
                case "5":
                    System.out.println("Making Macchiato...");
                    break;
                case "6":
                    System.out.println("Making Espresso...");
                    break;
                default:
                    System.out.println("Returning coins");
                    break;
            }
        }
        while (!userChoice.equals("q"));
        scanner2.close();
    }

    public static void thirdExercise() {
        System.out.println("Enter a number: ");
        Scanner scanner3 = new Scanner(System.in);
        if ((scanner3.nextInt() % 2) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    public static void fourthExercise() {
        int n = 4;
        int result = 0;

//        if (n%2 == 0)
//            result = 10;
//        else
//            result = 20;
        result = n % 2 == 0 ? 10 : 20;
        System.out.println(result);
    }

    public static void fiveExercise() {
        int n = 2;
        switch (n) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid number ");
        }
    }

    public static void exerciseWithNestedWhileLoop() {
        int i = 1;

        while (i <= 4) {
            System.out.println("Hi " + i);
            int j = 1;
            while (j <= 3) {
                System.out.println("Hello" + j);
                j++;
            }
            i++;
        }
        System.out.println("Bye" + i);
    }

    public static void breakAndContinueExercise() {
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                continue;
            }
            System.out.println("Value is " + i);
        }
    }

    public static void doWhileConditionExercise() {
        int score = 0;
        do {
            System.out.println(score + "");
            score++;
        }
        while (score < 10);
    }

    public static void forLoopExercise() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("DAY " + i);
            System.out.println("9");
            for (int j = 1; j <= 9; j++) {
                System.out.println("    " + (j + 8) + " - " + (j + 9));
            }
        }
    }
}







