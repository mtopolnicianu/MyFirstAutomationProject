package practicalabstraction;

abstract class Dog {
    String breed;

    public void bark() {
        System.out.println("Bark!");
    }
    public abstract void race();
}

class Chihuahua extends Dog {
    public void race(){
        System.out.println("Dog pooped");
    }

}

public class AbstractTutorial {
    public static void main(String[] args) {
        Chihuahua chihuahua = new Chihuahua();
        chihuahua.bark();
        System.out.println(chihuahua.breed);
        chihuahua.race();



    }
}
