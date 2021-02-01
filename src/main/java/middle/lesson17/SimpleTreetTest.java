package middle.lesson17;

import java.util.Set;
import java.util.TreeSet;

public class SimpleTreetTest {

	public static void main(String[] args) {
		Set<Integer> primeNumbers = new TreeSet<>();
		primeNumbers.add(13);
		primeNumbers.add(7);
		primeNumbers.add(3);
		primeNumbers.add(5);
		primeNumbers.add(11);
		primeNumbers.add(2);
		
		System.out.println(primeNumbers);
	}
}
