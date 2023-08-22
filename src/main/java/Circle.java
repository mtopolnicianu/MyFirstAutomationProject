import java.awt.*;

public class Circle {

    Point center;
    double radius;

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }
}
