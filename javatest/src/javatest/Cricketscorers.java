package javatest;

public class Cricketscorers {
	
	private int score;
	
	public void four() {
		score = score+4;
	}
	
	public void six() {
		score = score+6;
	}
	
	public int getScore() {
		return score;
	}

	public static void main(String[] args) {
		Cricketscorers scorers = new Cricketscorers();
		Cricketscorers scorers1 = new Cricketscorers();
		scorers.six();
		scorers.four();
		scorers.six();
		
		System.out.println(scorers.getScore());
		System.out.println(scorers1.getScore());

	}

}
