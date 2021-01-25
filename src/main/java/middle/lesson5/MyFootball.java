package middle.lesson5;

public final class MyFootball extends Football {

	public MyFootball(String name, String brand) {
		super(name, brand);
	}
	
	@Override
	public void showName() {
		System.out.println(super.getName());
	}
	
	public void play(final String action) {
		final String ballString = "ball";
		System.out.println(action + " " + ballString);
	}

}
