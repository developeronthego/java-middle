package middle.lesson2;

public class Parent {
	private String name;
	
	public Parent(String name) {
		this.name = name;
	}

	public void showName() {
		System.out.println("Rodzic nazywa siê " + name);
	}
	
	public void showAge(Integer age) {
		System.out.println("Rodzic ma lat " + age);
	}
}
