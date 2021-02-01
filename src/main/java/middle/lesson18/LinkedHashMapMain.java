package middle.lesson18;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashMapMain {

	public static void main(String[] args) {
		Set<String> colours = new LinkedHashSet<>();
		colours.add("niebieski");
		colours.add("zielony");
		colours.add("czerwony");
		colours.add("zielony");
		System.out.println(colours);
	}

}
