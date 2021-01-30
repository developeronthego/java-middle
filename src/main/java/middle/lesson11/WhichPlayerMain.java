package middle.lesson11;

public class WhichPlayerMain {

	public static void main(String[] args) {
		Skillable midfield = new Midfield();
		Skillable striker = new Striker();
		Skillable defender = new Defender();
		Skillable[] players = new Skillable[3];
		players[0] = defender;
		players[1] = midfield;
		players[2] = striker;
		showAttackSkillForStriker(players);
	}

	private static void showAttackSkillForStriker(Skillable ... players) {
		for (int i = 0; i < players.length; i++) {
			if (players[i] instanceof Striker) {
				System.out.println(players[i].attack());			
			}
		}
	}
}
