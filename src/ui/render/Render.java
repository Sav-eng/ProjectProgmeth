package ui.render;

import constant.Numbers;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import main.Game;
import main.Main;
import model.base.AllCharacter;
import model.base.Character;
import model.data.Player;
import ui.hud.RateButton;
import ui.scene.GamePlayScene;

public class Render {

	private static Canvas allChar = GamePlayScene.getBg();
//	private static Canvas allChar;
//	private static GraphicsContext gc;
	private static GraphicsContext gc = GamePlayScene.getGc();
//	private static GraphicsContext gc = Main.getScene().getRoot().getGc();

	public static void render() {
		GamePlayScene.drawBg();
		GamePlayScene.drawBase(Player.getLevel());
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
		gc.fillText("$ " +Player.getMoney()+"", 20, 50, 100);
		if(RateButton.getLevel() != 10) {
			gc.fillText("RateLv: "+ RateButton.getLevel(), 20, 75);
		} else {
			gc.fillText("RateLv: MAX", 20, 75);
		}
		gc.fillText(Game.getHpPlayerBase()+" /"+Numbers.HP_PLAYER_BASE, 20, 130);
		gc.fillText(Game.getHpEnemyBase() + " /"+Numbers.HP_ENEMY_BASE, 1170, 130);
	}

	

	public static Canvas getAllChar() {
		return allChar;
	}

	public static void clearCanvas() {
		gc.clearRect(0, 0, Numbers.WIN_WIDTH, Numbers.WIN_HEIGHT);
	}
}
