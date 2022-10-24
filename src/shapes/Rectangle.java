package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    @Override
    public double getPerimeter(){
        return 2*width + 2 * length;
    }

    @Override
    public double getArea (){
        return length*width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

//    protected int length;
//
//    protected int width;
//
//    public int getPerimeter(){return 2 * length + 2 * width;}
//
//    public int getArea(){return length * width;}
//
//    public Rectangle(){}
//
//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//    }
    public Rectangle(){}

    public Rectangle (double length, double width){
        super(length, width);
    }

}
