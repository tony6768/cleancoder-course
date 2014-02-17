package alternative.classes.with.different.interfaces.solution2;

import alternative.classes.with.different.interfaces.solution1.IShape;
import alternative.classes.with.different.interfaces.tp.IRectangle;
import alternative.classes.with.different.interfaces.tp.Rectangle;

public class RectangleShape implements IShape {

    private final IRectangle rectangle;

    public RectangleShape(float length, float width) {
        this.rectangle = new Rectangle(length, width);
    }

    @Override
    public float getArea() {
        return this.rectangle.getRectangleArea();
    }

    @Override
    public void scale(float value) {
        this.rectangle.scale(value);
    }

}
