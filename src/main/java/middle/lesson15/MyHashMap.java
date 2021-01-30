package middle.lesson15;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MyHashMap {

	public static void main(String[] args) {
		Map<Integer, String> books = new HashMap<>();
		
		books.put(1, "Pan Tadeusz");
		books.put(2, "Potop");
		books.put(3, "Zbrodnia i kara");
		books.put(4, "Solaris");

		System.out.println(books.hashCode());
		for (Entry<Integer, String> item : books.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}

		
		System.out.println(books.hashCode());
		books.remove("Something");
		books.remove(1, "Something");
		
		books.replace(2, "Anything");
		
		System.out.println(books.putIfAbsent(5, "New item"));
		System.out.println(books.putIfAbsent(6, "Solaris"));
		
		System.out.println(books.hashCode());
		for (Entry<Integer, String> item : books.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}

		
		int key = 1;
		if (books.containsKey(key)) {
			System.out.println(books.get(key));
		}
				
		
		if (!books.isEmpty()) {
			System.out.println(books.size());
			books.clear();
		}
		
		Map<MyHashKey, Integer> mapWithComplexKey = new HashMap<>();
		mapWithComplexKey.put(new MyHashKey("something"), 10);
		mapWithComplexKey.put(new MyHashKey("nothing"), 20);
		mapWithComplexKey.put(new MyHashKey("other"), 30);
		
        System.out.println("Value for key something: " + mapWithComplexKey.get(new MyHashKey("something"))); 
        System.out.println("Value for key nothing: " + mapWithComplexKey.get(new MyHashKey("nothing"))); 
        System.out.println("Value for key other: " + mapWithComplexKey.get(new MyHashKey("other"))); 
	}

}
