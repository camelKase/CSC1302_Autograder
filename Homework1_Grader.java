import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
/**
 *@author clee79 <clee79@student.gsu.edu>
 *Homework 1 grader Spring 2019
 *ISBN number
 */
public class Homework1_Grader {
	private String digits;
	private String checkSymbol;
	private ISBN testOne;
	private ISBN testTwo;
	private ISBN testThree;
	private ISBN testFour;
	private ISBN testFive;
	private ISBN emptyStringTest;
	private ISBN hwExample1;
	private ISBN hwExample2;
	@Before
	public void setUp() {
		testOne = new ISBN("145768301", "6");
		testTwo = new ISBN("145768301", "X");
		testThree = new ISBN("019384756", "1");
		testFour = new ISBN("183947634", "X");
		testFive = new ISBN("123456789", "0");
		emptyStringTest = new ISBN("","");
		hwExample1 = new ISBN("013394302", "X");
		hwExample2 = new ISBN("132379826", "9");
	}
   	@Test
    	public void testGetter() {
       		assertEquals("145768301", testOne.getDigits());
        	assertEquals("013394302", hwExample1.getDigits());
        	assertEquals("132379826", hwExample2.getDigits());
    	}
	@Test
	public void isValidTest() {
		assertTrue(hwExample1.isValid());
		assertTrue(hwExample2.isValid());
		assertFalse("FAILS EMPTY STRING INPUT: do not take points off but "
			+ "notify student of mistake", emptyStringTest.isValid());
		assertFalse("INVALID ISBN", testTwo.isValid());
		assertFalse("INVALID ISBN", testThree.isValid());
		assertFalse("INVALID ISBN", testFour.isValid());
		assertFalse("INVALID ISBN", testFive.isValid());
		assertTrue(testOne.isValid());
	}
   	@Test
    	public void toStringTest() {
        	System.out.println(testOne.toString());
        	String expected = "1-45-768301-6";
        	assertEquals(expected, testOne.toString());
    	}
}

