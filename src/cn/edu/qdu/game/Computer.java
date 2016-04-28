package cn.edu.qdu.game;

import java.util.Scanner;

public class Computer extends Player {
	Scanner input = new Scanner(System.in);

	public void inputName() {
		int num = input.nextInt();
		switch (num) {
		case 1:
			setPlayerName("¡ı±∏");
			break;
		case 2:
			setPlayerName("ÀÔ»®");

			break;
		case 3:
			setPlayerName("≤‹≤Ÿ");
		case 4:
			setPlayerName("’‘‘∆");
			break;

		default:
			System.out.println(" ‰»Î”–ŒÛ");

			break;
		}

	}

	public int myFist() {
		int number = (int) (Math.random() * 3 + 1);
		return number;
	}
}
