package ui.render;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

import constant.LoadResource;
import javafx.scene.image.Image;
import model.base.AllCharacter;

public class AllSpriteUpdate {
	
	private static Image temp;
	//TODO
	public static void update() {
		for(model.base.Character a: AllCharacter.getPlayer()) {
			if(a.getPastDoing() == a.getDoing()) {
				a.setSprite(a.getSprite()+1);
				if(a.getDoing() == 2 || a.getDoing() == 3) {
					if(a.getSprite() == a.nameToSprite().length) {
						if(a.getDoing() == 2) {
							a.attack(AllCharacter.getFirstEnemy());
							a.setSprite(0);
						} else {
							//TODO attack base
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
}
