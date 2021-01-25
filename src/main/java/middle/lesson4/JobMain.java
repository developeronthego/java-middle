package middle.lesson4;

public class JobMain {

	public static void main(String[] args) {
		Lawyer lawyer = new Lawyer("Adam Kowalski");
		lawyer.showName();
		lawyer.workOnCase();
		lawyer.workOnCase(10);
	}
}
