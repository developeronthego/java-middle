package middle.lesson6;

import static middle.lesson6.RestaurantNames.KFC;
import static middle.lesson6.RestaurantNames.MC_DONALDS;
import static middle.lesson6.RestaurantNames.PIZZA_HUT;

import static middle.lesson6.RestaurantHelper.add;
import static middle.lesson6.RestaurantHelper.showRestaurants;

public class StaticImportsMain {

	public static void main(String[] args) {
		Restaurant mcDonalds = new Restaurant(MC_DONALDS);
		Restaurant kfc = new Restaurant(KFC);
		Restaurant pizzaHut = new Restaurant(PIZZA_HUT);
		
		add(mcDonalds);
		add(kfc);
		add(pizzaHut);
		
		showRestaurants();
	}

}
