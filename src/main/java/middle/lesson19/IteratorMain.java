package middle.lesson19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {

	public static void main(String[] args) {
		List<String> movies = new ArrayList<>();
		movies.add("Indiana Jones");
		movies.add("Avengers");
		movies.add("Star Wars");

		Iterator<String> iterator = movies.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
