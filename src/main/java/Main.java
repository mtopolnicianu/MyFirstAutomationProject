import java.math.BigDecimal;
import java.util.Scanner;

public class Main {



    private static Cars cars;
    private static Bikes bikes;
    private static final String ROAD = "|                             |";
    private static final String CAR_SYMBOL = "V";

    // Control keys
    private static final char LEFT = 'a';
    private static final char STRAIGHT = 's';
    private static final char RIGHT = 'd';
    private static final char ACCELERATE = 'w';
    private static final char BRAKE = 'x';
    private static final char INFO = 'i';
    private static final char QUIT = 'q';

    private static final StringBuilder BUILDER = new StringBuilder();
    private static JavaMethodsExercises.MethodOverloading obj = new JavaMethodsExercises.MethodOverloading();

    public static void main(String[] args){

        ClassesMethods myObj = new ClassesMethods();
        myObj.x = 25;
        System.out.println(myObj.x);

        ClassesMethods mySecondObj = new ClassesMethods();
        ClassesMethods myThirdObj = new ClassesMethods();
        mySecondObj.y = 505;
        myThirdObj.x  =1011;
        System.out.println(mySecondObj.y);
        System.out.println(myThirdObj.x);
        ClassesMethods myFifthObj = new ClassesMethods();
        System.out.println("Name: " + myFifthObj.fname + myFifthObj.lname + "with age " + myFifthObj.age);

        Cars cars = new Cars();
        Bikes bikes = new Bikes();
        bikes.kick();
        cars.key();

        ClassesMethods class1 = new ClassesMethods();
        ClassesMethods class2 = new ClassesMethods();
        class1.printHi();
        ClassesMethods myCar2 = new ClassesMethods();
        myCar2.speed(55);
        myCar2.fullThrottle();

//        Pokemon p1 = new Pokemon();
//        p1.name = "Pikachu";
//        p1.level = 10;
//        System.out.println(p1.name + " " + p1.level);
//
//        Pokemon p2 = new Pokemon();
//        p2.name = "Eve";
//        p2.level = 33;
//        System.out.println(p2.name + " " + p2.level);
//        p2.attack();


        Pokemon p3 = new Pokemon("Eve", 25);
        Student student = new Student();
        student.id = 11;
        student.name = "Ella";
        student.age = 34;
        System.out.println(" Name: " + student.name + " Age: " + student.age + "ID: " + student.id);

        Scanner s = new Scanner(System.in);
        Cars car1 = new Cars();
        Cars car2 = new Cars();
        Cars car3 = new Cars();
        Cars car4 = new Cars();
        Cars car5 = new Cars();
        Bikes bike1 = new Bikes();
        Bikes bike2 = new Bikes();
        Bikes bike3 = new Bikes();
        Bikes bike4 = new Bikes();
        Bikes bike5 = new Bikes();
        car1.name = "Lamborghini";
        car2.name = "Ferrari";
        car3.name = "Bugatti";
        car4.name = "Pagati";
        car5.name = "Porsche";
        bike1.name = "Harley Davidson";
        bike2.name = "Ducati";
        bike3.name = "Suzuki";
        bike4.name = "Ecosse";
        bike5.name = "Yamaha";
        bike1.cost = "$2203,000";
        bike2.cost = "$120,000";
        bike3.cost = "$50,000";
        bike4.cost = "$53,000";
        bike5.cost = "$3,000";
        car1.cost = "$02203,000";
        car2.cost = "$22223,000";
        car3.cost = "$103,000";
        car4.cost = "$500,000";
        car5.cost = "$12203,000";

        System.out.println("What do you want to buy?");
        System.out.println("1. Bikes");
        System.out.println("2. Cars");
        int choice;
        System.out.println("Enter your choice: ");
        choice = s.nextInt();
        if (choice == 1) {
            System.out.println("We have 5 models: ");
            System.out.println("1. Harley Davidson");
            System.out.println("2. Ducati");
            System.out.println("3. Pagani");
            System.out.println("4. Suzuki");
            System.out.println("5. Yamaha");
            System.out.println("Enter your choice: ");
            int n;
            n = s.nextInt();
            if (n == 1) {
                System.out.println("The cost of Harley Davidson: " + bike1.cost);
            } else if (n == 2) {
                System.out.println("The cost of Ducati: " + bike2.cost);
            } else if (n == 3) {
                System.out.println("The cost of Pagani" + bike3.cost);
            } else if (n == 4) {
                System.out.println("The cost of Suzuki: " + bike4.cost);
            } else if (n == 5) {
                System.out.println("The cost of Yamaha: " + bike5.cost);
            } else {
                System.out.println("Please enter the value between 1-5");
            }
        } else if (choice == 2) {
            System.out.println("We have 5 models available: ");
            System.out.println("1. Lamborghini");
            System.out.println("2. Ferrari");
            System.out.println("3. Bugati");
            System.out.println("4. Ecosse");
            System.out.println("5. Porsche");
            System.out.println("Enter your choice: ");
            int c;
            c = s.nextInt();
            if (c == 1) {
                System.out.println("The cost of Lamborghini is: " + car1.cost);
            } else if (c == 2) {
                System.out.println("The cost of Ferrari: " + car2.cost);
            } else if (c == 3) {
                System.out.println("The cost of Bugati: " + car3.cost);
            } else if (c == 4) {
                System.out.println("The cost of Ecosse: " + car4.cost);
            } else if (c == 5) {
                System.out.println("The cost of Porsche: " + car5.cost);
            } else {
                System.out.println("Please enter the value between 1-5");
            }
        } else {
            System.out.println("Please enter the coice between 1-2");
        }


        //Method Overloading
//        Eight e1 = new Eight();
//        e1.school(2);
//        e1.school('d', 44.76);
//        Eight.school(45,5);
//        Eight.school('z', 55.233,4);
//        Eight.school(45.5,5);

//        final  String COMPANY_NAME = "Neso Academy";
//        System.out.println(COMPANY_NAME);
//        final String COMPANY_NAME;
//        COMPANY_NAME = "Another Name";

//        JavaMethodsExercises.myMethod("Liam");
//        JavaMethodsExercises.myMethod("Elisa");
//        JavaMethodsExercises.myMethod("Anja");
//        JavaMethodsExercises.printInfo("Ela", 44);


        int myNum1 = JavaMethodsExercises.plusMethodInt(8, 5);
        double myNum2 = JavaMethodsExercises.plusMethodDouble(4.3, 7.88);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);


        int total = obj.add(5, 6, 8);
        System.out.println("Total is: " + total);

        int total1 = obj.add(3, 6, 6);
        System.out.println("Total1 is: " + total1);

        double total2 = obj.add(3.5, 55.5);
        System.out.println("Total2 is: " + total2);

        JavaMethodsExercises.checkAge(20);
        System.out.println(JavaMethodsExercises.sum(2, 3, 6));

        System.out.println(JavaMethodsExercises.addNumber(55, 180));

        int num1 = 11;
        int num2 = 7;

        int answer1;
        int answer2;
        boolean answer3;

        answer1 = JavaMethodsExercises.multiplyNumbers(num1);
        System.out.println("When we multiply num1 by 7 we get: " + answer1);

        answer2 = JavaMethodsExercises.addNumbers(num1, num2);
        System.out.println("\nWhen we add num1 and num2 we get: " + answer2);

        answer3 = JavaMethodsExercises.equalNumbers(num1, num2);
        System.out.println("num1 and num2 are equal: " + answer3);


        int d = 5;
        JavaMethodsExercises.add(3, 4);
        JavaArraysExercises.enumTypeExercise();
        int[] a = new int[]{1, 2, 3, 5};
        System.out.println(JavaArraysExercises.sameFirstLast(a));

        System.out.println(JavaBooleansExercises.anotherExampleWithBoolean());

        Car myCar = new Car("Tim's car");
        Car anotherCar = new Car("The Batmobile");


        myCar.accelerate(5);
        myCar.accelerate(30);
        myCar.accelerate(40);
        myCar.accelerate(44);
        myCar.accelerate(12);
        myCar.brake(4);
        anotherCar.brake(15);

        Scanner scanner = new Scanner(System.in);
        Car batmobile = new Car("The Batmobile");

        char control;
        boolean playing = true;
        int accelerationFactor = 1;
        int carPosition = 15;

        // Instructions
        System.out.println("Welcome to the Console Grand Prix");
        System.out.println("=================================");
        System.out.println();
        System.out.printf("Control your car by pressing '%s' to go left, and '%s' to go right.%n", LEFT, RIGHT);
        System.out.printf("'%s' will go straight.%n", STRAIGHT);
        System.out.println();
        System.out.println("The faster your car's going, the further down the track it");
        System.out.println("will travel in the chosen direction.  Watch out for the bends!");
        System.out.println();
        System.out.println("Choose the acceleration/deceleration factor by pressing a number key.");
        System.out.printf("You can press a number key anytime before using '%s' or '%s'.%n", ACCELERATE, BRAKE);
        System.out.printf("Pressing '%s' will accelerate by that amount,%n", ACCELERATE);
        System.out.printf("'%s' will brake by that amount.%n", BRAKE);
        System.out.println();
        System.out.println("Your car starts off stationary, so you'll need to accelerate before you can move.");
        System.out.println();
        System.out.printf("Press '%s' to find out your current speed.%n", INFO);
        System.out.println();
        System.out.printf("'%s' will quit.%n", QUIT);

        do {
            control = scanner.nextLine().toLowerCase().charAt(0);
            if (Character.isDigit(control)) {
                accelerationFactor = control - '0';
            } else {
                switch (control) {
                    case LEFT:
                        for (int i = 0; i < batmobile.getSpeed(); i++) {
                            carPosition--;
                            if (stillOnTrack(carPosition, ROAD)) {
                                buildRoad(carPosition);
                            } else {
                                System.out.println("Oups! You've crashed! Game over.");
                            }
                        }
                        break;
                    case STRAIGHT:
                        for (int i = 0; i < batmobile.getSpeed(); i++) {
                            buildRoad(carPosition);
                        }

                        drawRoad();
                        break;
                    case RIGHT:
                        for (int i = 0; i < batmobile.getSpeed(); i++) {
                            carPosition++;
                            buildRoad(carPosition);
                        }

                        drawRoad();
                        break;
                    case ACCELERATE:
                        batmobile.accelerate(accelerationFactor);
                        break;
                    case BRAKE:
                        batmobile.brake(accelerationFactor);
                        break;
                    case INFO:
                        batmobile.showSpeed();
                        break;
                    case QUIT:
                        playing = false;
                        break;
                }
            }
        } while (playing);

        scanner.close();
    }

    private static boolean stillOnTrack(int position, String road) {
        return (position < road.length() && road.charAt(position) == ' ');
    }

    private static void doubleResult() {
        double result1 = 0.1 * 7;
        double result2 = 0.1 + 0.1 + 0.1 + 0.1;
        System.out.printf("result1 is %f %n", result1);
        System.out.printf("result2 is %f %n", result2);

        double difference = result1 - result2;
        System.out.printf("The difference is %.99f %n", difference);
        boolean checkResult = result1 - result2 == 0;
        System.out.println(checkResult);
    }

    private static void oneTenth() {
        BigDecimal oneTenth = BigDecimal.valueOf(0.1);
        BigDecimal result1 = oneTenth.multiply(BigDecimal.valueOf(7));
        BigDecimal result2 = oneTenth.add(oneTenth.add(oneTenth).add(oneTenth).add(oneTenth).add(oneTenth));
        BigDecimal difference = result1.subtract(result2);
        System.out.printf("The difference is %.99f %n", difference);
    }

    private static void booleanExpressionsExercise() {
        int apples = 18;
        int oranges = 9;
        double applePrice = 12.60;
        double orangePrice = 4.50;
        System.out.println(apples == oranges);
        System.out.println(apples != oranges);

        System.out.printf("%d > %d is %s %n", apples, oranges, apples > oranges);
        System.out.printf("%d < %d is %s %n", apples, oranges, apples < oranges);
        System.out.printf("%d >= %d is %s %n", apples, oranges, apples >= oranges);
        System.out.printf("%d <= %d is %s %n", apples, oranges, apples <= oranges);

        System.out.printf("Reducing apple cost: %s %n", (apples > oranges) && (applePrice > orangePrice));
        System.out.printf("Reducing apple cost: %s %n", (apples > oranges) || (applePrice > orangePrice));
    }

    private static void booleanVariables() {
        int apples = 18;
        int oranges = 9;
        double applePrice = 12.60;
        double orangePrice = 4.50;

        boolean moreApples;
        boolean applesAreDearer;
        moreApples = (apples > oranges);
        applesAreDearer = (applePrice > orangePrice);
        System.out.printf("We have more apples:%s %n", moreApples);
        System.out.printf("Appels are dearer: %s %d", moreApples);

        System.out.printf("Reducing cost of apples: %s %n", (moreApples && applesAreDearer));
        System.out.printf("Reducing cost of apples: %s %n", (moreApples || applesAreDearer));

        boolean moreApplesAndDearer = moreApples && applesAreDearer;
        boolean moreAppleOrDearer = moreApples || applesAreDearer;
        System.out.printf("Reducing cost of apples: %s %n", moreAppleOrDearer);
        System.out.printf("Reducing cost of apples: %s %n", moreApplesAndDearer);
    }

    private static void automaticCasting() {
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);
    }

    private static void manualCasting() {
        double myDouble = 9.78d;
        int myInt = (int) myDouble;
        System.out.println(myDouble);
        System.out.println(myInt);
    }

    private static void casting() {
        byte a = 1;
        short b;
        char c;
        int d;

        int ex = a;
    }

    private static void operators() {
        int answer = 7 + 3 * 4;
        System.out.println(answer);
    }

    private static void primaryOperator() {
        int x = 3;
        int y = x++;
        System.out.printf("Using x++,x is %s and y is %s.%n", x, y);

        x = 3;
        y = x++ - ++x;
        System.out.printf("++x = X++ gives: x is %s and y is %s.%n", x, y);

        x++;
        int z = x;
        y = z - x;
        x++;
        System.out.printf("++x - x++ gives: x is %s and y is %s.%n", x, y);

        x = 3;
        z = x;
        x += 2;
        y = z - x;
        System.out.printf("x++ - ++x gives: x is %s and y is %s.%n", x, y);
    }

    private static void operatorPrecedence() {
        double a = 12 * 3 / 4;
        double b = (12 * 3) / 4;
        double c = 12 * (3 / 4);
        System.out.printf("%s %s %s %n", a, b, c);
        System.out.println();

        double d = 12.0 / 3.0 / 4.0;
        double e = (12.0 / 3.0) / 4.0;
        double f = 12.0 / (3.0 / 4.0);
        System.out.printf("%s %s %s %n", d, e, f);
        System.out.println();
    }

    private static void usingRemainderOperator() {
        int x = 12;
        int y = 6;
        if (x % y == 0) {
            System.out.printf("%s does exactly into %s%n", y, x);
        } else {
            System.out.printf("%s does not divide exactly into %s%n");
        }
    }

    private static void getMonth() {
        for (int month = 1; month <= 12; month++) {
            System.out.printf("The next month after %s is %s%n", month, month % 12);
        }
    }

    private static void relationalAndConditionalOperators() {
        int a = 12;
        int b = 6;
        if (b != 0 && divideTwoNumbers(a, b) == 2) {
            System.out.println("We've found a 2.");
        }
        if (b == 0 || divideTwoNumbers(a, b) == 2) {
            System.out.println("We've found a 2.");
        }
    }

    private static int divideTwoNumbers(int x, int y) {
        return x / y;
    }

    private static void stringProgram() {
        String userName = "Ela";
        System.out.println("My test for strings");

        String adjective = "flamboyant";
        String verb = "eat";
        String none = "pogo stick";
        System.out.println("My" + adjective + "sister accidentally" + verb + "expired pasta");
    }

    private static void stringPractice() {
        String course = "Learn Java for Beginners Crash Course";
        String message = "Welcome to ";
        System.out.println(course.charAt(0));
        System.out.println(course.charAt(6));
        for (int i = 15; i < 23; i++) {
            System.out.print(course.charAt(i));
        }
        System.out.println();
    }

    private static void stringIndexing() {


        String courseName = "Learn Java for Beginners Crash Course";
        String message = "Welcome to ";
        String userInput = "I think I need to learn Java";
        String lowerCaseInput = userInput.toLowerCase();

        System.out.println(courseName.charAt(0));
        System.out.println(courseName.charAt(6));
        for (int i = 15; i < courseName.length(); i++) {
            System.out.println(courseName.charAt(i));
        }
        System.out.println(courseName.length());
    }

    private static void insensitiveIndexOf() {
        String courseName = "Learn Java for Beginners Crash Course";
        int position;
        position = indexOfIgnoreCase(courseName, " j");
        System.out.println(position);
    }

    private static int indexOfIgnoreCase(String text, String searchText) {
        String textLowerCase = text.toLowerCase();
        String searchTextLowerCase = searchText.toLowerCase();
        return textLowerCase.indexOf(searchTextLowerCase);
    }

    private static void myNameLength() {
        String string = "Topolnicianu Mihaela Gabriela";
        System.out.println("My full name has " + string.length() + " letters");
    }

    private static void exampleToUpperCaseAndToLowerCase() {
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
    }

    private static void exercisesWithStrings() {
        String word = "bobcat";
        String find4 = "cat";
        String find5 = "bob";
        System.out.println("The first instance of " + find4 + "is at index:: " + word.indexOf(find4));
        System.out.println("The first instance of " + find5 + "is at index::" + word.indexOf(find5));

        String courseName = "Learn Java for Beginners Crash Course";

        int position = -1;
        do {
            position = indexOfIgnoreCase(courseName, " c", position + 1);
            if (position != -1) {
                courseName = replaceByIndex(courseName, position, " c".length(), " Java");
                System.out.println(courseName);

                System.out.println(position);
            }

        } while (position != -1);

        String fixedString = courseName.replace(" Java", " C");
        System.out.println(fixedString);
    }

    private static int indexOfIgnoreCase(String text, String searchText, int fromIndex) {
        String textLowerCase = text.toLowerCase();
        String searchTextLowerCase = searchText.toLowerCase();
        return textLowerCase.indexOf(searchTextLowerCase, fromIndex);
    }

    private static String replaceByIndex(String original, int start, int length, String replacement) {
        String toRemove = original.substring(start, start + length);
        return original.replaceFirst(toRemove, replacement);
    }

    private static void stringEquality() {
        String first = "This is a String";
        String second = "THIS IS A STRING";
        System.out.println(first == second);
        System.out.println(first.equals(second));
        System.out.println(second.equals(first));
        System.out.println(second.equalsIgnoreCase(first));
    }

    private static void valueAndReferenceType() {
        int x = 5;
        int y = x;
        System.out.printf("x = %d, y = %d%n", x, y);
        System.out.printf("x is the same as y: %s%n", x == y);

        String first = "This is a String";
        String second = first;
        System.out.printf("first: %s %n", first);
        System.out.printf("second: %s %n", second);
        System.out.printf("first is the same as second: %s %n", first == second);
    }

    private static void overloadedMethods() {
        StringBuilder first = new StringBuilder("This is a String");
        int a = 12;
        int b = 34;
        int c = 56;
        first.append("");
        first.append(a);
        first.append(3.45);
        first.append("");
        first.append(a == 12);
        first.append(b > c);
    }

    public String substringsPractice() {
        String java = "I love Java";
        String a = java.substring(7);
        System.out.println(a);

        String b = java.substring(2, 6);
        System.out.println(b);

        String c = java.substring(7, java.length());
        System.out.println(c);
        return a;
    }

    public static void practiceWithStrings() {
        String str = new String("Poetic Justice - Kendrick Lamar");
        System.out.println(str.substring(7, 10));

    }

    private static void drawRoad() {
        System.out.println(BUILDER.toString());
    }

    private static void buildRoad(int carPosition) {
        //insert car symbol in the "road"
        String roadLine = ROAD.substring(0, carPosition) + CAR_SYMBOL + ROAD.substring(carPosition);

        //add to builder with line separator
        BUILDER.append(roadLine);
        BUILDER.append(System.lineSeparator());

    }
}


class Car {
    private int speed = 0;
    private String name;

    public Car(String carName) {
        name = carName;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate(int amount) {
        speed += amount; //speed = speed + amount;
        showSpeed();
    }

//    public void brake(int speedReduction) {
//        speed-= speedReduction;
//
//        if (speed < 0){
//            speed =0;
//        }
//        showSpeed();
//    }

//    public void brake(int speedReduction) {
//        speed-= speedReduction;
//
//        if (speed < 0){
//            speed =0;
//        }
//        showSpeed();
//    }

    public void brake(int speedReduction) {
        speed = (speed < speedReduction) ? 0 : speed - speedReduction;

        showSpeed();
    }

    public void showSpeed() {
        System.out.printf("%s is going %d miles per hour.%n", name, speed * 10);
    }
}


