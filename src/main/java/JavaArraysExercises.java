import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.copyOf;

public class JavaArraysExercises {
    public static void arraysExercise() {
        // Let us create different types of arrays and
        // print their contents using Arrays.toString()
        boolean[] boolArr = new boolean[]{true, true, false, true};
        byte[] byteArr = new byte[]{10, 20, 30};
        char[] charArr = new char[]{'g', 'e', 'e', 'k', 's'};
        double[] dblArr = new double[]{1, 2, 3, 4};
        float[] floatArr = new float[]{1, 2, 3, 4};
        int[] intArr = new int[]{1, 2, 3, 4};
        long[] lomgArr = new long[]{1, 2, 3, 4};
        Object[] objArr = new Object[]{1, 2, 3, 4};
        short[] shortArr = new short[]{1, 2, 3, 4};

        System.out.println(Arrays.toString(boolArr));
        System.out.println(Arrays.toString(byteArr));
        System.out.println(Arrays.toString(charArr));
        System.out.println(Arrays.toString(dblArr));
        System.out.println(Arrays.toString(floatArr));
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(lomgArr));
        System.out.println(Arrays.toString(objArr));
        System.out.println(Arrays.toString(shortArr));
    }

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

    public static void arrayExerciseSeven() {
        int[] newArray;
        //newArray = new int []{5,4,3,2,1};
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i] + " ");
        }
        System.out.println();
        for (int element : newArray) {
            System.out.println(element + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(newArray));
        Object objectVariable = newArray;
        if (objectVariable instanceof int[]) {
            System.out.println("objectVariable is really an int array");
        }
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;
    }

    public static void arrayExerciseEight() {
        String[] friendsArray = new String[4];

        String[] friendsArray2 = {"John", "Chirs", "Eric", "Lucke"};
    }

    public static void arrayExercise9() {
        int[] nums = {75, 29, 350, 7, 4192};
        System.out.println(nums[3]);

        nums[3] = 51;
        System.out.println(nums[3]);

        //printing all the elements from array - first methode
//        for (int i = 0; i<5; i++){
//            System.out.println(b[i]);
//
        //printing all the elements from array - second methode
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            if (nums[i] > 100) {
                System.out.println(nums[i]);
            }
        }
    }

    //Count how many numbers are over 100:
    public static void arrayExercise10() {
        int[] nums = {75, 29, 350, 7, 4192, 204, 1100, 67};
        int count = 0;
        int sumOfNums = 0;

        for (int i = 0; i < nums.length; i++) {
            //Count all numbers over 100
            if (nums[i] > 100) {
                count++;
            }
            //Add up all numbers
            sumOfNums = sumOfNums + nums[i];
        }
        System.out.println("Number of values greater than 100: " + count);
        double mean = (double) sumOfNums / nums.length;
        System.out.println("Mean: " + mean);

    }

    public static void arrayExercise11() {
        boolean[] bar1 = {true, true, true};
        double[] foo = {0.6, 22.81, 87.555};
        double[] bar = new double[3];
        bar[0] = 39.03;
        bar[1] = 94.5;
        bar[2] = 13.927;
        System.out.println(bar[1]);
    }

    public static void arrayExercise12() {
        String[] predictions = new String[3];
        Scanner scanner = new Scanner(System.in);
        predictions[0] = " a pioneer";
        predictions[1] = " loved by many";
        predictions[2] = "very wealthy";

        System.out.println("I will predict your feature. Choose 1, 2, or 3: ");
        int choose = scanner.nextInt();
        System.out.println("In feature you will be " + predictions[choose - 1]);

    }

    public static void arrayExercise13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of laps: ");
        int numberOfLaps = scanner.nextInt();
        double[] lapTimes = new double[numberOfLaps];
        for (int i = 0; i < numberOfLaps; i++) {
            System.out.println("Lap time: ");
            lapTimes[i] = scanner.nextDouble();
        }
        double fastestTime = lapTimes[0];
        for (int i = 1; i < lapTimes.length; i++) {
            if (lapTimes[i] < fastestTime) {
                fastestTime = lapTimes[i];
            }
        }
        System.out.println("Fastest time: " + fastestTime);
    }

    //Exercise: Create an integer array of 10 elements and give each element an arbitrary value. Print out the entire array using a loop.
    public static void arrayExercise14() {
        int[] intArr = new int[15];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 6;
        intArr[3] = 24;
        intArr[4] = 23;
        intArr[5] = 29;
        intArr[6] = 12;
        intArr[7] = 8;
        intArr[8] = 32;
        intArr[9] = 9;
        intArr[10] = 54;
        intArr[11] = 16;
        intArr[12] = 999;
        intArr[13] = 122;
        intArr[14] = 55;
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }

    //Exercise 2: Use a loop to populate an array with integers from 1 to 20. Use another loop to print the contents of the array (the elements) backwards.
    public static void arrayExercise15() {
        int[] intArr = new int[20];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i + 1;
        }

        for (int i = intArr.length - 1; i >= 0; i--) {
            System.out.println(intArr[i]);
        }
    }

    //Exercise 3: Create an array of five doubles and give each element some value. Calculate the sum of all the elements and print the result. Calculate the mean/average of the all the elements and print that too.
    public static void arrayExercise16() {
        double[] doubleArr = new double[5];
        doubleArr[0] = 12.4;
        doubleArr[1] = 662.211;
        doubleArr[2] = 9383.1;
        doubleArr[3] = 2.11;
        doubleArr[4] = 10.11;

        double sumArr = 0;
        for (int i = 0; i < doubleArr.length; i++) {
            sumArr += doubleArr[i];
        }
        double mean = sumArr / doubleArr.length;
        System.out.println("Sum is: " + sumArr);
        System.out.println("Mean is: " + mean);
    }

    //Exercise 4: Write a program which asks the user to enter their top five favourite foods and store their answers in a string array. However, create the array so it can only hold a maximum of three strings. After the user enters the third item, print “No more memory available.”, then print out the contents of the array.
    public static void arrayExercise17() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter five favorite foods: ");
        String[] foodArr = new String[3];
        for (int i = 0; i < foodArr.length; i++) {
            System.out.println("Food " + (i + 1) + ": ");
            foodArr[i] = scanner.nextLine();
        }
        System.out.println("No more memory avaiable. \n");
        System.out.println("Your favorite food are: ");
        for (int i = 0; i < foodArr.length; i++) {
            System.out.println(" - " + foodArr[i]);
        }
    }

    public static void arrayExercise18() {
        int[] grades = {9, 9, 7, 4, 5, 3, 2, 5, 3};
        System.out.println(Arrays.toString(grades));
    }

    public static void arrayExercise19() {
        //toString() = special method that all objects inherit, that returns a string that "textually represents" an object. Can be used both implicitly and explicitly.

        Car1 car = new Car1();
        //explicitly
        System.out.println(car.toString());
        //implicitly
        System.out.println(car);
    }

    public static void arrayExercise20() {
        int[] grades1 = {1, 2, 3, 72, 5};
        int[] grades2 = {1, 2, 3, 72, 5};
        if (grades1 == grades2) {
            System.out.println("equal");
        }
        if (grades1.equals(grades2)) {
            System.out.println("equals");
        }
        System.out.println(grades1 + " " + grades2);
        if (Arrays.equals(grades1, grades2)) {
            System.out.println("equals finally!");
        }
    }

    //Array.fill method
    public static void fillArrayExercise1() {
        int[] grades = {1, 2, 3, 72, 5};
        Arrays.fill(grades, 72);
        System.out.println(Arrays.toString(grades));

        String[] grade1 = new String[5];
        Arrays.fill(grade1, "");
        System.out.println(Arrays.toString(grade1));
    }

    public static void fillArrayExercise2() {
        int[] arr1 = new int[5];
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println(arr2);
        arr2[2] = 47;
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }

    //TwoDArray
    public static void twodArray() {
        int[][] worldPopulation = {//states for Country1 ->    0     1     2   3     4     5   6
                {1234, 4256, 2345, 8763, 8977, 9900, 4945},    //0 -> Country1
                {2456, 8766, 9992, 2345},                      //1 -> Country2
                {23454, 9944, 30003, 7799, 7344}                  //2 -> Country3
        };
        System.out.println("worldPopulation is: " + worldPopulation + "and size is: " + worldPopulation.length);
        System.out.println("worldPopulation[0] is: " + worldPopulation[0] + "and size is: " + worldPopulation[0].length);
        System.out.println("worldPopulation[1] is: " + worldPopulation[1] + "and size is: " + worldPopulation[1].length);
        System.out.println("worldPopulation[2] is: " + worldPopulation[2] + "and size is: " + worldPopulation[2].length);
        System.out.println("worldPopulation[0][0] : " + worldPopulation[0][0]);
        //Read Single Element
        System.out.println("worldPopulation[1][2] : " + worldPopulation[1][2]);

        //Write/Update Data
        worldPopulation[1][2] = 7777;
        System.out.println("==Re Reading==");
        System.out.println("worldPopulation[1][2] :" + worldPopulation[1][2]);

        //Read All
        for (int i = 0; i < worldPopulation.length; i++) { //0 to 2
            for (int j = 0; j < worldPopulation[i].length; j++) {
                System.out.println(worldPopulation[i][j] + " ");
            }
            System.out.println();
        }
        //3 1-D arrays with 5 elements each
        int[][] arr = new int[3][5];
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
        //Giving Size, we need to put the data later. Hence data initially would be 0.
        //Giving Data First, we need to give any size!!
        //Explore Enhanced For Loop on 2-D Array

    }

    // Operations With Arrays
    public static void twoDarrayExerciseWithOperator() {
        int[][] a = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        int[][] b = {
                {2, 2, 2},
                {2, 2, 2},
                {2, 2, 2}
        };
        System.out.println("==Matrix A==");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==Matrix B==");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }

        int[][] c = new int[3][3];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
            System.out.println();
        }
        System.out.println("==Matrix C==");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arraysTwoDimensionalExercise() {
        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("arrays.length = " + array2.length);

        for (int[] outer : array2) {
            System.out.println(Arrays.toString(outer));

        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void arraysSearchExample1() {
        int[] nums = new int[]{54, 2, 6, 99, 390, 290, 3, 1, 0, -59, 392, 60};
        int numsToFind = 1;
        //with linear search
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (val == numsToFind) {
                System.out.println("we found it at position " + i);
            }
        }
        //with binarySearch
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int position = Arrays.binarySearch(nums, numsToFind);
        System.out.println("Binary search found it at: " + position);
    }

    public static void fillArrayExercise() {
        Scanner keyboard = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = keyboard.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " has the value of " + numbers[i]);
        }
    }

    public static void arraysSortFillCopyOfPractice() {
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        //using fill method
        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(firstArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));
        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));

        String[] sArray = {"Abel", "Dan", "Ela", "Samuel", "Max"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Ela") >= 0) {
            System.out.println("Found Ela in the list");
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};
        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equals");
        } else {
            System.out.println("Arrays are not equal");
        }
    }

    public static void arraysChallengeExercise1() {
        Integer[] arr1 = {1, 65, 3, 8, 555, 861, 34, 100};
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.printf("Modified arr[]: %s", Arrays.toString(arr1));
    }

    public static void arraysChallengeExercise2() {
        int[] unsortedArray = getRandomArray1(5);
        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedArray = sortIntegers(new int[]{7, 30, 35});
        System.out.println(Arrays.toString(sortedArray));

    }

    public static int[] getRandomArray1(int len1) {
        Random random = new Random();
        int[] randomArray = new int[len1];
        for (int i = 0; i < len1; i++) {
            randomArray[i] = random.nextInt(1000);
        }
        return randomArray;
    }

    private static int[] sortIntegers(int[] array) {
        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {

            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("----->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("----->" + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }

    private static int[] getRandomArray(int len2) {
        Random random = new Random();
        int[] newInt = new int[len2];
        for (int i = 0; i < len2; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

    public static void multiDimensionalArrayExercise() {
        int nums[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 100);
                System.out.println(nums[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        for (int n[] : nums) {
            for (int m : n) {
                System.out.println(m + " ");
            }
        }
    }

    public static void multidimensionalArrayExercise1() {
        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));

        anyArray[0] = new String[]{"a", "b", "c"};
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[1] = new String[][]{
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2] = new int[2][2][2];

        System.out.println(Arrays.deepToString(anyArray));
        for (Object element : anyArray) {
            System.out.println("Element type = " + element.getClass().getSimpleName());
            System.out.println("Element toString() = " + element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }
    }

    //    public static void main (String... args){
//        System.out.println("Hello World again");
//        String[] splitStrings = "Hello World again".split(" ");
//        printText(splitStrings);
//
//       String[] sArray = {"first", "second", "third", "fourth", "fifth"};
//        System.out.println(String.join(",", sArray));
//    }
//
//    private static void printText(String... textList){
//        for (String t : textList){
//            System.out.println(t);
//        }
//    }
    public static void main(String[] args) {
        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));
        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedMin);

    }

    private static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas: ");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    private static int findMin(int[] array) {
        int min = Integer.MIN_VALUE;
        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }
}

