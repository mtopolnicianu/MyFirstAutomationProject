public class Calculator {
    public int add(int n1, int n2, int n3) {
        return n1 + n2;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public double add(double n1, int n2) {
        return n1 + n2;
    }

    public static void getCalculator() {
        Calculator calculator = new Calculator();
        int r1 = calculator.add(4, 5, 6);
        System.out.println(r1);

    }
    static void myMethod(){
        System.out.println("Hello");

    }
}
