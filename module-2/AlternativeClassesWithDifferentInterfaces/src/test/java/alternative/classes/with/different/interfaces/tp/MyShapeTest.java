package alternative.classes.with.different.interfaces.tp;

import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

public class MyShapeTest extends TestCase {

    private final MyShape myShape = new MyShape();

    public void test() {
        assertEquals(82.812f, this.myShape.getTotalArea());
        this.myShape.scaleAll(1.5f);
        assertEquals(186.327f, this.myShape.getTotalArea());
    }

}
