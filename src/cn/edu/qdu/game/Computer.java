package cn.edu.qdu.game;

import java.util.Scanner;

public class Computer extends Player {
	Scanner input = new Scanner(System.in);

	public void inputName() {
		String[] name = { "���������", "���۶���Ȩ", "�����ܲ�", "ǹ������" };
		int num = input.nextInt();
		setPlayerName(name[num - 1]);
	}

	public int myFist() {
		int number = (int) (Math.random() * 3 + 1);
		return number;
	}
}
