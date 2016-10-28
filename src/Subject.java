/**
 * Created by Zou on 2016/10/28.
 */
public class Subject {
    public static void main(String[] args) {
        Triangle mTriangle=new Triangle(10,20);
        mTriangle.calculateArea();
        //计算三角形的面积

        Square mSquare=new Square(10);
        mSquare.calculateArea();
        //计算正方形的面积

        Circle mCircle=new Circle(10);
        mCircle.calculateArea();
        //计算圆形的面积
    }
}
