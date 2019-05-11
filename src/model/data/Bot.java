package model.data;

import main.Game;
import model.base.AllCharacter;
import model.mon.MeleeMonster;

public class Bot {
	private static boolean check = false;

	public static void summon() {
		int timeNow = Math.max(1, Time.getTime() - 60);
		int phase = Game.getPhase();
		if (AllCharacter.getEnemy().size() <= 10) {
			if ((phase == 2 || timeNow >= 7200 ) && Game.getHpEnemyBase() >= 2500) {
				if (timeNow % 250 == 0) {
					// summonTroll1
					AllCharacter.getEnemy().add(new MeleeMonster("Troll1", 3500, 1577, 700, false, 80, 200));
				} else if (timeNow % 500 == 0) {
					// summon Golem
					AllCharacter.getEnemy().add(new MeleeMonster("Golem", 6000, 3641, 0, false, 500, 100));
				} 
			} else if (phase == 1) {
				if (timeNow % 250 == 0) {
					// summon goblin
					AllCharacter.getEnemy().add(new MeleeMonster("Goblin", 1000, 555, 100, false, 60, 30));
				} else if (timeNow % 400 == 0) {
					// summon Orc
					AllCharacter.getEnemy().add(new MeleeMonster("Orc", 1500, 966, 300, false, 100, 100));
				}
			} else {
				if (!check) {
					AllCharacter.getEnemy().add(new MeleeMonster("Ork", 2000, 3277, 350, false, 200, 250));
					AllCharacter.getEnemy().add(new MeleeMonster("Troll2", 10000, 1500, 800, false, 20, 1000));
					check = true;
				}
				if(timeNow % 400 == 0)AllCharacter.getEnemy().add(new MeleeMonster("Ork", 2000, 3277, 350, false, 200, 250));
				if(timeNow % 1000 == 0)AllCharacter.getEnemy().add(new MeleeMonster("Troll2", 10000, 1500, 800, false, 20, 1000));
			}
		}
		 if ((Game.getPhase()==2 || Time.getTime() >= 7200)&& timeNow % 1000 == 0) {
				// summon Ork
				//System.out.println("COMN");
				AllCharacter.getEnemy().add(new MeleeMonster("Ork", 5000, 3277, 400, false, 200, 250));
			}
		// if(Time.getTime()==10)AllCharacter.getEnemy().add(new
		// MeleeMonster("Golem",6000,3641,0,false,500,100));
	}
}
