import static java.lang.Math.abs;

public class JavaMathExercises {

    public static int mathExercises(int a, int b ) {
        return a+b;
    }

    public static int mathMaxExercise(int a, int b){
       return Math.max(a, b);
    }

    public static int mathMinExercise(int a, int b){
        return Math.min(a, b);
    }
    public static double sqrtExercise(double a){
        return Math.sqrt(a);
    }

    public static double absExercise(double x){
        return Math.abs(x);
    }

    public static double randomExercise(double x){
        return Math.random();
    }
    public static int randomNum(int x){
        int randomNumber = (int) (Math.random() * 101);
        return randomNumber;
    }

    public static int highestValueExercise(int a, int b){
       int maxNum =  Math.max(a, b);
        return maxNum;
    }

    public static double squareExercise(double a){
        double sqrEx = Math.sqrt(a);
        return Math.sqrt(sqrEx);
    }
}
