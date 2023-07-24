public class JavaBooleansExercises {

    public static boolean firstExercise(boolean a) {
        boolean isJavaFun = false;
        boolean isFishTasty = true;
        return isFishTasty;

    }

    public static boolean booleanExpressionOne(int a, int b) {
        return a > b;
    }

    public static boolean booleanExpressionTwo(int a, int b) {
        return a < b;
    }

    public static boolean equalExpression(int a) {
        int x = 10;
        return a == x;
    }

    public static String realLifeExampleWithBoolean(int myAge, int votingAge) {
        int age = myAge;
        int ageForVoting = votingAge;

        String message1 = "Old enough to vote!";
        String message2 = "Not old enough to vote";
        if (age >= ageForVoting) {
            return message1;
        } else {
        }
        return message2;
    }

    public static boolean booleanExercise(){
        boolean greenLight = true;
        boolean pedestrian = false;
        boolean rightTurn = false;
        boolean otherLane = false;
        boolean checkResult = (((rightTurn && !pedestrian|| otherLane) || (!rightTurn && !pedestrian && greenLight)) == true);
        return checkResult;
    }

}
