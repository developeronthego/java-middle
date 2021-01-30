package middle.lesson11;

public class Defender implements Skillable {

	@Override
	public int pass() {
		return 9;
	}

	@Override
	public int attack() {
		return 5;
	}

	@Override
	public int defend() {
		return 18;
	}
}
