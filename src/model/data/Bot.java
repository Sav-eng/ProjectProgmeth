package model.data;

import main.Game;
import model.base.AllCharacter;
import model.base.Character;

public class Bot {
	private static boolean check = false;
	public static void summon() {
		int timeNow = Time.getTime()-60;
		int phase = Game.getPhase();
		if(phase==2 || timeNow >= 3600) {
			if(timeNow%150==0) {
				//summonTroll1
				AllCharacter.getEnemy().add(new Character("Troll1",3500,1577,700,range,false,80,200));
			} else if(timeNow%370==0) {
				//summon Golem
				AllCharacter.getEnemy().add(new Character("Golem",6000,3641,0,range,false,500,100));
			} else if(timeNow%60==0) {
				//summon Goblin
				AllCharacter.getEnemy().add(new Character("Goblin",1000,555,100,range,false,60,30));
			} else if(timeNow%100==0) {
				//summon Orc
				AllCharacter.getEnemy().add(new Character("Orc",1500,966,300,range,false,100,100));
			} else if(timeNow%900==0) {
				//summon Ork
				AllCharacter.getEnemy().add(new Character("Ork",2000,3277,350,range,false,200,250));
			}
		} else if(phase==1){
			if(timeNow%150 == 0) {
				//summon goblin
				AllCharacter.getEnemy().add(new Character("Goblin",1000,555,100,range,false,60,30));
			} else if (timeNow%250 == 0) {
				//summon Orc
				AllCharacter.getEnemy().add(new Character("Orc",1500,966,300,range,false,100,100));
			}
		} else {
			if(!check) {
				AllCharacter.getEnemy().add(new Character("Ork",2000,3277,350,range,false,200,250));
				AllCharacter.getEnemy().add(new Character("Troll2",7000,1500,800,range,false,30,1000));
				check=true;
			}
		}
	}
}
