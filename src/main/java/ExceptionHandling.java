public class ExceptionHandling {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(15); // Set age to 15 (which is below 18...)

        try {
            int myInt = Integer.parseInt("pants");
            System.out.println("After parsing pants");
            return;
        } catch (NumberFormatException | NullPointerException exception) {
            System.out.println("Hey dude, you can't make an int out");
        } finally {
            {
                System.out.println("in the finally block");
            }
        }
//        catch (Exception e) {
//            System.out.println("Hey dude, you can't make an int out");
//
//        }

//example 2
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception exception) {
            System.out.println("Something went wrong.");
        }
//example 3
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

        System.out.println("End hear!");
    }
}
