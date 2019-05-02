package ui.render;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

import constant.LoadResource;
import javafx.scene.image.Image;
import model.base.AllCharacter;

public class AllSpriteUpdate {
	
	private static Image temp;
	
	public static void update() {
		for(model.base.Character a: AllCharacter.getPlayer()) {
			if(a.getPastDoing() == a.getDoing()) {
				a.setSprite(a.getSprite()+1);
				if(a.getDoing() == 2 || a.getDoing() == 3) {
					if(a.getSprite() == 2) {
						
					}
				}
			}
		}
	}
}
