package alternative.classes.with.different.interfaces.solution1;

public class Rectangle implements IRectangle {

    private float length;
    private float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public float getLength() {
        return length;
    }

    @Override
    public float getWidth() {
        return width;
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
    public float getArea() {
        return this.length * this.width;
    }

    @Override
    public void scale(float value) {
        this.length *= value;
        this.width *= value;
    }

}
