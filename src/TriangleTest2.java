import junit.framework.TestCase;

public class TriangleTest2 extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testParameter() {
		//fail("Not yet implemented");

	Triangle a =new Triangle();
	a.setBase(2f);
	a.setHeight(2f);
	float c = a.perimeter();
	assertEquals(6f,c);
	}
	
}
