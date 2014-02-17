package alternative.classes.with.different.interfaces.solution2;

import alternative.classes.with.different.interfaces.solution1.IShape;
import alternative.classes.with.different.interfaces.tp.Circle;
import alternative.classes.with.different.interfaces.tp.ICircle;

public class CircleShape implements IShape {

    private final ICircle circle;

    public CircleShape(float radius) {
        this.circle = new Circle(radius);
    }

    public float getArea() {
        return this.circle.getCircleArea();
    }

    public void scale(float value) {
        this.circle.multiplyRadius(value);
    }

}
