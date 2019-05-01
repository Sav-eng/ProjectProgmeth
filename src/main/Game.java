package main;

import model.base.AllCharacter;

public class Game {
	// TODO
//	game loop
//	pause button
	private static int phase;
	private static int hpEnemyBase;
	private static int hpPlayerBase;
	public static void logicUpdate() {
		//update all logic
	}
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
