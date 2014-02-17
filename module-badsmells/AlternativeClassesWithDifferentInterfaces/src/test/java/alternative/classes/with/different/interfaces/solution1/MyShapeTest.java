package alternative.classes.with.different.interfaces.solution1;

import alternative.classes.with.different.interfaces.solution1.MyShape;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

public class MyShapeTest extends TestCase {

    private final MyShape myShape = new MyShape();

    public void test() {
        assertEquals(82.812f, this.myShape.getArea());
        this.myShape.scale(1.5f);
        assertEquals(186.327f, this.myShape.getArea());
    }

}
