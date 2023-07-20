import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        System.out.println(StringExercises.extraFront("str"));
        System.out.println(StringExercises.helloName2("Dea"));
        System.out.println(StringExercises.makeOutWord2("<<>>", "WooHoo"));
        StringExercises.lastChars("", "Hello There");
        System.out.println(StringExercises.seeColor("black"));
        System.out.println(StringExercises.theEnd("Hello", false));
        System.out.println(StringExercises.endsLy("mdfjdfhdjly"));
        System.out.println(StringExercises.startWord("hippo", "xip"));
        System.out.println(StringExercises.makeAbba("Hi", "Bye"));
        System.out.println(StringExercises.left2("Hi"));
        System.out.println(StringExercises.extraEnd("Hello"));
        System.out.println(StringExercises.middleThree("Candy"));
        System.out.println(StringExercises.withoutEnd("Hello"));
        System.out.println(StringExercises.without2("HelloHe"));
        System.out.println(StringExercises.firstTwo("jsjksdks"));
        System.out.println(StringExercises.withoutEnd2("HelloWord"));
        System.out.println(StringExercises.nTwice("Chocolate", 2));
        System.out.println(StringExercises.frontAgain("edited"));
        System.out.println(StringExercises.withoutEnd2("HelloHe"));
        System.out.println(StringExercises.withoutX("xHix"));
        System.out.println(StringExercises.makeTags("i", "Hello"));
        System.out.println(StringExercises.twoChar("java", 2));
        System.out.println(StringExercises.middleTwo("Practice"));
        System.out.println(StringExercises.lastTwo("Practice"));
        System.out.println(StringExercises.atFirst("h"));
        System.out.println(StringExercises.right2("Hello"));
        System.out.println(StringExercises.minCat("Hello", "java"));
        System.out.println(StringExercises.withoutXtwo("FruitsFr"));
        System.out.println(StringExercises.deFont("xava"));
        System.out.println(StringExercises.comboString("Helloooooo", "test"));
        System.out.println(StringExercises.hasBad("xbadxx"));
        System.out.println(StringExercises.conCat("hdac", "cat"));
        System.out.println(StringExercises.nonStart("Hello", "There"));

        practiceWithStrings();
        Car myCar = new Car("Tim's car");
        Car anotherCar = new Car("The Batmobile");

        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.brake();
        myCar.accelerate();
        anotherCar.brake();
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
        BigDecimal result2 = oneTenth.add(oneTenth
                .add(oneTenth)
                .add(oneTenth)
                .add(oneTenth)
                .add(oneTenth));
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

        }
        while (position != -1);

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

    public String substringsPractice(){
        String java = "I love Java";
        String a = java.substring(7);
        System.out.println(a);

        String b = java.substring(2, 6);
        System.out.println(b);

        String c = java.substring(7, java.length());
        System.out.println(c);
        return a;
    }

    public static void practiceWithStrings(){
        String str = new String("Poetic Justice - Kendrick Lamar");
        System.out.println(str.substring(7, 10));

    }
}

class Car {
    private int speed = 0;
    private String name;

    public Car(String carName) {
        name = carName;
    }

    public void accelerate() {
        speed++;
        showSpeed();
    }

    public void brake() {
        speed--;
        showSpeed();
    }

    private void showSpeed() {
        System.out.printf("%s is going %d miles per hour.%n", name, speed);
    }
}



