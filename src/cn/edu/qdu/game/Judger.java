package cn.edu.qdu.game;

import java.util.Scanner;

public class Judger {
	private int total = 0;
	// ������ϵ
	Computer computer = new Computer();
	Person person = new Person();
	Scanner input = new Scanner(System.in);

	public void startGame() {
		// ������ʼ
		System.out.println("*************");
		System.out.println("**��ɽ�۽���ʼ**");
		System.out.println("*************");
		// ���ܹ���
		System.out.println("�����ؼ���1��������2������ȭ3������ʮ����");

	}

	public void askName() {
		// ѡ�������
		System.out.println("��ѡ��Ҫ��ս�����ָ��֣�1������2����Ȩ3���ܲ�4�����ƣ�");
		computer.inputName();
		// ѡ�������
		System.out.println("�����������մ���");
		person.inputName();
		System.out.println(person.getPlayerName() + "��" + computer.getPlayerName() + "һ�Բ��ϱ�Ҫ�ε�����");
	}

	public void playGame() {
		System.err.println("�Ƿ�ʼ������ս����y/n��");
		String yn = new String();
		yn = input.next();
		while (yn.equalsIgnoreCase("y")) {
			String[] fist = { "������", "����ȭ", "����ʮ����" };
			System.out.println("����У�1��������2������ȭ3������ʮ���ƣ�������Ӧ���֣�");
			int a = person.myFist();
			System.out.println("����һ��ʹ����ʧ���Ѿõģ�" + fist[a - 1]);
			int b = computer.myFist();
			System.out.println(computer.getPlayerName() + "�þ�ȫ���������һ�У�" + fist[b - 1]);
			switch (Math.abs(a - b)) {
			case 0:
				System.out.println("һ�й���˫��ƽ����ɫ��");
				break;
			case 1:
				if (a > b) {
					System.out.println("һ�й���������ռ�Ϸ磡");
					person.setWinningTimes(person.getWinningTimes() + 1);
				} else {
					System.out.println("����һʱ���⾹��ѷһ�");
					computer.setWinningTimes(computer.getWinningTimes() + 1);

				}

				break;
			case 2:
				if (a > b) {
					System.out.println("����һʱ���⾹��ѷһ�");
					computer.setWinningTimes(computer.getWinningTimes() + 1);
				} else {
					System.out.println("һ�й���������ռ�Ϸ磡");
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
			System.out.println("����ʹ������������κ�" + computer.getPlayerName() + "�书��ǿ���������֧��" + total + "�غϺ����ɰ�������!");
		else if (person.getWinningTimes() > computer.getWinningTimes())
			System.out.println("�������书���ھ�����"+total+"�ľ����ս����Ȼ������" + computer.getPlayerName() + "��һ�ٶ�ñ��컪ɽ�۽�����!");
		else
			System.out.println("�ھ�����" + total + "�غϵ��̲���ս֮��" + "������" + computer.getPlayerName() + "��Ȼ����ʤ����");
	}
}