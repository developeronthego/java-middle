package middle.lesson3;

public class ChildOne extends Parent {
	private String name;

	public ChildOne(String parentName, String name) {
		super(parentName);
		this.name = name;
	}

	@Override
	public void showName() {
		System.out.println("Dziecko nazywa siê " + name);
	}

//	@Override
//	public void showAge(Long age) { <- niew³aœciwa sygnatura
//		System.out.println("Dziecko ma lat " + age); 
//	}
}
