package middle.lesson1;

public class MainPlayer {

	public static void main(String[] args) {
		System.out.println("Football player.");
		FootballPlayer footballPlayer = new FootballPlayer();
		footballPlayer.run();
		footballPlayer.play();
		footballPlayer.score();
		System.out.println("Basketball player.");
		BasketballPlayer basketballPlayer = new BasketballPlayer();
		basketballPlayer.run();
		basketballPlayer.play();
		basketballPlayer.score();
		basketballPlayer.layUp();
	}

}
