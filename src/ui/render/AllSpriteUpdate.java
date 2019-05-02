package ui.render;

import constant.LoadResource;
import javafx.scene.image.Image;
import model.base.AllCharacter;
import model.base.Character;

public class AllSpriteUpdate {
	
	private static Image temp;
	//TODO
	public static void update() {
		for(Character e: AllCharacter.getPlayer()) {
			updateEachSprite(e);
		}
		for (Character e: AllCharacter.getEnemy()) {
			updateEachSprite(e);
		}
	}
	private static void updateEachSprite(Character a) {
		if(a.getPastDoing() == a.getDoing()) {
			a.setSprite(a.getSprite()+1);
			if(a.getDoing() == 2 || a.getDoing() == 3) {
				if(a.getSprite() == a.nameToSprite().length) {
					if(a.getDoing() == 2) {
						a.attack(AllCharacter.getFirstEnemy());
						a.setSprite(0);
					} else {
						a.attackBase();
						a.setSprite(0);
					}
				}
			} else if(a.getDoing() == 1) {
				if(a.getSprite() == a.nameToSprite().length) {
					a.setSprite(0);
				}
			} else if(a.getDoing() == 4) {
				if(a.getSprite() == a.nameToSprite().length) {
					a.die();
				}
			}
		} else {
			a.setSprite(0);
		}
	}
}
