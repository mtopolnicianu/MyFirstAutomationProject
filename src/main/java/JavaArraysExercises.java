import static java.util.Arrays.binarySearch;
import static java.util.Arrays.copyOf;

public class JavaArraysExercises {

    //print all elements of array in a separate line
    public static void arraysFirstEx() {
        int arr[] = {3, 5, 6, 7, 6, 8, 9};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)// even check
                System.out.println(arr[i]);
        }
    }

    //print all even nos followed by odd nos in an array
    public static void arraysSecondEx() {
        int arr[] = {5, 12, 4, 21, 8, 2, 3, 7, 9, 11};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                System.out.println(arr[i]);
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 != 0) { //odd check
                System.out.println(arr[j]);
            }
        }
    }

    public static void arraysExerciseOne() {
        String[] newArr = new String[5];
        newArr[0] = "hello";
        newArr[1] = "hi";
        newArr[2] = "tim";
        newArr[3] = "bill";
        newArr[4] = "joe";

        int[] num = {2, 3, 4, 5, 6};
        double[] num2 = {1, 4, 4, 5, 55};

        String x = newArr[4];
        System.out.println(x);
    }

    public static void arraysExerciseTwo() {
        int[] arr;
        arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " is " + arr[i]);
        }
    }

    public static void arraysExerciseThree() {
        int arr[] = {1, 2, 3, 44, 4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of array is: " + sum);
    }

    public static void arraysExerciseFour() {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arraysExerciseFive() {
        //Single Value Containers
        int state1PopulationCount = 502;
        int state2PopulationCount = 765;
        int state3PopulationCount = 502;
        int state4PopulationCount = 594;
        int state5PopulationCount = 817;

        //Multi Value Container
        int[] countryPopulation = new int[5];
        System.out.println("statePopulation is " + countryPopulation);

        //Read the element in Array
        //1. Read Single Element
        System.out.println(" countryPopulation[0] is: " + countryPopulation[0]);
        System.out.println(" countryPopulation is: " + countryPopulation[1]);

        //2. Read All
        for (int i = 0; i < countryPopulation.length; i++) {
            System.out.println("countryPopulation[" + i + "] is: " + countryPopulation[i]);
        }

        //Write / Update Operation
        countryPopulation[0] = 502;
        countryPopulation[1] = 632;
        countryPopulation[2] = 344;
        countryPopulation[3] = 502;
        countryPopulation[4] = 938;
        System.out.println();
        System.out.println("==Re Reading After Write Operation==");
        for (int i = 0; i < countryPopulation.length; i++) {
            System.out.println("countryPopulation[" + i + "] is: " + countryPopulation[i]);
        }

    }

    public static void arraysExerciseSix() {
        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println(" last = " + firstTen[arrayLength - 1]);

        int[] newArray;
        newArray = new int[]{5, 4, 3, 2, 1};
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i] + " ");
        }
    }
}

