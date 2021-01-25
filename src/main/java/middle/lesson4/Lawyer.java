package middle.lesson4;

public class Lawyer extends Worker{
	private String name;
	
	public Lawyer(String name) {
		this.name = name;
	}

	@Override
	public void showName() {
		System.out.println("Lawyer name is " + name);
	}
	
	public void workOnCase() {
		System.out.print("Work on case number..");
	}
	
	public void workOnCase(int caseNumber) {
		System.out.println();
		workOnCase();
		System.out.println(" " + caseNumber);
	}
}
