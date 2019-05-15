package model.data;

import ui.hud.RateButton;

public class Player {

	private static int money = 0;
	private static int level = 1;

	public static int getLevel() {
		return level;
	}

	public static void setLevel(int level) {
		Player.level = level;
	}

	public static int getMoney() {
		return money;
	}

	public static void setMoney(int money) {
		Player.money = money;
	}

	public static void consumeMoney(int money) {
		Player.money -= money;
	}

	public static boolean isConsume(int money) {
		return Player.money > money;
	}

	public static void updateMoney() {
		int level = RateButton.getLevel();
		int time = Time.getTime();
		switch (level) {
		case 1:
			if(time%3==0)Player.money++;
			break;
		case 2:
			if(time%2==0)Player.money++;
			break;
		case 3:
			Player.money++;
			break;
		case 4:
			Player.money+=3;
			break;
		case 5:
			Player.money+=4;
			break;
		case 6:
			Player.money+=5;
			break;
		default:
			break;
		}
	}
}
