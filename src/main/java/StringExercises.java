public class StringExercises {


    //Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
    public String helloName(String name) {
        String firstName = "Ela";
        return ("Hello " + name + "!");
    }

    /*String-1 > makeOutWord:
    Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.*/
    public static void makeOutWord() {
        String java = "Hello There";
        String a = java.substring(5);
        System.out.println(a);
        String b = java.substring(1, 3);
        System.out.println(b);
    }

    //String-1 > firstHalf: Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
    public static void getFirstHalfFromString() {
        String str = "WooHoo";
        System.out.println(str.substring(0, str.length() / 2));
    }

    /*String-1 > lastChars:
    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.*/
    public static void lastChars(String a, String b) {

        String first = "@";
        String last = "@";

        if (a.length() > 0)
            first = a.substring(0, 1);

        if (b.length() > 0)
            last = b.substring(b.length() - 1);
        System.out.println(first + last);

    }

    //String-1 > middleThree: Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
//    public static void getMiddleThreeFromString(){
//        String str = "Candy";
//        int mid = str.length()/2;
//        return
//    }

    /* String-1 > extraFront: Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.*/
    public static String extraFront(String str) {

        if (str.length() == 0) {
            return "";
        }

        if (str.length() == 1) {
            return str + str + str;
        } else {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        }
    }

    //String-1 > seeColor: Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
    public static String seeColor(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("red")) {
            return "red";
        }
        if (str.length() >= 4 && str.substring(0, 4).equals("blue")) {
            return "blue";
        } else return "";
    }

    //String-1 > theEnd: Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
    public static String theEnd(String str, boolean front) {
        if (front)
            return str.substring(0, 1);
        else
            return str.substring(str.length() -1);
    }

    //String-1 > endsLy: Given a string, return true if it ends in "ly".
    public static boolean endsLy(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return false;
        }

        if (str.substring(str.length() - 2).endsWith("ly")) {
            return true;
        }
        {
            return false;
        }
    }

    /*String-1 > startWord: Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.*/
    public static String startWord (String str, String word){
        if (str.length()> 0 && str.substring(1).startsWith(word.substring(1))){
            return str.substring(0, word.length());
        }
        else return "";

    }

}
