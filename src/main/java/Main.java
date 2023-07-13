public class Main {
    public static void main(String[] args) {
        System.out.println("Test");
        float myOtherFloatValue = 5.25f;
        System.out.println(myOtherFloatValue);

//        int myIntValue = 3;
//        float myFloatValue = 5f;
//        double myDouble = 5d;
//        myIntValue = 5 / 2;
//        System.out.println(myIntValue);
//
//        myIntValue = 1 / 3;
//        System.out.println(myIntValue);
//
//        myDouble = 5d / 3d;
//        System.out.println(myDouble);
//
//        double numberOfPounds = 200d;
//        System.out.println(numberOfPounds);

//        double convertedKilograms = numberOfPounds * 0.453493034d;
//        System.out.println(convertedKilograms);
//
//        double pi = 3.1415927d;
//        System.out.println(pi);

        double doubleAnotherNumber = 3_000_836_994d;
        System.out.println(doubleAnotherNumber);

        char myChar = 'M';
        System.out.println(myChar);
        String name = "Ela";
        System.out.println(name);

        String myString = "This is a string!";
        System.out.println("myString is equal to " + myString);
        System.out.println(myString + ", and is more.");
        String numberString = "256.55";
        numberString = numberString + "49.45";
        System.out.println(numberString);

        int result = 1 + 2; //1+2=3
        System.out.println(result);
        int prevResult = result;
        System.out.println(prevResult + " is previousResult");

        result = 5;
        result = result % 3;
        System.out.println("Result = " + result);


    }

    {
        int result = 1;
        result++;
        System.out.println("result = " + result);
    }

    {
        int decrement = 5;
        decrement--;
        System.out.println(decrement);
    }

    {
        int increment = 4;
        increment -= 1.5;
        System.out.println("Number is: " + increment);
    }
}
