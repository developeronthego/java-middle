package middle.lesson11;

public class Midfield implements Skillable {

	@Override
	public int pass() {
		return 16;
	}

	@Override
	public int attack() {
		return 14;
	}

	@Override
	public int defend() {
		return 12;
	}

}
