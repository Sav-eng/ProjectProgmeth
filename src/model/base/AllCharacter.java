package model.base;

import java.util.ArrayList;
import java.util.List;

import constant.Numbers;

public class AllCharacter {
	List<Character> allCharacters = new ArrayList<Character>();
	private static List<Character> enemy = new ArrayList<Character>();
	private static List<Character> player = new ArrayList<Character>();
	private static int hpEnemyBase = Numbers.HP_ENEMY_BASE;
	private static int hpPlayerBase = Numbers.HP_PLAYER_BASE;
	public void addCharacter(Character x) {
		allCharacters.add(x);
	}
	
	public void renderCharacter() {
		for(Character x: allCharacters) {
			x.render();
		}
	}
	
	public static Character getFirstPlayer() {
		return player.get(0);
	}
	
	public static Character getFirstEnemy() {
		return enemy.get(0);
	}
	public void update() {
		for (int i = allCharacters.size()-1; i>=0 ;i--) {
			if(allCharacters.get(i).isDestroyed()) {
				allCharacters.remove(i);
			}
		}
	}
}
