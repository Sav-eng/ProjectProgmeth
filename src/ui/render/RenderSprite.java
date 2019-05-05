package ui.render;

import constant.Numbers;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import model.base.AllCharacter;
import model.base.Character;
import model.data.Player;

public class RenderSprite {

	private static Canvas allChar = new Canvas();
	private static GraphicsContext gc = allChar.getGraphicsContext2D();

	public static void render() {
		for (Character a : AllCharacter.getPlayer()) {
			gc.drawImage(a.nameToSprite()[a.getSprite()], a.getX(), 200);
		}
		for (Character a : AllCharacter.getEnemy()) {
			gc.drawImage(a.nameToSprite()[a.getSprite()], a.getX(), 200);
		}
		gc.setFill(Color.BLACK);
		gc.setStroke(Color.GOLDENROD);
		gc.setLineWidth(1.0);
		gc.setFont(new Font("AR ADGothicJP", 30));
		gc.strokeText(Player.getMoney()+"", 150, 50, 100);
	}

	

	public static Canvas getAllChar() {
		return allChar;
	}

	public static void clearCanvas() {
		gc.clearRect(0, 0, Numbers.WIN_WIDTH, Numbers.WIN_HEIGHT);
	}
}
