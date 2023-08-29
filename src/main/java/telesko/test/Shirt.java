package telesko.test;

import java.util.Scanner;

public class Shirt {

    public static String color;
    public static char size;
    public static String texture;

    Shirt() {

    }

    Shirt(String newColor, char newSize) {
        color = newColor;
        size = newSize;
    }

    Shirt(String newTexture, char anotherSize, String anotherColor) {
        texture = newTexture;
        size = anotherSize;
        color = anotherColor;
    }

    //
//    telesko.test.Shirt(){
//        System.out.println("inside constructor!");
//    }
    public static void putOn() {
        System.out.println("telesko.test.Shirt is on!");
    }

    public static void takeOff() {
        System.out.println("Short is off");
    }

    public static void setColor(String newColor) {
        color = newColor;
    }

    public static void setSize(char newSize) {
        size = newSize;
    }

    public static void main(String[] args) {
        Shirt shirt = new Shirt("White", 'M');
        Shirt newShirt = new Shirt("Blue", 'S');
//        shirt.setColor("White");
//        shirt.setSize('M');
//        shirt.putOn();

        System.out.println(shirt.color);
        System.out.println(shirt.size);

        Scanner scanner = new Scanner(System.in);
    }
}
