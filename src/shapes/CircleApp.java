package shapes;

import util.Input;

//import java.util.Input;
public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        Circle circle = new Circle(input.getDouble("Enter the radius of the circle: "));
        System.out.printf("The area of the circle is %.2f and its circumference is %.2f", circle.getArea(), circle.getCircumference());
    }

}
