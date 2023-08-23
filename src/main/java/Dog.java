//Constructor exercises
public class Dog {
    String name;
    int age;

    public Dog(String name){
        this.name = name;
    }
    public Dog(int age){
        this.age = age;
    }
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[]args){
        Dog myDog = new Dog("George", 33);
        System.out.println(myDog.name + " " +myDog.age);
    }
}
