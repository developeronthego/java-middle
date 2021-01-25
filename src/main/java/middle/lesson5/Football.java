package middle.lesson5;

public class Football extends Ball{
	private final String brand;

	public Football(String name) {
		super(name);
		this.brand = "unknown";
	}
	
	public Football(String name, String brand) {
		super(name);
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public final void showBrand() {
		System.out.println(brand);
	}
	
	public void showName() {
		System.out.println(super.getName());
	}
}
