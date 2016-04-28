package cn.edu.qdu.game;

public abstract class Player {
	private String playerName;
	private int winningTimes;
	public Player() {
		setWinningTimes(0);
	}
	public abstract void inputName();
	public abstract int myFist();
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getWinningTimes() {
		return winningTimes;
	}
	public void setWinningTimes(int winningTimes) {
		this.winningTimes = winningTimes;
	}

}
