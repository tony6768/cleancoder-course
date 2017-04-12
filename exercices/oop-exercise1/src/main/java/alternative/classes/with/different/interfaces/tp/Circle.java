package alternative.classes.with.different.interfaces.tp;

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
    public float getCircleArea() {
        return 3.14f * radius * radius;
    }

    @Override
    public void multiplyRadius(float multiplier) {
        this.radius *= multiplier;
    }

}
