package middle.lesson21;

public class MyCalculator {

	public int add(Integer numberOne, Integer numberTwo) {
		return numberOne + numberTwo;
	}

	private int subtract(Integer numberOne, Integer numberTwo) {
		return numberOne - numberTwo;
	}

	protected int multiply(Integer numberOne, Integer numberTwo) {
		return numberOne * numberTwo;
	}

	public double divide(Integer numberOne, Integer numberTwo) {
		return (double) numberOne / numberTwo;
	}
}
