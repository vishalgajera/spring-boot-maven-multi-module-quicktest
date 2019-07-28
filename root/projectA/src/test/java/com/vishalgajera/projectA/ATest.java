package com.vishalgajera.projectA;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * The Class ATest.
 */
public class ATest {

	/**
	 * Test method A.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Test
	public void testMethodA() throws Exception {
		A classA = new A();
		String expected = "result from method A of a Class-A";
		assertEquals(expected, classA.methodA());
	}

}
