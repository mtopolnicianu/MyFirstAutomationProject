import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        manualCasting();
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


