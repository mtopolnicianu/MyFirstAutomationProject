package practicalinterfaces;

//class - class -> extends
//class - interface -> implements
//interface - interface -> extends

interface Computer {
    void code();
}

interface A {
    int age = 44; //final and static
    String area = "Mumbai";

    void show();

    void config();
}

interface X {
    void run();
}

interface Y extends X {

}

class B implements A, Y {
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void run() {
        System.out.println("running");
    }
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, compile, run: Faster");
    }
}

class Developer {
    public void devApp(Computer lap) {
        lap.code();
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.config();
        obj.show();
        X obj1 = new B();
        obj1.run();
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer navin = new Developer();
        navin.devApp(lap);
        navin.devApp(desk);

        System.out.println(A.area);

    }
}
