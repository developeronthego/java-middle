package middle.lesson27;

public class AnonymousClass {

	public static void main(String[] args) {
		Phone phone = new Phone() {
			
			@Override
			void makeCall() {
				System.out.println("Make a call");
			}
		};
		
		phone.makeCall();
	}

}
