package middle.lesson21;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MyCalculatorTest {
	private static int numberOne;
	private static int numberTwo;
	private MyCalculator calculator;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		numberOne = 12;
		numberTwo = 10;
	}
	
	@Before
	public void setUp() throws Exception {
		calculator = new MyCalculator();
	}

	@Test
	public void testAdd() {
		int expected = 22; // given
		int actuals = calculator.add(numberOne, numberTwo); // when
		assertEquals(expected, actuals); //then
	}

	@Test
	@Ignore
	public void testMultiply() {
		int expected = 120;
		int actuals = calculator.multiply(numberOne, numberTwo);
		assertEquals(expected, actuals);
	}

	@Test
	public void testDivide() {		
		double expected = 1.2;
		double actuals = calculator.divide(numberOne, numberTwo);
		assertEquals(expected, actuals, 0);
	}
	
	@Test(expected = NullPointerException.class)
	public void testAddWithNull() {
		int expected = 22;
		int actuals = calculator.add(numberOne, null);
		assertEquals(expected, actuals);
	}
	
	@Test
	public void testDivideByZero() {
		double expected = Double.POSITIVE_INFINITY;
		double actuals = calculator.divide(numberOne, 0);
		assertEquals(expected, actuals, 0);
	}
}
