package middle.lesson17;

import java.util.Set;
import java.util.TreeSet;

public class MainCity {

	public static void main(String[] args) {
		Set<City> cities = new TreeSet<>();
		cities.add(new City(1, "Wroc�aw", 634500));
		cities.add(new City(2, "Warszawa", 1735400));
		cities.add(new City(3, "Gda�sk", 463925));
		System.out.println(cities);
	}

}
