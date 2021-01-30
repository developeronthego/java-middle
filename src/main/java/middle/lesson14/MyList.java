package middle.lesson14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Pierwszy");
		list.add("Drugi");
		list.add("Trzeci");
		list.add(3, "Czwarty");
		
		list.remove("Czwarty");
		list.remove(list.indexOf("Trzeci"));
		
		System.out.println(list.get(0));
		for (String element : list) {
			System.out.println(element);
		}
		
		if(list.contains("Drugi")) {
			System.out.println("Lista posiada drugi element");
		}
		
		list.add("Drugi");
		if(list.contains("Drugi")) {
			System.out.println("Lista posiada drugi element");
		}
		
		String[] array = list.toArray(new String[0]);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		List<String> listFromArray = Arrays.asList(array);
		List<String> mySubList = listFromArray.subList(0, 2);
		System.out.println(mySubList.size());
		for (String element : mySubList) {
			System.out.println(element);
		}
		
		if (!list.isEmpty()) {
			list.clear();
		}
		
	}

}
