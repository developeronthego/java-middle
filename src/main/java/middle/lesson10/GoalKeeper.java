package middle.lesson10;

public class GoalKeeper implements GoalKeeperBehaviour, Skillable {

	@Override
	public int pass() {
		return 8;
	}

	@Override
	public int attack() {
		return 4;
	}

	@Override
	public int defend() {
		return 6;
	}

	@Override
	public int handle() {
		return 18;
	}

}
