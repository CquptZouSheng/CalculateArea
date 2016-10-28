/**
 * Created by Zou on 2016/10/28.
 */
public class Triangle extends Shape {
    int height,base;

    public Triangle(int height, int base) {
        super();
        this.height = height;
        this.base = base;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of triangle is:"+height*base/2);
    }
}
