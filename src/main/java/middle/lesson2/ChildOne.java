package middle.lesson2;

public class ChildOne extends Parent{
	private String name;

	public ChildOne(String parentName, String name) {
		super(parentName);
		this.name = name;
	}
@Override
	public void showName() {
		System.out.println("Dziecko nazywa si� " + name);
	}
	
	
	public void showAge(String age) {
		System.out.println("Dziecko ma lat " + age);
	}
}
