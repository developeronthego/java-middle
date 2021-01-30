package middle.lesson16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMain {

	public static void main(String[] args) {
		Set<String> europeanCountries = new HashSet<>();
		europeanCountries.add("Polska");
		europeanCountries.add("Niemcy");
		europeanCountries.add("Francja");
		europeanCountries.add("Niemcy");
		
		for(String country: europeanCountries) {
			System.out.println(country);
		}
		
		Set<String> asianCountries = new HashSet<>();
		asianCountries.add("Japonia");
		asianCountries.add("Wietnam");
		asianCountries.add("Indie");
		
		Set<String> allWorld = new HashSet<>();
		allWorld.addAll(europeanCountries);
		allWorld.addAll(asianCountries);
		
		for(String country: allWorld) {
			System.out.println(country);
		}
		
		if (allWorld.containsAll(europeanCountries)) {
			allWorld.removeAll(europeanCountries);
		}
		
		for (String country : allWorld) {
			System.out.println(country);
		}
		
		allWorld.add("USA");
		allWorld.retainAll(europeanCountries);
		for (String country : allWorld) {
			System.out.println(country);
		}
	}

}
