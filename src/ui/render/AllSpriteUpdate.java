package ui.render;

import constant.LoadResource;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import main.Main;
import model.base.AllCharacter;
import model.base.Character;
import model.data.Time;
import ui.hud.ControlPane;
import ui.hud.EntityButton;
import ui.hud.GameButton;
import ui.hud.SpecialSkillButton;
import ui.scene.GamePlayScene;

public class AllSpriteUpdate {


	// TODO
	public static void update() {
		for (Character e : AllCharacter.getPlayer()) {
			updateEachSprite(e);
		}
		for (Character e : AllCharacter.getEnemy()) {
			updateEachSprite(e);
		}
		updateLabel();
	}

	private static void updateEachSprite(Character a) {
		if (a.getPastDoing() == a.getDoing()) {
			if (a.getCooldown() != 0) {
				a.setSprite(a.getSprite() + 1);
			}
			if (a.getDoing() == 2 || a.getDoing() == 3) {
				if (a.getSprite() == a.nameToSprite().length) {
					if (a.getDoing() == 2) {
						a.attack(AllCharacter.getFirstEnemy());
						a.setSprite(0);
					} else {
						a.attackBase();
						a.setSprite(0);
					}
				}
			} else if (a.getDoing() == 1) {
				if (a.getSprite() == a.nameToSprite().length) {
					a.setSprite(0);
				}
			} else if (a.getDoing() == 4) {
				if (a.getSprite() == a.nameToSprite().length) {
					a.die();
				}
			}
		} else {
			a.setSprite(0);
		}
	}
	
	private static void updateLabel() {
		GamePlayScene scene = (GamePlayScene) Main.getScene().getRoot();
		ControlPane pane = scene.getBottomPane();
		for(GameButton e : pane.getUpdateLabelList() ) {
			if (e instanceof EntityButton) {
				EntityButton aButton = (EntityButton) e;
				int cooldown = Math.max(aButton.getCooldownTime() - (Time.getTime() - aButton.getPressTime()), 0);
				if (cooldown == 0) {
					pane.getCooldownLeft().setText("Ready");
				} else {
					pane.getCooldownLeft().setText(cooldown+"");
				}
			} else if (e instanceof SpecialSkillButton) {
				SpecialSkillButton sButton = (SpecialSkillButton) e;
				int cooldown = Math.max(sButton.getCooldownTime() - (Time.getTime() - sButton.getPressTime()), 0);
				if (cooldown == 0) {					
					pane.getCooldownLeft().setText("Ready");
				} else {
					pane.getCooldownLeft().setText(cooldown+"");
				}

			}
		}
	}
}
