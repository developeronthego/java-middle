package middle.lesson10;

public class PlayerMain {

	public static void main(String[] args) {
		GoalKeeper goalKeeper = new GoalKeeper();
		System.out.println(goalKeeper.handle());
		Skillable striker = new Striker();
		System.out.println(striker.attack());
	}

}
