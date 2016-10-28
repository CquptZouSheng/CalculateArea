/**
 * Created by Zou on 2016/10/28.
 */
public class Square extends Shape {
    int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of square is:"+length*length);
    }
}
