import junit.framework.TestCase;

public class TriangleTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testArea() {
		float a;
		//fail("Not yet implemented");
		Triangle t = new Triangle();
		t.setBase(5);
		t.setHeight(4);
		a=t.area();
		assertEquals(10f,a);
	}

}
