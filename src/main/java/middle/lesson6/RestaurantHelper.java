package middle.lesson6;

public final class RestaurantHelper {
	private static Restaurant[] restaurants =  new Restaurant [100];
	private static int restaurantsCounter = 0;
	
	public static void showRestaurants() {
		for (int i = 0; i < restaurantsCounter; i++) {
			System.out.println(restaurants[i].getName());
		}
	}
	
	public static void add(Restaurant restaurant) {
		restaurants[restaurantsCounter] = restaurant;
		restaurantsCounter++;
		System.out.println("New restaurant added.");
	}
}
