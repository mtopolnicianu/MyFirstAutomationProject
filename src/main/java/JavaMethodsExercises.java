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
}
