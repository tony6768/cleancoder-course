package alternative.classes.with.different.interfaces.tp;

public class Rectangle implements IRectangle {

    private float length;
    private float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public float getLength() {
        return this.length;
    }

    @Override
    public float getWidth() {
        return this.width;
    }

    @Override
    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public float getRectangleArea() {
        return length * width;
    }

    @Override
    public void scale(double value) {
        this.length *= value;
        this.width *= value;
    }

}
