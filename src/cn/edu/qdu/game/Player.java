package cn.edu.qdu.game;

public abstract class Player {
	// 属性
	private String playerName;
	private int winningTimes;

	// 构造方法
	public Player() {
		setWinningTimes(0);
	}

	// 抽象的成员方法
	public abstract void inputName();

	public abstract int myFist();

	// getter和setter方法

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
