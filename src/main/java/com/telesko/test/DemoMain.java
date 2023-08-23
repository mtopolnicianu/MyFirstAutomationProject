package com.telesko.test;

public class DemoMain {
    final int x = 10;
    final double PI = 3.14;

    //Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    //Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {

        myStaticMethod();//Call the static method
        // myPublicMethod(); This would output an error
        DemoMain obj = new DemoMain();
        obj.myPublicMethod();

        Student student = new Student();
        student.rollno = 9;
        student.marks = 99;
        student.age = 33;

        DemoMain demoMain = new DemoMain();
//        demoMain.x = 50; // will generate an error: cannot assign a value to a final variable


    }
}
