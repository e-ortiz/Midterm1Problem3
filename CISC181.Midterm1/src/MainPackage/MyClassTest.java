package MainPackage;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyClassTest {

	@Test
	public void testReturnTrue() {
		boolean produced;
		produced = MyClass.ReturnTrue();
		assertTrue(produced);
	}

	@Test
	public void testAddTwoNumbers() {
		int correct = 15;
		int x = 8;
		int y = 7;
		
		int produced;
		produced = MyClass.AddTwoNumbers(x, y);
		
		assertEquals(correct, produced);

	}

}
