package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//
//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
//
//

        Quadrilateral square = new Square(5, 5);
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());

        Quadrilateral rectangle = new Rectangle(8,5);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());


    }
}
