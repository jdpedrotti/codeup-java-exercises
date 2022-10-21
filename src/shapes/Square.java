package shapes;

public class Square extends Rectangle {

    protected int side;

    public Square(int side){
//        super.getPerimeter(side, side);
//        super.getArea(side, side);
        this.side = side;
    }

    public int getPerimeter(){return 4 * side;}

    public int getArea(){return side * side;}


}
