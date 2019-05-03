package model.data;

public class Player {
	private static int money=0;
	private static boolean buffAtk;
	private static boolean buffDef;
	
	public static int getMoney() {
		return money;
	}

	public static void setMoney(int money) {
		Player.money = money;
	}

	public static boolean isBuffAtk() {
		return buffAtk;
	}

	public static void setBuffAtk(boolean buffAtk) {
		Player.buffAtk = buffAtk;
	}

	public static boolean isBuffDef() {
		return buffDef;
	}

	public static void setBuffDef(boolean buffDef) {
		Player.buffDef = buffDef;
	}
	
	public static void consumeMoney(int money) {
		Player.money -= money;
	}
	
	public static boolean isConsume(int money) {
		return Player.money > money;
	}
}
