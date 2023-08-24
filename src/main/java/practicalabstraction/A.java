package practicalabstraction;

abstract public class A {

   abstract void display();
}
abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
}
class Pig extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

abstract class B extends A{
    void display(){
        System.out.println("Class A");
    }
    abstract void show();
}
class C extends B{
    void show(){
        System.out.println("class B");
    }
}


class Abstract{
    public static void main(String[]args){
        C obj = new C();
        obj.display();
        obj.show();
      //  Animal myObj = new Animal(); // will generate an error
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
