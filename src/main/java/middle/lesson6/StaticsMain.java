package middle.lesson6;

public class StaticsMain {

	public static void main(String[] args) {
		Restaurant mcDonalds = new Restaurant(RestaurantNames.MC_DONALDS);
		Restaurant kfc = new Restaurant(RestaurantNames.KFC);
		Restaurant pizzaHut = new Restaurant(RestaurantNames.PIZZA_HUT);
		
		RestaurantHelper.add(mcDonalds);
		RestaurantHelper.add(kfc);
		RestaurantHelper.add(pizzaHut);
		
		RestaurantHelper.showRestaurants();
	}

}
