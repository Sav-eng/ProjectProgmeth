package ui.hud;

import java.awt.Button;
import java.util.ArrayList;

import javax.xml.bind.helpers.PrintConversionEventImpl;

import constant.LoadResource;
import constant.Numbers;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberExpression;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import main.Game;
import main.Main;
import model.base.AllCharacter;
import model.base.Character;
import model.data.Player;
import model.data.Time;
import model.mon.HeroMonster;
import model.mon.MeleeMonster;
import model.mon.RangeMonster;
import ui.scene.GamePlayScene;

public class ControlPane extends HBox {

	private EntityButton Char1;
	private EntityButton Char2;
	private EntityButton Char3;
	private EntityButton Char4;
	private EntityButton Char5;
	private RateButton rateUp;
	private UpgradeButton levelUp;
	private AttackBuffButton attackUp;
	private DefenceBuffButton defenceUp;
	private ArrayList<Label> cooldownLeft = new ArrayList<Label>();
	private Label ratePrice;
	private ArrayList<GameButton> updateLabelList = new ArrayList<GameButton>();

	public ControlPane(int level) {
		// TODO Auto-generated constructor stub
		super();
		this.setSpacing(10);
		this.setPrefHeight(0.2 * Numbers.WIN_HEIGHT);
//		this.setPrefHeight(Numbers.WIN_HEIGHT);
		this.setPrefWidth(Numbers.WIN_WIDTH);
		this.setMaxHeight(0.2 * Numbers.WIN_HEIGHT);
		this.setPadding(new Insets(5, 200, 5, 0));
		this.setAlignment(Pos.CENTER);
		this.setStyle("-fx-background-color: #c19a6b;");

		switch (level) {
		case 1:
			InitializeButtonLevel1();
			break;
		case 2:
			InitializeButtonLevel2();
			break;
		}

		updateLabelList.add(Char1);
		updateLabelList.add(Char2);
		updateLabelList.add(Char3);
		updateLabelList.add(Char4);
		updateLabelList.add(Char5);
		updateLabelList.add(attackUp);
		updateLabelList.add(defenceUp);

//		this.getChildren().addAll(rateUp, Char1, Char2, Char3, Char4, Char5, attackUp, defenceUp, levelUp);
		this.getChildren().addAll(ratePair(rateUp.getPrice(), rateUp), pair(Char1.getPrice(), Char1),
				pair(Char2.getPrice(), Char2), pair(Char3.getPrice(), Char3));
		this.getChildren().addAll(pair(Char4.getPrice(), Char4), pair(Char5.getPrice(), Char5),
				pair(attackUp.getPrice(), attackUp));
		this.getChildren().addAll(pair(defenceUp.getPrice(), defenceUp), pair(levelUp.getPrice(), levelUp));
	}

	public void InitializeButtonLevel1() {
		// TODO set entityButton
		Char1 = new EntityButton(LoadResource.knight1Icon, 100, 60);
		Char1.setStyle(
				"-fx-background-color: radial-gradient(radius 180%, #cd7f32, derive(#cd7f32, -30%), derive(#cd7f32, 30%));");
		Char2 = new EntityButton(LoadResource.archerIcon, 250, 400);
		Char2.setStyle(
				"-fx-background-color: radial-gradient(radius 180%, #cd7f32, derive(#cd7f32, -30%), derive(#cd7f32, 30%));");
		Char3 = new EntityButton(LoadResource.thiefIcon, 150, 300);
		Char3.setStyle(
				"-fx-background-color: radial-gradient(radius 180%, #C0C0C0, derive(#C0C0C0, -30%), derive(#C0C0C0, 30%));");
		Char4 = new EntityButton(LoadResource.fairyIcon, 350, 800);
		Char4.setStyle(
				"-fx-background-color: radial-gradient(radius 180%, #C0C0C0, derive(#C0C0C0, -30%), derive(#C0C0C0, 30%));");
		Char5 = new EntityButton(LoadResource.wizardFireIcon, 700, 1200);
		Char5.setStyle(
				"-fx-background-color: radial-gradient(radius 180%, #FFDF00, derive(#FFDF00, -30%), derive(#FFDF00, 30%));");
		rateUp = new RateButton(LoadResource.rateUpCd, RateButton.getCost(), RateButton.getLevel());
		levelUp = new UpgradeButton(LoadResource.levelUpCd, Numbers.LEVELUP_PRICE, 1);
		attackUp = new AttackBuffButton(LoadResource.atkUpCd, 200, 600, Numbers.WORLDBUFFAMOUNT);
		defenceUp = new DefenceBuffButton(LoadResource.defUpCd, 200, 600, Numbers.WORLDBUFFAMOUNT);

		Char1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (AllCharacter.getPlayer().size() <= 10)
					if (Time.getTime() - Char1.getPressTime() >= Char1.getCooldownTime()) {
						if (Player.isConsume(Char1.getPrice())) {
							Player.consumeMoney(Char1.getPrice());
							Char1.setPressTime(Time.getTime());
							AllCharacter.getPlayer().add(new MeleeMonster("Knight1", 989, 611, 300, true, 80, 0));
						}
					}
			}
		});

		Char2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (AllCharacter.getPlayer().size() <= 10)
					if (Time.getTime() - Char2.getPressTime() >= Char2.getCooldownTime())
						if (Player.isConsume(Char2.getPrice())) {
							Player.consumeMoney(Char2.getPrice());
							Char2.setPressTime(Time.getTime());
							AllCharacter.getPlayer().add(new RangeMonster("Archer", 999, 421, 20, true, 40, 0));
						}
			}
		});

		Char3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (AllCharacter.getPlayer().size() <= 10)
					if (Time.getTime() - Char3.getPressTime() >= Char3.getCooldownTime())
						if (Player.isConsume(Char3.getPrice())) {
							Player.consumeMoney(Char3.getPrice());
							Char3.setPressTime(Time.getTime());
							AllCharacter.getPlayer().add(new MeleeMonster("Thief", 564, 356, 100, true, 30, 0));
						}
			}
		});

		Char4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (AllCharacter.getPlayer().size() <= 10)
					if (Time.getTime() - Char4.getPressTime() >= Char4.getCooldownTime())
						if (Player.isConsume(Char4.getPrice())) {
							Player.consumeMoney(Char4.getPrice());
							Char4.setPressTime(Time.getTime());
							AllCharacter.getPlayer().add(new RangeMonster("Fairy", 821, 777, 100, true, 100, 0));
						}
			}
		});

		Char5.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (AllCharacter.getPlayer().size() <= 10)
					if (Time.getTime() - Char5.getPressTime() >= Char5.getCooldownTime())
						if (Player.isConsume(Char5.getPrice())) {
							Player.consumeMoney(Char5.getPrice());
							Char5.setPressTime(Time.getTime());
							AllCharacter.getPlayer().add(new HeroMonster("WizardFire", 2000, 888, 400, true, 110, 0));
						}
			}
		});

		rateUp.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (RateButton.getLevel() != 10)
					if (Player.isConsume(RateButton.getCost())) {
						Player.consumeMoney(RateButton.getCost());
						RateButton.levelUp();
						ratePrice.setText(RateButton.getCost() + "");
					}
			}
		});

		levelUp.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (Player.isConsume(Numbers.LEVELUP_PRICE)) {
					Player.consumeMoney(Numbers.LEVELUP_PRICE);
					Main.getScene().setRoot(Main.getGame2());
					Main.getGame2().setTop(GamePlayScene.getBg());
					Main.getGame2().setBottom(Main.getGame2().getBottomPane());
					Player.setLevel(Player.getLevel() + 1);
					Game.setPhase(2);
				}
			}
		});

		attackUp.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (Player.isConsume(Numbers.BOOST_PRICE)) {
					Player.consumeMoney(Numbers.BOOST_PRICE);
					attackUp.setPressTime(Time.getTime());
					for (Character a : AllCharacter.getPlayer()) {
						if (a instanceof RangeMonster) {
							((RangeMonster) a).attackBoost();
						}
					}
					Time.buffATK = 100;
				}
			}
		});

		defenceUp.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (Player.isConsume(Numbers.BOOST_PRICE)) {
					Player.consumeMoney(Numbers.BOOST_PRICE);
					defenceUp.setPressTime(Time.getTime());
					for (Character a : AllCharacter.getPlayer()) {
						if (a instanceof MeleeMonster) {
							((MeleeMonster) a).defenceBoost();
						}
					}
					Time.buffDEF = 100;
				}
			}
		});
	}

	public void InitializeButtonLevel2() {
		Char1 = new EntityButton(LoadResource.knight2Icon, 350, 60);
		Char1.setStyle(
				"-fx-background-color: radial-gradient(radius 180%, #cd7f32, derive(#cd7f32, -30%), derive(#cd7f32, 30%));");
		Char2 = new EntityButton(LoadResource.wizardFireIcon, 700, 500);
		Char2.setStyle(
				"-fx-background-color: radial-gradient(radius 180%, #cd7f32, derive(#cd7f32, -30%), derive(#cd7f32, 30%));");
		Char3 = new EntityButton(LoadResource.knight3Icon, 400, 550);
		Char3.setStyle(
				"-fx-background-color: radial-gradient(radius 180%, #C0C0C0, derive(#C0C0C0, -30%), derive(#C0C0C0, 30%));");
		Char4 = new EntityButton(LoadResource.wizardLaserIcon, 900, 800);
		Char4.setStyle(
				"-fx-background-color: radial-gradient(radius 180%, #C0C0C0, derive(#C0C0C0, -30%), derive(#C0C0C0, 30%));");
		Char5 = new EntityButton(LoadResource.angleIcon, 1500, 1500);
		Char5.setStyle(
				"-fx-background-color: radial-gradient(radius 180%, #FFDF00, derive(#FFDF00, -30%), derive(#FFDF00, 30%));");
		rateUp = new RateButton(LoadResource.rateUpCd, RateButton.getCost(), RateButton.getLevel());
		attackUp = new AttackBuffButton(LoadResource.atkUpCd, 500, 600, Numbers.WORLDBUFFAMOUNT * 2);
		defenceUp = new DefenceBuffButton(LoadResource.defUpCd, 500, 600, Numbers.WORLDBUFFAMOUNT * 2);
		levelUp = new UpgradeButton(LoadResource.levelUpCd, 9999, 2);

		Char1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (AllCharacter.getPlayer().size() <= 10)
					if (Time.getTime() - Char1.getPressTime() >= Char1.getCooldownTime()) {
						if (Player.isConsume(Char1.getPrice())) {
							Player.consumeMoney(Char1.getPrice());
							Char1.setPressTime(Time.getTime());
							AllCharacter.getPlayer().add(new MeleeMonster("Knight2", 2000, 1111, 700, true, 100, 0));
						}
					}
			}
		});

		Char2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (AllCharacter.getPlayer().size() <= 10)
					if (Time.getTime() - Char2.getPressTime() >= Char2.getCooldownTime())
						if (Player.isConsume(Char2.getPrice())) {
							Player.consumeMoney(Char2.getPrice());
							Char2.setPressTime(Time.getTime());
							AllCharacter.getPlayer().add(new RangeMonster("WizardFire", 2000, 888, 400, true, 110, 0));
						}
			}
		});

		Char3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (AllCharacter.getPlayer().size() <= 10)
					if (Time.getTime() - Char3.getPressTime() >= Char3.getCooldownTime())
						if (Player.isConsume(Char3.getPrice())) {
							Player.consumeMoney(Char3.getPrice());
							Char3.setPressTime(Time.getTime());
							AllCharacter.getPlayer().add(new MeleeMonster("Knight3", 3000, 1223, 400, true, 90, 0));
						}
			}
		});

		Char4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (AllCharacter.getPlayer().size() <= 10)
					if (Time.getTime() - Char4.getPressTime() >= Char4.getCooldownTime())
						if (Player.isConsume(Char4.getPrice())) {
							Player.consumeMoney(Char4.getPrice());
							Char4.setPressTime(Time.getTime());
							AllCharacter.getPlayer()
									.add(new RangeMonster("WizardLaser", 2000, 1999, 100, true, 150, 0));
						}
			}
		});

		Char5.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (AllCharacter.getPlayer().size() <= 10)
					if (Time.getTime() - Char5.getPressTime() >= Char5.getCooldownTime())
						if (Player.isConsume(Char5.getPrice())) {
							Player.consumeMoney(Char5.getPrice());
							Char5.setPressTime(Time.getTime());
							AllCharacter.getPlayer().add(new HeroMonster("Angle", 5000, 2777, 1200, true, 150, 0));
						}
			}
		});

		rateUp.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (RateButton.getLevel() != 10)
					if (Player.isConsume(RateButton.getCost())) {
						Player.consumeMoney(RateButton.getCost());
						RateButton.levelUp();
						ratePrice.setText(RateButton.getCost() + "");
					}
			}
		});

		attackUp.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (Player.isConsume(Numbers.BOOST_PRICE * 2)) {
					Player.consumeMoney(Numbers.BOOST_PRICE * 2);
					attackUp.setPressTime(Time.getTime());
					for (Character a : AllCharacter.getPlayer()) {
						if (a instanceof RangeMonster) {
							((RangeMonster) a).attackBoost();
						}
					}
				}
			}
		});

		defenceUp.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (Player.isConsume(Numbers.BOOST_PRICE * 2)) {
					Player.consumeMoney(Numbers.BOOST_PRICE * 2);
					defenceUp.setPressTime(Time.getTime());
					for (Character a : AllCharacter.getPlayer()) {
						if (a instanceof MeleeMonster) {
							((MeleeMonster) a).defenceBoost();
						}
					}
				}
			}
		});
	}

	public void rateBright() {
		rateUp.setGraphic(new ImageView(LoadResource.rateUp));
	}

	public void rateDull() {
		rateUp.setGraphic(new ImageView(LoadResource.rateUpCd));
	}

	public ArrayList<Label> getCooldownLeft() {
		return cooldownLeft;
	}

	public void levelBright() {
		if (Player.getLevel() == 1) {
			levelUp.setGraphic(new ImageView(LoadResource.levelUp));
		}
	}

	public void levelDull() {
		levelUp.setGraphic(new ImageView(LoadResource.levelUpCd));
	}

	public VBox pair(int price, GameButton button) {
		VBox out = new VBox();
		String temp = price + "";
		Label priceTag = new Label(temp);
		if (button instanceof UpgradeButton) {
			if (price == 9999) {
				priceTag.setText("Max");
			}
		}
		priceTag.setAlignment(Pos.CENTER);
		out.getChildren().add(button);
		out.getChildren().add(priceTag);
		out.setAlignment(Pos.CENTER);
		if (button instanceof EntityButton) {
			EntityButton aButton = (EntityButton) button;
			int cooldown = Math.max(aButton.getCooldownTime() - (Time.getTime() - button.getPressTime()), 0);
			Label left;
			if (cooldown == 0) {
				left = new Label("Ready");
			} else {
				left = new Label(cooldown + "");
			}
			cooldownLeft.add(left);
//			out.getChildren().add(cooldownLeft.get(cooldownLeft.size()-1));
			out.getChildren().add(left);
		} else if (button instanceof SpecialSkillButton) {
			SpecialSkillButton sButton = (SpecialSkillButton) button;
			int cooldown = Math.max(sButton.getCooldownTime() - (Time.getTime() - button.getPressTime()), 0);
			Label left;
			if (cooldown == 0) {
				left = new Label("Ready");
			} else {
				left = new Label(cooldown + "");
			}
			cooldownLeft.add(left);
			out.getChildren().add(left);
//			out.getChildren().add(cooldownLeft.get(cooldownLeft.size()-1));
		}
		return out;
	}

	public VBox ratePair(int price, GameButton button) {
		VBox out = new VBox();
		String temp = price + "";
		ratePrice = new Label(temp);
		ratePrice.setAlignment(Pos.CENTER);
		out.getChildren().add(button);
		out.getChildren().add(ratePrice);
		out.setAlignment(Pos.CENTER);
		return out;
	}

	public ArrayList<GameButton> getUpdateLabelList() {
		return updateLabelList;
	}

	public AttackBuffButton getAttackUp() {
		return attackUp;
	}

	public DefenceBuffButton getDefenceUp() {
		return defenceUp;
	}

	public void attackBright() {
		attackUp.setGraphic(new ImageView(LoadResource.atkUp));
	}

	public void attackDull() {
		attackUp.setGraphic(new ImageView(LoadResource.atkUpCd));
	}

	public void defenceBright() {
		defenceUp.setGraphic(new ImageView(LoadResource.defUp));
	}

	public void defenceDull() {
		defenceUp.setGraphic(new ImageView(LoadResource.defUpCd));
	}

	public Label getRatePrice() {
		return ratePrice;
	}

}
