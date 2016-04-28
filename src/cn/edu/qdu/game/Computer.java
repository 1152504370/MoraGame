package cn.edu.qdu.game;

import java.util.Scanner;

public class Computer extends Player {
	Scanner input = new Scanner(System.in);

	public void inputName() {
		int num = input.nextInt();
		switch (num) {
		case 1:
			setPlayerName("刘备");
			break;
		case 2:
			setPlayerName("孙权");

			break;
		case 3:
			setPlayerName("曹操");
			break;

		default:
			System.out.println("输入有误");

			break;
		}

	}

	public int myFist() {
		int number = (int) (Math.random() * 3 + 1);
		return number;
	}
}
