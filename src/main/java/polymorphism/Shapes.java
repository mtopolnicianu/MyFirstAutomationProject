package polymorphism;

public class Shapes {
    public void area() {
        System.out.println("The formula for area of ");
    }

    public static void main(String[] args) {
        Shapes myShape = new Shapes();  // Create a Shapes object
        Shapes myTriangle = new Triangle();  // Create a Triangle object
        Shapes myCircle = new Circle();  // Create a telesko.test.Circle object
        myShape.area();
        myTriangle.area();
        myShape.area();
        myCircle.area();
    }
}
