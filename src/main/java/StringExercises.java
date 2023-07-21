
public class StringExercises {

    //Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
    public String helloName(String name) {
        String firstName = "Ela";
        return ("Hello " + name + "!");
    }

    public static String helloName2(String name){
        return "Hello " + name + "!";
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

    public static String makeOutWord2(String out, String word){
        return out.substring(0, 2) +word + out.substring(2, 4);
    }

    //String-1 > nonStart:Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

    public static  String nonStart(String a , String b){
        return a.substring(1, a.length()) + b.substring(1, b.length());
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
    public static String middleThree(String str) {
        int a = str.length();
        int middle = str.length() / 2 + 1;
        String midThree = str.substring(middle - 2, middle + 1);

        return midThree;
    }

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
            return str.substring(str.length() - 1);
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
    public static String startWord(String str, String word) {
        if (str.length() > 0 && str.substring(1).startsWith(word.substring(1))) {
            return str.substring(0, word.length());
        } else return "";
    }

    //String-1 > makeAbba:Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
    public static String makeAbba(String a, String b) {
        return a + b + b + a;

    }

    //String-1 > left2: Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
    public static String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    //String-1 > extraEnd: Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
    public static String extraEnd(String str) {
        return str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2);
    }

    //String-1 > withoutEnd: Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
    public static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    /* String-1 > firstTwo: Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.*/
    public static String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(0, 2);
        }
    }

    //String-1 > withouEnd2:Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
    public static String withoutEnd2(String str) {
        if (str.length() <= 1) {
            return "";
        } else {
            return str.substring(1, str.length() - 1);

        }
    }

    //String-1 > nTwice: Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
    public static String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n, str.length());
    }

    /*String-1 > hasBad: Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings. */
    public static boolean hasBad(String str) {
        if ((str.length() >= 3 && str.substring(0, 3).equals("bad")) || (str.length() >= 4 && str.substring(1, 4).equals("bad"))) {
            return true;
        } else {
            return false;
        }
    }

    /* String-1 > conCat: Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat". */
    public static String conCat(String a, String b) {
        if(a.length() == 0) return b;
        else if(b.length() == 0) return a;
        if(a.substring(a.length()-1).equals(b.substring(0,1))){
            return a+b.substring(1);
        }
        return a+b;
    }

    //String-1 > frontAgain: Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
    public static boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        } else {
            return str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()));
        }
    }

    /*String-1 > without2: Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged. */
    public static String without2(String str) {
        if (str.length() <= 1) {
            return str;
        } else if (str.length() == 2) {
            return "";
        } else {
            if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))) {
                return str.substring(2, str.length());
            } else {
                return str;
            }
        }
    }

    //String-1 > withoutX: Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
    public static String withoutX(String str) {
        if (str.length() > 0 && str.charAt(0) == 'x')
            str = str.substring(1, str.length());
        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x')
            str = str.substring(0, str.length() - 1);
        return str;
    }


    /* String-1 > makeTags: The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>". */
    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    /* String-1 > twoChar: Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2. */
    public static String twoChar(String str, int index) {
        if (str.length() - index < 2 || index < 0) {
            return str.substring(0, 2);
        } else {
            return str.substring(index, index + 2);
        }
    }

    // String-1 > middleTwo: Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
    public static String middleTwo(String str) {
        int a = str.length();
        int middle = str.length() / 2;
        String midTwo = str.substring(middle - 1, middle + 1);
        return midTwo;
    }

    //String-1 > lastTwo: Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
    public static String lastTwo(String str) {
        int l = str.length();
        if (l >= 2) {
            String start = str.substring(0, l - 2);
            String end = "" + str.charAt(l - 1) + str.charAt(l - 2);
            return start + end;
        }
        return str;
    }

    //String-1 > atFirst:Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
    public static String atFirst(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else if (str.length() == 1) {
            return str + "@";
        } else {
            return "@" + "@";
        }
    }

    //String-1 > right2: Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
    public static String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    /*String-1 > minCat: Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.*/
    public static String minCat(String a, String b) {
        if (a.length() == b.length())
            return a + b;
        else if (a.length() > b.length()) {
            int delete = a.length() - b.length();
            return a.substring(delete, a.length()) + b;
        } else {
            int delete = b.length() - a.length();
            return a + b.substring(delete, b.length());
        }
    }

    // String-1 > without2: Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.

    public static String withoutXtwo(String str) {
        if (str.length() <= 1) {
            return str;
        } else if (str.length() == 2) {
            return "";
        }
        if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))) {
            return str.substring(2, str.length());
        } else return str;
    }

    //String-1 > deFront: Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
    public static String deFont(String str) {
        String restOfString = str.substring(2, str.length());
        if (str.charAt(1) == 'b') restOfString = 'b' + restOfString;
        if (str.charAt(0) == 'a') restOfString = 'a' + restOfString;
        return restOfString;
    }

    /* String-1 > comboString: Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).*/
    public static String comboString(String a, String b) {
        int firstString = a.length();
        int secondString = b.length();
        if (firstString < secondString) {
            return a + b + a;
        } else return b + a + b;
    }

    public static boolean hasBaad(String str) {
        if (str.substring(0).equals("bad") || str.substring(1).equals("bad")) {
            return true;
        } else {
            return false;
        }
    }

}

