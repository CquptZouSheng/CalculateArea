/**
 * Created by Zou on 2016/10/28.
 */
public class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of circle is:"+radius*radius*3.14);
    }
}
