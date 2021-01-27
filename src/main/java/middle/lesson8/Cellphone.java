package middle.lesson8;

public class Cellphone {

	private static final String SPACE = " ";

	public static void main(String[] args) {
		showInfo("name: iPhone 10", "brand: Apple", "release date: November 3, 2017", "size: H: 143.6 mm x 70.9 mm x 7.7 mm" , 
				"display: 2436×1125 px", "system: IOS ", "memory: 3GB ", "battery: 2716 mA/h");
		showInfo("name: Galaxy S", "brand: Samsung", "release date: 4 June 2010");
		
		showInfoVar("name: iPhone 10", "brand: Apple", "release date: November 3, 2017", "size: H: 143.6 mm x 70.9 mm x 7.7 mm");
		showInfoVar("name: Galaxy S", "brand: Samsung", "release date: 4 June 2010");

	}

	public static void showInfo(String name, String brand, String releaseDate, String size, String display,
			String system, String memory, String battery) {
		System.out.println("Phone data: " + name + SPACE + brand + SPACE + releaseDate + SPACE
				+ size + SPACE + display + SPACE + system + SPACE + memory + SPACE + battery);
	}
	
	public static void showInfo(String name, String brand, String releaseDate) {
		System.out.println("Phone data: " + name + SPACE + brand + SPACE + releaseDate);
	}

	public static void showInfoVar(String... parameters) {
		System.out.print("Phone data: ");
		for (int i = 0; i < parameters.length; i++) {
			System.out.print(parameters[i] + SPACE);
		}
	}

}
