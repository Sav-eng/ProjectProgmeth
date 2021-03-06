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
	private static GraphicsContext gc = GamePlayScene.getGc();

	public static void render() {
		GamePlayScene.drawBg();
		GamePlayScene.drawBase(Player.getLevel());
		try {
			for (Character a : AllCharacter.getPlayer()) {
				if(a.getName() == "WizardFire" || a.getName() == "WizardLaser" || a.getName() == "Fairy") gc.drawImage(a.nameToSprite()[a.getSprite()], a.getX()-30, 320);
				else gc.drawImage(a.nameToSprite()[a.getSprite()], a.getX(), 320);
			}
			for (Character a : AllCharacter.getEnemy()) {
				if(a.getName() != "Ork" && a.getName() != "Troll2")gc.drawImage(a.nameToSprite()[a.getSprite()], a.getX(), 320);
				else gc.drawImage(a.nameToSprite()[a.getSprite()], a.getX(), 280);
			}	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("over sprite");
		}
		
		gc.setFill(Color.BLACK);
		gc.setStroke(Color.GOLDENROD);
		gc.setLineWidth(1.0);
		gc.setFont(new Font("AR ADGothicJP", 30));
		gc.fillText("$ " +Player.getMoney()+"", 20, 50, 100);
		if(RateButton.getLevel() != 6) {
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
