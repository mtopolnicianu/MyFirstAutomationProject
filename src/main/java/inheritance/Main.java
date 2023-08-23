package inheritance;

public class Main {
    public static void main(String[]args){
        Mouse1 m1 = new Mouse1();
        Mouse2 m2 = new Mouse2();
        m1.leftClick();
        m1.rightClick();
        m1.scrollDown();
        m1.scrollUp();

        m2.leftClick();
        m2.rightClick();
        m2.scrollDown();
        m2.scrollUp();
        m2.connect();

        Shoe shoe = new Shoe("Nike", 10);
        System.out.println(shoe.brand);

        Walking walking = new Walking(true, "Nike", 10);
        System.out.println(walking.brand);
        System.out.println(walking.goreText);

        Running running =new Running(4.3, "Nike", 10);
        System.out.println(running.weight);

        Car c = new Car();
        //c.display();
        c.vroom();

        Cat myCat = new Cat(10, "Tom", "Purina One");
        System.out.println(myCat.age + myCat.name + myCat.catFoodPreference);
        myCat.makeNoise();
    }
}
