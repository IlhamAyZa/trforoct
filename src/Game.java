public class Game {

	private String name;
	private Player player1;
	private Player player2;
	private int score1;
	private int score2;
	
	public Game(String name) {
		this.name = name;
	}

	public Game(String name, Player player1, Player player2) {
		this.name = name;
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public void plusScoreToPlayer1() {
		score1++;
	}
	public void plusScoreToPlayer2() {
		score2++;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public int getScore1() {
		return score1;
	}

	public void setScore1(int score1) {
		this.score1 = score1;
	}

	public int getScore2() {
		return score2;
	}

	public void setScore2(int score2) {
		this.score2 = score2;
	}

	@Override
	public String toString() {
		return "Game name : " + name + "/n player #1 :" + player1 + "  |  player #2 : " + player2 + ",/n score of player #1 : " + score1
				+ "/n score of player #2 : " + score2 ;
	}
	
}