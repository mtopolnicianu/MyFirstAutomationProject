public class JavaMethodsExercises {
    int e = 90; // Instance Variable
    static int a = 0; //Global variable
    final static int c = 80; //Final Variable

    public static void add(int a, int b) {
        if (a == 0) {
            int d = 60; //local variable
            System.out.println(a);
        }
        System.out.println(a + b);
    }

    public static void print() {
        System.out.println(a);
    }


    static void myMethod() {
        System.out.println("I just got executed!");
    }

    public static void saySomething(String s) {
        System.out.println(s);
    }

    public static void printInfo(String name, int age) {
        System.out.println(name + " is " + age + " years old");
    }

    public static int addNumber(int x, int y) {
        return x + y;
    }

    public static int multiplyNumbers(int a) {
        int ans = a * 7;
        return ans;
    }

    public static int addNumbers(int x, int y) {
        int ans = x + y;
        return ans;
    }

    public static boolean equalNumbers(int r, int t) {
        if (r == t) return true;
        else return false;
    }

    public static void myMethod(String fname) {
        System.out.println(fname + " Refsenes");
    }

    // Create a checkAge() method with an integer variable called age
    static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

            // If age is greater than, or equal to, 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sum(int x, int y, int z) {
        return x + y + z;
    }

    public static void sayHi() {
        System.out.println("Hi");
    }

    public static String sayHi(String name) {
        return "Hi " + name;
    }

    public static void sayHiii() {
        System.out.println("Hi");
    }

    public static String sayHiiii() {
        return "Hiiii";
    }

    public static int plusMethodInt(int x, int y) {
        return x + y;

    }

    public static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    public static class MethodOverloading {
        int num;
        MethodOverloading(){
            System.out.println("Default");
        }
        MethodOverloading(int x){
            num = x;
            System.out.println("Parameterize");

        }
        MethodOverloading(int x, int y){
            num =x;
            System.out.println("Parameterize2");
        }
        int add(int x, int y) {
            return (x + y);
        }
        int add(int x, int y, int z){
            return (x+y+z);
        }
        double add(double x, double y){
            return (x+y);
        }

    }


    public static void main(String[]args){


    }
}
