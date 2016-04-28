package cn.edu.qdu.game;

import java.util.Scanner;

public class Judger {
	private int total=0;
	Computer computer = new Computer();
	Person person = new Person();
	Scanner input = new Scanner(System.in);

	public void startGame() {
		System.out.println("*************");
		System.out.println("**��ȭ����ʼ**");
		System.out.println("*************");
		System.out.println("��ȭ����1������2��ʯͷ3����");

	}

	public void askName() {
		System.out.println("��ѡ��Է���ɫ��1������2����Ȩ3���ܲ�4�����ƣ�");
		computer.inputName();
		System.out.println("�������������");
		person.inputName();
		System.out.println(person.getPlayerName() + "    VS    " + computer.getPlayerName() + "   ��ս");
	}

	public void playGame() {
		System.err.println("Ҫ��ʼ�𣿣�y/n��");
		String yn = new String();
		yn = input.next();
		while (yn.equalsIgnoreCase("y")) {
			System.out.println("���ȭ��1������2��ʯͷ3������������Ӧ���֣�");
			int a = person.myFist();
			switch (a) {
			case 1:
				System.out.println("���ȭ������");
				break;
			case 2:
				System.out.println("���ȭ��ʯͷ");

				break;
			case 3:
				System.out.println("���ȭ����");

				break;

			default:
				System.out.println("�������");
				break;
			}
			int b = computer.myFist();
			switch (b) {
			case 1:
				System.out.println(computer.getPlayerName()+"��ȭ������");
				break;
			case 2:
				System.out.println(computer.getPlayerName()+"��ȭ��ʯͷ");

				break;
			case 3:
				System.out.println(computer.getPlayerName()+"��ȭ����");

				break;

			default:
				System.out.println("�������");
				break;
			}
			switch (Math.abs(a - b)) {
			case 0:
				System.out.println("���˵������ƽ�֡�");
				break;
			case 1:
				if (a > b) {
					System.out.println("���˵��^_^����Ӯ�ˣ������");
					person.setWinningTimes(person.getWinningTimes() + 1);
				} else {
					System.out.println("���˵��^_^�������ˣ��汿��");
					computer.setWinningTimes(computer.getWinningTimes() + 1);

				}

				break;
			case 2:
				if (a > b) {
					System.out.println("���˵��^_^�������ˣ��汿��");
					computer.setWinningTimes(computer.getWinningTimes() + 1);
				} else {
					System.out.println("���˵��^_^����Ӯ�ˣ������");
					person.setWinningTimes(person.getWinningTimes() + 1);
				}

				break;

			default:
				break;
			}
			System.out.println("�Ƿ�ʼ��һ��(y/n)");
			yn = input.next();
			total++;
		}
	}

	public void finalResult() {
		System.out.println(computer.getPlayerName() + "  VS  " + person.getPlayerName());
		System.out.println("��ս����" + total);
		System.out.println("����\t�÷�");
		System.out.println(person.getPlayerName() + "    " + person.getWinningTimes());
		System.out.println(computer.getPlayerName() + "    " + computer.getWinningTimes());
		if (person.getWinningTimes() < computer.getWinningTimes())
			System.out.println("������Ǻǣ��������´μ��Ͱ���");
		else if (person.getWinningTimes() > computer.getWinningTimes())
			System.out.println("������Ǻǣ��������");
		else
			System.out.println("��������" + computer.getPlayerName() + "���ಮ�٣�");
	}
//	 public static void main(String[] args) {
//	 Judger j = new Judger();
//	// Computer computer =new Computer();
//	// Person person = new Person();
//	 j.startGame();
//	 j.askName();
//	 j.playGame();
//	 j.finalResult();
//	 }
}