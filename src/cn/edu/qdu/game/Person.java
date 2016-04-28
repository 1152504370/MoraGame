package cn.edu.qdu.game;

import java.util.Scanner;

public class Person extends Player {
	Scanner input = new Scanner(System.in);

	public void inputName() {
		String name = input.next();
		setPlayerName(name);

	}

	public int myFist() {
		int number = input.nextInt();
		return number;

	}

}
