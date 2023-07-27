import java.util.*;

public class JavaIfElseAndSwitchForWhileExercises {

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

    public static void ifElseExerciseFromTasks() {
        Object obj1 = new Object();
        Object obj2 = obj1;
        if (obj1.equals(obj2))
            System.out.println(true);
        else
            System.out.println(false);
    }

    public static void anotherExampleWithForLoop() {
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void forLoopWithArray() {
        String[] cars = {"Volvo", "BMW", "Ford"};
        for (String car : cars) {
            System.out.println(car);
        }
    }

    public static void forLoopNested() {
        //Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i);

            //Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println("Inner: " + j);
            }
        }
    }

    public static void switchString(String input) {
        switch (input) {
            case "a":
                System.out.println("apple");
            case "b":
                System.out.println("bat");
                break;
            case "B":
                System.out.println("big bat");
            default:
                System.out.println("none");
        }
    }

    public static void forEachLoopExerciseTwo() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(2);
        for (int a : numbers) {
            System.out.println(a);
            //or we can use:
            for (int i = 0; i < numbers.size(); i++) {
                System.out.println(numbers.get(i));
            }
        }
    }

    public static void forEachLoopExerciseThree() {
        List<Integer> nums = Arrays.asList(4, 5, 7, 8, 9);

        nums.forEach(n -> System.out.println(n));
//       for (int i=0; i<5; i++ ){
//           System.out.println(nums.get(i));
//           for (int n : nums){
//               System.out.println(n);
//           }
//       }
    }

    public static void flowControlExerciseOne() {
        for (int i = 0; i <= 9; i++) {
            System.out.printf("row %d ", i);
            for (int j = 0; j <= 9; j++) {
                System.out.print(j);
            }
            System.out.println(i);
        }
    }

    public static void firstExampleWithForLoop() {
        for (int i = 0; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void secondExampleWithForLoop() {
        for (int i = 0; i <= 100; i = i + 7) {
            System.out.println(i);
        }
    }

    //Loops: While vs Do..While
    public static void conditionWithWhileLoop() {
        int x = 1000;
        while (x < 3) {
            System.out.println("Hello!");
            x++;
        }
    }

    public static void conditionWithDoWhileLoop() {
        int x = 1000;
        do {
            System.out.println("Hello!");
            x++;
        }
        while (x < 3);
    }

    public static void javaWhileLoopOne() {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }

    public static void javaWhileLoopTwo() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);
    }

    public static void javaWhileLoopThree() {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
        }
    }

    //Write a program that reads an integer between 1 and 10 from the user
    public static void javaWhileLoopFour() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        while (number < 1 || number > 10) {

            System.out.println(number + "is not between 1 and 10. Try again!");
            number = scanner.nextInt();
        }
        System.out.println(number + " is between 1 and 10!");
    }

    public static void javaWhileLoopFive() {
        int a = 0;

        while (a < 100) {
            System.out.println("a");
            a++;
        }
        System.out.println("Loop finished.");
    }

    public static void continueExerciseOne() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0)
                continue;
            System.out.println(i + " ");
        }

    }

    public static void breakExerciseOne() {
        int number;
        while (true) {
            System.out.println("enter a number between 1 and 10: ");
            number = scanner.nextInt();
            if (number < 1 || number > 10)
                continue;
            break;
        }
        System.out.println(number + " is between 1 and 10.");
    }

    public static void breakContinueExercise() {
        Scanner keyboard = new Scanner(System.in);
        int i = 0;
        do {
            System.out.println("Enter number 1");
            int number1 = keyboard.nextInt();

            System.out.println("Enter number 2");
            int number2 = keyboard.nextInt();

            if (number2 == 0) {
                continue;
                //break;
            }

            System.out.println(number1 + "/" + number2 + " is " + (number1 / number2));
            i++;
        }
        while (i < 10);
        System.out.println("The end!");
    }

    public static void breakDown() {
        int[] numbers = {10, 20, 30, 40, 50};
        int i;
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] == 30) {
                break;
            }
            System.out.println(numbers[i]);

        }
    }

    public static void breakDownWithSwitch() {
        int i = 0;
        switch (i) {
            case 0:
                System.out.println("Zero!");
                break;

            case 1:
                System.out.println("One!");
                break;
            default:
                System.out.println("what???");
                break;
        }
    }

    public static void breakWithNestedLoop(){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 3; j++){
                System.out.println(i + "," + j);
                break;
            }
        }
    }

}








