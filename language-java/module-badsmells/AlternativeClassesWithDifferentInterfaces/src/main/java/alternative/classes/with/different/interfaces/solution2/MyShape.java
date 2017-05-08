package alternative.classes.with.different.interfaces.solution2;

import alternative.classes.with.different.interfaces.solution1.IShape;
import java.util.ArrayList;
import java.util.List;

public class MyShape implements IShape {

    private final List<IShape> shapes = new ArrayList<IShape>(5);

    public MyShape() {
        this.shapes.add(new RectangleShape(4.6f, 3.7f));
        this.shapes.add(new RectangleShape(2.8f, 5.2f));
        this.shapes.add(new RectangleShape(2.9f, 1.1f));
        this.shapes.add(new CircleShape(2.1f));
        this.shapes.add(new CircleShape(3.3f));
    }

    @Override
    public float getArea() {
        float totalArea = 0;
        for (final IShape shape : this.shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }

    @Override
    public void scale(float value) {
        for (final IShape shape : this.shapes) {
            shape.scale(value);
        }
    }

}
