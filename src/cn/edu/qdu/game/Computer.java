package cn.edu.qdu.game;

import java.util.Scanner;

public class Computer extends Player {
	Scanner input = new Scanner(System.in);

	public void inputName() {
		int num = input.nextInt();
		switch (num) {
		case 1:
			setPlayerName("����");
			break;
		case 2:
			setPlayerName("��Ȩ");

			break;
		case 3:
			setPlayerName("�ܲ�");
			break;

		default:
			System.out.println("��������");

			break;
		}

	}

	public int myFist() {
		int number = (int) (Math.random() * 3 + 1);
		return number;
	}
}
