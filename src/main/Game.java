package main;

import constant.Numbers;
import model.base.AllCharacter;

public class Game {
	// TODO
//	game loop
//	pause button
	private static int phase=1;
	private static int hpEnemyBase=Numbers.HP_ENEMY_BASE;
	private static int hpPlayerBase=Numbers.HP_PLAYER_BASE;

	public static int getPhase() {
		return phase;
	}
	public static void setPhase(int phase) {
		Game.phase = phase;
	}
	public static int getHpEnemyBase() {
		return hpEnemyBase;
	}
	public static void setHpEnemyBase(int hpEnemyBase) {
		Game.hpEnemyBase = hpEnemyBase;
	}
	public static int getHpPlayerBase() {
		return hpPlayerBase;
	}
	public static void setHpPlayerBase(int hpPlayerBase) {
		Game.hpPlayerBase = hpPlayerBase;
	}
	
}
