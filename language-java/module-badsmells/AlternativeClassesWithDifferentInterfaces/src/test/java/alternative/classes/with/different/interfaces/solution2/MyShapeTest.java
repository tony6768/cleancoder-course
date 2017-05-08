package alternative.classes.with.different.interfaces.solution2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import alternative.classes.with.different.interfaces.solution1.MyShape;

public class MyShapeTest {

	private MyShape myShape;

	@Before
	public void setUp() {
		myShape = new MyShape();
	}

	@Test
	public void test() {
		Assert.assertEquals(82.812f, this.myShape.getArea(), 0.1);
		this.myShape.scale(1.5f);
		Assert.assertEquals(186.327f, this.myShape.getArea(), 0.1);
	}

}
