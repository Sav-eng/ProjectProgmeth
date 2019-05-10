package model.base;

import java.util.ArrayList;
import java.util.List;

import constant.Numbers;
import model.mon.HeroMonster;
import model.mon.MeleeMonster;
import model.mon.RangeMonster;

public class AllCharacter {
	private static List<Character> allCharacters = new ArrayList<Character>();
	private static List<Character> enemy = new ArrayList<Character>();
	private static List<Character> player = new ArrayList<Character>();
	
	public static void updateCharacter() {
		//System.out.println("update");
		for(Character x: player) {
			x.update();
		}
		for(Character x: enemy) {
			x.update();
		}
	}
	
	public static void checkDie() {
		if(player.size() > 0 && player.get(0).isDeath()) {
			player.remove(0);
		}
		
		if(enemy.size() > 0 && enemy.get(0).isDeath()) {
			enemy.remove(0);
		}
	}
	
	public static void debuffATK() {
		for(Character x: player) {
			if(x instanceof MeleeMonster) {
				((MeleeMonster) x).deBuffDef();
			} else if(x instanceof HeroMonster) {
				((HeroMonster) x).deBuffAtk();
			}
		}
	}
	
	public static void debuffDEF() {
		for(Character x: player) {
			if (x instanceof RangeMonster) {
				((RangeMonster) x).deBuffAtk();
			} else if(x instanceof HeroMonster) {
				((HeroMonster) x).deBuffAtk();
			}
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
