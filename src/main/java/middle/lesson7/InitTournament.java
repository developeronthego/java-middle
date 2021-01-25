package middle.lesson7;

public class InitTournament {
	private final String [] championsLeagueClubs= {"Manchester United", "Juventus FC", "Real Madrid", "Liverpool FC"};
	private static String [] topGoalScorers = new String [3];
	
	static {
		topGoalScorers[0] = "Lewandowski";
		topGoalScorers[1] = "Messi";
		topGoalScorers[2] = "Ronaldo";
	}
	
	public void populate(Tournament tournament) {
		tournament.setClubs(championsLeagueClubs);
		tournament.setTopGoalScorers(topGoalScorers);
	}
}
