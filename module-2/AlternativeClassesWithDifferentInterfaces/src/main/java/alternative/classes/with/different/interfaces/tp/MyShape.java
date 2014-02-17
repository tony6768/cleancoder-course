package alternative.classes.with.different.interfaces.tp;

import java.util.ArrayList;
import java.util.List;

public class MyShape {

    private final List<IRectangle> rectangles = new ArrayList<IRectangle>(3);
    private final List<ICircle> circles = new ArrayList<ICircle>(2);

    public MyShape() {
        rectangles.add(new Rectangle(4.6f, 3.7f));
        rectangles.add(new Rectangle(2.8f, 5.2f));
        rectangles.add(new Rectangle(2.9f, 1.1f));
        circles.add(new Circle(2.1f));
        circles.add(new Circle(3.3f));
    }

    public void scaleAll(float value) {
        for (final ICircle circle : circles) {
            circle.multiplyRadius(value);
        }
        for (final IRectangle rectangle : rectangles) {
            rectangle.scale(value);
        }
    }

    public float getTotalArea() {
        float totalArea = 0;
        for (final ICircle circle : circles) {
            totalArea += circle.getCircleArea();
        }
        for (final IRectangle rectangle : rectangles) {
            totalArea += rectangle.getRectangleArea();
        }
        return totalArea;
    }
}
