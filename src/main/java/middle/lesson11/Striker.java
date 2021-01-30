package middle.lesson11;

public class Striker implements Skillable {

	@Override
	public int pass() {
		return 15;
	}

	@Override
	public int attack() {
		return 17;
	}

	@Override
	public int defend() {
		return 9;
	}
}
