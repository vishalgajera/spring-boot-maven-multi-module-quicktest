package com.vishalgajera.projectB;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * The Class BTest.
 */
public class BTest {

	/**
	 * Test method B.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Test
	public void testMethodB() throws Exception {
		B classB = new B();
		String expected = "result from method B of a Class-B";
		assertEquals(expected, classB.methodB());
	}

}
