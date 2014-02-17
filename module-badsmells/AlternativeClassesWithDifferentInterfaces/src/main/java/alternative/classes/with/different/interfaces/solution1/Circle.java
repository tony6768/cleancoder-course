package alternative.classes.with.different.interfaces.solution1;

public class Circle implements ICircle {

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float getRadius() {
        return this.radius;
    }

    @Override
    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return 3.14f * this.radius * this.radius;
    }

    @Override
    public void scale(float value) {
        this.radius *= value;
    }

}
