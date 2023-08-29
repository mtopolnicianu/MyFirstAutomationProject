package telesko.test;

//Method Overloading
public class Eight {
    void school(int a) {
        System.out.println("My first non static Method");
    }

    static void school(double b, int a) {
        System.out.println("My second  static Method");
    }

    static void school(char c, double b, int a) {
        System.out.println("My third static Method");
    }

    void school(char c,double b) {
        System.out.println("My fourth Non Static Method");
    }
    void school(double b){
        System.out.println("My fifth Non static Method");}
}
