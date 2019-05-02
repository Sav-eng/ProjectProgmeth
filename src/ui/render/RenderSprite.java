package ui.render;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import model.base.AllCharacter;
import model.base.Character;

public class RenderSprite {
	
	private static Canvas allChar = new Canvas();
	private static GraphicsContext gc = allChar.getGraphicsContext2D();
	
	public static void render() {
		for(Character a : AllCharacter.getPlayer()) {
			gc.drawImage(a.nameToSprite()[a.getSprite()], a.getX(), 200);
		}
	}

	public static Canvas getAllChar() {
		return allChar;
	}
	
	
}
