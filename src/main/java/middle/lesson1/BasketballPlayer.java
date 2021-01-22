package middle.lesson1;

public class BasketballPlayer extends Player{

	@Override
	public void play() {
		System.out.println("Playing basketball..");
	}

	@Override
	public void score() {
		System.out.println("Scoring points..");
	}
	
	public void layUp() {
		System.out.println("Scoring points from lay-up..");		
	}
}
