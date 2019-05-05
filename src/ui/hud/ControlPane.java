package ui.hud;

import java.awt.Button;

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
import main.Main;
import model.base.AllCharacter;
import model.base.Character;
import model.data.Player;
import model.mon.HeroMonster;
import model.mon.MeleeMonster;
import model.mon.RangeMonster;

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
		

//		this.getChildren().addAll(rateUp, Char1, Char2, Char3, Char4, Char5, attackUp, defenceUp, levelUp);
		this.getChildren().addAll(pair(rateUp.getPrice(), rateUp),pair(Char1.getPrice(), Char1),pair(Char2.getPrice(), Char2),pair(Char3.getPrice(), Char3));
		this.getChildren().addAll(pair(Char4.getPrice(), Char4),pair(Char5.getPrice(), Char5),pair(attackUp.getPrice(), attackUp));
		this.getChildren().addAll(pair(defenceUp.getPrice(), defenceUp),pair(levelUp.getPrice(), levelUp));
	}

	public void InitializeButtonLevel1() {
		// TODO set entityButton
		Char1 = new EntityButton(LoadResource.knight1Icon, 100, 1);
		Char1.setStyle(
				"-fx-background-color: radial-gradient(radius 180%, #cd7f32, derive(#cd7f32, -30%), derive(#cd7f32, 30%));");
		Char2 = new EntityButton(LoadResource.archerIcon, 100, 1);
		Char2.setStyle(
				"-fx-background-color: radial-gradient(radius 180%, #cd7f32, derive(#cd7f32, -30%), derive(#cd7f32, 30%));");
		Char3 = new EntityButton(LoadResource.thiefIcon, 100, 1);
		Char3.setStyle(
				"-fx-background-color: radial-gradient(radius 180%, #C0C0C0, derive(#C0C0C0, -30%), derive(#C0C0C0, 30%));");
		Char4 = new EntityButton(LoadResource.fairyIcon, 100, 1);
		Char4.setStyle(
				"-fx-background-color: radial-gradient(radius 180%, #C0C0C0, derive(#C0C0C0, -30%), derive(#C0C0C0, 30%));");
		Char5 = new EntityButton(LoadResource.wizardFireIcon, 100, 1);
		Char5.setStyle(
				"-fx-background-color: radial-gradient(radius 180%, #FFDF00, derive(#FFDF00, -30%), derive(#FFDF00, 30%));");
		rateUp = new RateButton(LoadResource.rateUpCd, 300, RateButton.getLevel());
		levelUp = new UpgradeButton(LoadResource.levelUpCd, 500, 1);
		attackUp = new AttackBuffButton(LoadResource.atkUpCd, 200, 15, Numbers.WORLDBUFFAMOUNT);
		defenceUp = new DefenceBuffButton(LoadResource.defUpCd, 200, 15, Numbers.WORLDBUFFAMOUNT);

		Char1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (Player.isConsume(100)) {
					Player.consumeMoney(100);
					AllCharacter.getPlayer().add(new MeleeMonster("Knight1", 989, 611, 300, true, 80, 0));
				}
			}
		});

		Char2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (Player.isConsume(250)) {
					Player.consumeMoney(250);
					AllCharacter.getPlayer().add(new RangeMonster("Archer", 999, 421, 20, true, 40, 0));
				}
			}
		});

		Char3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (Player.isConsume(150)) {
					Player.consumeMoney(150);
					AllCharacter.getPlayer().add(new MeleeMonster("Thief", 564, 356, 100, true, 30, 0));
				}
			}
		});

		Char4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (Player.isConsume(350)) {
					Player.consumeMoney(350);
					AllCharacter.getPlayer().add(new RangeMonster("Fairy", 821, 777, 100, true, 100, 0));
				}
			}
		});

		Char5.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (Player.isConsume(700)) {
					Player.consumeMoney(700);

					AllCharacter.getPlayer().add(new HeroMonster("WizardFire", 2000, 888, 400, true, 110, 0));
				}
			}
		});

		rateUp.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (Player.isConsume(RateButton.getCost())) {
					Player.consumeMoney(RateButton.getCost());
					RateButton.levelUp();
				}
			}
		});

		levelUp.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (Player.isConsume(Numbers.LEVELUP_PRICE)) {
					Player.consumeMoney(Numbers.LEVELUP_PRICE);
					Main.getScene().setRoot(Main.getGame2());
				}
			}
		});

		attackUp.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (Player.isConsume(Numbers.BOOST_PRICE)) {
					Player.consumeMoney(Numbers.BOOST_PRICE);
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
				if (Player.isConsume(Numbers.BOOST_PRICE)) {
					Player.consumeMoney(Numbers.BOOST_PRICE);
					for (Character a : AllCharacter.getPlayer()) {
						if (a instanceof MeleeMonster) {
							((MeleeMonster) a).defenceBoost();
						}
					}
				}
			}
		});
	}

	public void InitializeButtonLevel2() {
		Char1 = new EntityButton(LoadResource.knight2Icon, 100, 1);
		Char2 = new EntityButton(LoadResource.knight3Icon, 100, 1);
		Char3 = new EntityButton(LoadResource.wizardFireIcon, 100, 1);
		Char4 = new EntityButton(LoadResource.wizardLaserIcon, 100, 1);
		Char5 = new EntityButton(LoadResource.angleIcon, 100, 1);
		rateUp = new RateButton(LoadResource.rateUpCd, 300, RateButton.getLevel());
		attackUp = new AttackBuffButton(LoadResource.atkUpCd, 200, 20, Numbers.WORLDBUFFAMOUNT * 2);
		defenceUp = new DefenceBuffButton(LoadResource.defUpCd, 200, 20, Numbers.WORLDBUFFAMOUNT * 2);
		levelUp = new UpgradeButton(LoadResource.levelUpCd, 500, 1);
	}
	
	public void rateBright() {
		rateUp.setGraphic(new ImageView(LoadResource.rateUp));
	}
	public void rateDull() {
		rateUp.setGraphic(new ImageView(LoadResource.rateUpCd));
	}
	
	public void levelBright() {
		levelUp.setGraphic(new ImageView(LoadResource.levelUp));
	}
	
	public void levelDull() {
		levelUp.setGraphic(new ImageView(LoadResource.levelUpCd));
	}
	
	public VBox pair(int price,GameButton button) {
		VBox out = new VBox();
		String temp = price + "";
		Label priceTag = new Label(temp);
		priceTag.setAlignment(Pos.CENTER);
		out.getChildren().add(button);
		out.getChildren().add(priceTag);
		out.setAlignment(Pos.CENTER);
		return out;
	}
}
