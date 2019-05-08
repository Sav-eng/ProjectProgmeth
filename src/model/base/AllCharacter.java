package model.base;

import java.util.ArrayList;
import java.util.List;

import constant.Numbers;

public class AllCharacter {
	private static List<Character> allCharacters = new ArrayList<Character>();
	private static List<Character> enemy = new ArrayList<Character>();
	private static List<Character> player = new ArrayList<Character>();
	
	public static void updateCharacter() {
		//System.out.println("update");
		for(Character x: enemy) {
			x.update();
		}
		for(Character x: player) {
			x.update();
		}
	}
	
	public static Character getFirstPlayer() {
		return player.size()>0?player.get(0):null;
	}
	
	public static Character getFirstEnemy() {
		return enemy.size()>0?enemy.get(0):null;
	}

	public static List<Character> getEnemy() {
		return enemy;
	}

	public static List<Character> getPlayer() {
		return player;
	}
	
}
