package middle.lesson2;

public class ChildTwo extends Parent{
	private String name;

	public ChildTwo(String parentName, String name) {
		super(parentName);
		this.name = name;
	}

	public void showParentName() {
		super.showName();
	}
	
	public void showName() {
		System.out.println("Dziecko nazywa siê " + name);
	}
}
