public class JavaLogic1Practical {
    /*Logic-1 > cigarParty - When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.*/
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            if (cigars >= 40) return true;
        } else {
            if (cigars >= 40 && cigars <= 60) return true;
        }
        return false;
    }

    /*Logic-1 > caughtSpeeding - You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases. */
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday == false) {
            if (speed <= 60) return 0;

            else if (speed >= 61 && speed <= 80) return 1;

            else if (speed >= 81) return 2;

        }
        if (speed <= 65) return 0;
        else if (speed >= 66 && speed <= 85) return 1;
        else return 2;
    }

    /*Logic-1 > love6 -The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.  */
    public boolean love6(int a, int b) {
        if (a == 6 || b == 6)
            return true;
        else if (Math.abs(a - b) == 6)
            return true;
        else if (Math.abs(b - a) == 6)
            return true;
        else if ((a - b) == 6 || (b + a) == 6)
            return true;
        else
            return false;
    }

    //Logic-1 > more20 - Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod
    public boolean more20(int n) {
        return (n % 20) == 1 || (n % 20) == 2;
    }

    //Logic-1 > nearTen - Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod
    public boolean nearTen(int num) {
        if (num % 10 >= 8 || num % 10 <= 2)
            return true;
        else
            return false;
    }
}
