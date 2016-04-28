package cn.edu.qdu.game;

import java.util.Scanner;

public class Judger {
	private int total = 0;
	// 关联关系
	Computer computer = new Computer();
	Person person = new Person();
	Scanner input = new Scanner(System.in);

	public void startGame() {
		// 宣布开始
		System.out.println("*************");
		System.out.println("**华山论剑开始**");
		System.out.println("*************");
		// 介绍规则
		System.out.println("出招秘籍：1，六脉神剑2，七伤拳3，降龙十八掌");

	}

	public void askName() {
		// 选择电脑名
		System.out.println("请选择要挑战的武林高手（1：刘备2：孙权3：曹操4：赵云）");
		computer.inputName();
		// 选择玩家名
		System.out.println("敢问少侠尊姓大名");
		person.inputName();
		System.out.println(person.getPlayerName() + "与" + computer.getPlayerName() + "一言不合便要拔刀相向！");
	}

	public void playGame() {
		System.err.println("是否开始生死大战？（y/n）");
		String yn = new String();
		yn = input.next();
		while (yn.equalsIgnoreCase("y")) {
			String[] fist = { "六脉神剑", "七伤拳", "降龙十八掌" };
			System.out.println("请出招：1，六脉神剑2，七伤拳3，降龙十八掌（输入相应数字）");
			int a = person.myFist();
			System.out.println("你大喝一声使出了失传已久的：" + fist[a - 1]);
			int b = computer.myFist();
			System.out.println(computer.getPlayerName() + "用尽全身力气打出一招：" + fist[b - 1]);
			switch (Math.abs(a - b)) {
			case 0:
				System.out.println("一招过后，双方平分秋色！");
				break;
			case 1:
				if (a > b) {
					System.out.println("一招过后，少侠略占上风！");
					person.setWinningTimes(person.getWinningTimes() + 1);
				} else {
					System.out.println("少侠一时大意竟略逊一筹！");
					computer.setWinningTimes(computer.getWinningTimes() + 1);

				}

				break;
			case 2:
				if (a > b) {
					System.out.println("少侠一时大意竟略逊一筹！");
					computer.setWinningTimes(computer.getWinningTimes() + 1);
				} else {
					System.out.println("一招过后，少侠略占上风！");
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
			System.out.println("少侠使尽浑身解数，奈何" + computer.getPlayerName() + "武功高强，少侠苦苦支撑" + total + "回合后依旧败下阵来!");
		else if (person.getWinningTimes() > computer.getWinningTimes())
			System.out.println("少侠好武功！在经历了"+total+"的惊天大战过后竟然击败了" + computer.getPlayerName() + "，一举夺得本届华山论剑魁首!");
		else
			System.out.println("在经历了" + total + "回合的盘缠大战之后" + "少侠和" + computer.getPlayerName() + "竟然不分胜负！");
	}
}