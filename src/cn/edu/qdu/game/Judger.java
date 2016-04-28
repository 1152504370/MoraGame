package cn.edu.qdu.game;

import java.util.Scanner;

public class Judger {
	private int total=0;
	Computer computer = new Computer();
	Person person = new Person();
	Scanner input = new Scanner(System.in);

	public void startGame() {
		System.out.println("*************");
		System.out.println("**猜拳，开始**");
		System.out.println("*************");
		System.out.println("出拳规则：1，剪刀2，石头3，布");

	}

	public void askName() {
		System.out.println("请选择对方角色（1：刘备2：孙权3：曹操4：赵云）");
		computer.inputName();
		System.out.println("请输入你的姓名");
		person.inputName();
		System.out.println(person.getPlayerName() + "    VS    " + computer.getPlayerName() + "   对战");
	}

	public void playGame() {
		System.err.println("要开始吗？（y/n）");
		String yn = new String();
		yn = input.next();
		while (yn.equalsIgnoreCase("y")) {
			System.out.println("请出拳：1，剪刀2，石头3，布（输入相应数字）");
			int a = person.myFist();
			switch (a) {
			case 1:
				System.out.println("你出拳：剪刀");
				break;
			case 2:
				System.out.println("你出拳：石头");

				break;
			case 3:
				System.out.println("你出拳：布");

				break;

			default:
				System.out.println("输入错误");
				break;
			}
			int b = computer.myFist();
			switch (b) {
			case 1:
				System.out.println(computer.getPlayerName()+"出拳：剪刀");
				break;
			case 2:
				System.out.println(computer.getPlayerName()+"出拳：石头");

				break;
			case 3:
				System.out.println(computer.getPlayerName()+"出拳：布");

				break;

			default:
				System.out.println("输入错误");
				break;
			}
			switch (Math.abs(a - b)) {
			case 0:
				System.out.println("结果说：你们平局。");
				break;
			case 1:
				if (a > b) {
					System.out.println("结果说：^_^，你赢了，真棒！");
					person.setWinningTimes(person.getWinningTimes() + 1);
				} else {
					System.out.println("结果说：^_^，你输了，真笨！");
					computer.setWinningTimes(computer.getWinningTimes() + 1);

				}

				break;
			case 2:
				if (a > b) {
					System.out.println("结果说：^_^，你输了，真笨！");
					computer.setWinningTimes(computer.getWinningTimes() + 1);
				} else {
					System.out.println("结果说：^_^，你赢了，真棒！");
					person.setWinningTimes(person.getWinningTimes() + 1);
				}

				break;

			default:
				break;
			}
			System.out.println("是否开始下一轮(y/n)");
			yn = input.next();
			total++;
		}
	}

	public void finalResult() {
		System.out.println(computer.getPlayerName() + "  VS  " + person.getPlayerName());
		System.out.println("对战次数" + total);
		System.out.println("姓名\t得分");
		System.out.println(person.getPlayerName() + "    " + person.getWinningTimes());
		System.out.println(computer.getPlayerName() + "    " + computer.getWinningTimes());
		if (person.getWinningTimes() < computer.getWinningTimes())
			System.out.println("结果：呵呵，笨笨，下次加油啊！");
		else if (person.getWinningTimes() > computer.getWinningTimes())
			System.out.println("结果：呵呵，你真棒！");
		else
			System.out.println("结果：你和" + computer.getPlayerName() + "不相伯仲！");
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