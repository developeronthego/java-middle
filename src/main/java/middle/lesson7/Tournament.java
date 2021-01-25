package middle.lesson7;

import java.util.Arrays;

public class Tournament {
	private String [] clubs;
	private String [] topGoalScorers;
	
	public Tournament() {}
	
	public Tournament(String[] clubs, String[] topGoalScorers) {
		this.clubs = clubs;
		this.topGoalScorers = topGoalScorers;
	}
	
	public String[] getClubs() {
		return clubs;
	}
	public void setClubs(String[] clubs) {
		this.clubs = clubs;
	}
	public String[] getTopGoalScorers() {
		return topGoalScorers;
	}
	public void setTopGoalScorers(String[] topGoalScorers) {
		this.topGoalScorers = topGoalScorers;
	}

	@Override
	public String toString() {
		return "Tournament [clubs=" + Arrays.toString(clubs) + ", topGoalScorers=" + Arrays.toString(topGoalScorers)
				+ "]";
	}
}
