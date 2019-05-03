package model.data;

import main.Game;
import model.base.AllCharacter;
import model.base.Character;

public class Bot {
	public static void summon() {
		int timeNow = Time.getTime()-60;
		int phase = Game.getPhase();
		if(phase==2 || timeNow >= 3600) {
			if(timeNow%150==0) {
				//summonTroll1
				AllCharacter.getEnemy().add(new Character("Troll1",3500,1577,700,movespeed,range,0,80,200));
			} else if(timeNow%370==0) {
				//summon Golem
				AllCharacter.getEnemy().add(new Character("Golem",6000,3641,0,movespeed,range,0,500,100));
			} else if(timeNow%60==0) {
				//summon Goblin
				AllCharacter.getEnemy().add(new Character("Goblin",1000,555,100,movespeed,range,0,60,30));
			} else if(timeNow%100==0) {
				//summon Orc
				AllCharacter.getEnemy().add(new Character("Orc",1500,966,300,movespeed,range,0,100,100));
			} else if(timeNow%900==0) {
				//summon Ork
				AllCharacter.getEnemy().add(new Character("Ork",2000,3277,350,movespeed,range,0,200,250));
			}
		} else if(phase==1){
			if(timeNow%150 == 0) {
				//summon goblin
				AllCharacter.getEnemy().add(new Character("Goblin",1000,555,100,movespeed,range,0,60,30));
			} else if (timeNow%250 == 0) {
				//summon Orc
				AllCharacter.getEnemy().add(new Character("Orc",1500,966,300,movespeed,range,0,100,100));
			}
		} else {
			AllCharacter.getEnemy().add(new Character("Ork",2000,3277,350,movespeed,range,0,200,250));
			AllCharacter.getEnemy().add(new Character("Troll2",7000,1500,800,movespeed,range,0,30,1000));
		}
	}
}
