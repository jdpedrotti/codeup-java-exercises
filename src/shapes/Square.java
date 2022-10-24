package shapes;

public class Square extends Quadrilateral {

//    protected double length;
//    protected double width;

    @Override
    public double getPerimeter(){
        return 4 * length;
    }
    @Override
    public double getArea(){
        return length * width;
}
    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = length;
    }

    public Square(){}
    public Square(double side){
        super(side, side);
    }




//
//    protected int side;
//
//    public Square(int side){
////        super.getPerimeter(side, side);
////        super.getArea(side, side);
//        this.side = side;
//    }
//
//    public int getPerimeter(){return 4 * side;}
//
//    public int getArea(){return side * side;}
//





}
