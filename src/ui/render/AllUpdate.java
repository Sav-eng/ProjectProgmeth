package ui.render;

import constant.LoadResource;
import constant.Numbers;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import main.Main;
import model.base.AllCharacter;
import model.base.Character;
import model.data.Player;
import model.data.Time;
import sun.net.www.content.text.plain;
import ui.hud.ControlPane;
import ui.hud.EntityButton;
import ui.hud.GameButton;
import ui.hud.RateButton;
import ui.hud.SpecialSkillButton;
import ui.scene.GamePlayScene;

public class AllUpdate {

	// TODO
	public static void update() {
		for (Character e : AllCharacter.getPlayer()) {
			updateEachSprite(e);
		}
		for (Character e : AllCharacter.getEnemy()) {
			updateEachSprite(e);
		}
		updateLabel();
		updateHigtlight();
		updatePriceTag();
	}

	private static void updateEachSprite(Character a) {
		if (Time.getTime() % 2 == 0)
			if (a.getPastDoing() == a.getDoing()) {
				//System.out.println("past = present");
				if (!a.isCooldown()) {
					a.setSprite(a.getSprite() + 1);
				}
				if (a.getDoing() == 2 || a.getDoing() == 3) {
					if (a.getSprite() >= a.nameToSprite().length-1) {
						if (a.getDoing() == 2) {
							if (a.isPlayer()) {
								a.attack(AllCharacter.getFirstEnemy());
							} else {
								a.attack(AllCharacter.getFirstPlayer());
							}
							System.out.println(a.getCooldown());
							a.setSprite(0);
						} else {
							a.attackBase();
							a.setSprite(0);
						}
						a.setSprite(0);
					}
				} else if (a.getDoing() == 1) {
					if (a.getSprite() >= a.nameToSprite().length) {
						a.setSprite(0);
					}
				} else if (a.getDoing() == 4) {
					if (a.getSprite() >= a.nameToSprite().length) {
						a.die();
//						a.setSprite(0);
					}
				}
			} else {
				a.setSprite(0);
			}
	}

	private static void updateLabel() {
		GamePlayScene scene = (GamePlayScene) Main.getScene().getRoot();
		ControlPane pane = scene.getBottomPane();
		for (int i = 0; i < 7; i++) {
			GameButton e = pane.getUpdateLabelList().get(i);
			if (e instanceof EntityButton) {
				EntityButton aButton = (EntityButton) e;
				int cooldown = Math.max(aButton.getCooldownTime() - (Time.getTime() - aButton.getPressTime()), 0);
				if (cooldown == 0) {
					pane.getCooldownLeft().get(i).setText("Ready");
				} else {
					pane.getCooldownLeft().get(i).setText(cooldown + "");
				}
			} else if (e instanceof SpecialSkillButton) {
				SpecialSkillButton sButton = (SpecialSkillButton) e;
				int cooldown = Math.max(sButton.getCooldownTime() - (Time.getTime() - sButton.getPressTime()), 0);
				if (cooldown == 0) {
					pane.getCooldownLeft().get(i).setText("Ready");
				} else {
					pane.getCooldownLeft().get(i).setText(cooldown + "");
				}

			}
		}
	}

	private static void updateHigtlight() {
		GamePlayScene scene = (GamePlayScene) Main.getScene().getRoot();
		ControlPane pane = scene.getBottomPane();
		if (Player.getMoney() >= RateButton.getCost() || RateButton.getLevel() == 10) {
			pane.rateBright();
		} else {
			pane.rateDull();
		}

		if (Player.getLevel() == 2) {
			pane.levelBright();
		} else if (Player.getMoney() >= Numbers.LEVELUP_PRICE) {
			pane.levelBright();
		} else {
			pane.levelDull();
		}

		if (Time.getTime() - pane.getAttackUp().getPressTime() >= pane.getAttackUp().getCooldownTime()
				&& Player.getMoney() >= pane.getAttackUp().getPrice()) {
			pane.attackBright();
		} else {
			pane.attackDull();
		}

		if (Time.getTime() - pane.getDefenceUp().getPressTime() >= pane.getDefenceUp().getCooldownTime()
				&& Player.getMoney() >= pane.getDefenceUp().getPrice()) {
			pane.defenceBright();
		} else {
			pane.defenceDull();
		}

	}

	public static void updatePriceTag() {
		GamePlayScene scene = (GamePlayScene) Main.getScene().getRoot();
		ControlPane pane = scene.getBottomPane();
		if (RateButton.getLevel() != 10) {
			pane.getRatePrice().setText(RateButton.getCost() + "");
		} else {
			pane.getRatePrice().setText("Lv.Max");
		}
	}
}
