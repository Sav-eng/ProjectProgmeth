package ui.hud;

import constant.LoadResource;
import constant.Numbers;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberExpression;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class ControlPane extends HBox{
	
	EntityButton Char1;
	EntityButton Char2;
	EntityButton Char3;
	EntityButton Char4;
	EntityButton Char5;
	RateButton rateUp;
	UpgradeButton levelUp;
	AttackBuffButton attackUp;
	DefenceBuffButton defenceUp;

	
	public ControlPane(int level) {
		// TODO Auto-generated constructor stub
		super();
		this.setSpacing(10);
		this.setPrefHeight(0.2*Numbers.WIN_HEIGHT);
		this.setPrefWidth(Numbers.WIN_WIDTH);
		this.setPadding(new Insets(5,0,5,0));
		this.setAlignment(Pos.BOTTOM_CENTER);
		this.setStyle("-fx-background-color: #c19a6b;");

		

		
		switch(level) {
		case 1 : InitializeButtonLevel1(); break;
		case 2 : InitializeButtonLevel2(); break;
		}
		
		this.getChildren().addAll(rateUp,Char1,Char2,Char3,Char4,Char5,attackUp,defenceUp,levelUp);
	}
	
	public void InitializeButtonLevel1() {
		//TODO set entityButton
		Char1 = new EntityButton(LoadResource.thiefIcon, 100 , 1);
		Char1.setStyle("-fx-background-color: radial-gradient(radius 180%, #cd7f32, derive(#cd7f32, -30%), derive(#cd7f32, 30%));");
		Char2 = new EntityButton(LoadResource.archerIcon, 100, 1);
		Char2.setStyle("-fx-background-color: radial-gradient(radius 180%, #cd7f32, derive(#cd7f32, -30%), derive(#cd7f32, 30%));");
		Char3 = new EntityButton(LoadResource.knight1Icon, 100, 1);
		Char3.setStyle("-fx-background-color: radial-gradient(radius 180%, #C0C0C0, derive(#C0C0C0, -30%), derive(#C0C0C0, 30%));");
		Char4 = new EntityButton(LoadResource.fairyIcon, 100, 1);
		Char4.setStyle("-fx-background-color: radial-gradient(radius 180%, #C0C0C0, derive(#C0C0C0, -30%), derive(#C0C0C0, 30%));");
		Char5 = new EntityButton(LoadResource.wizardFireIcon, 100, 1);
		Char5.setStyle("-fx-background-color: radial-gradient(radius 180%, #FFDF00, derive(#FFDF00, -30%), derive(#FFDF00, 30%));");
		rateUp = new RateButton(LoadResource.rateUpCd, 300, RateButton.getLevel());
		levelUp = new UpgradeButton(LoadResource.levelUpCd, 500, 1);
		attackUp = new AttackBuffButton(LoadResource.atkUpCd, 200, 15, Numbers.WORLDBUFFAMOUNT);
		defenceUp = new DefenceBuffButton(LoadResource.defUpCd, 200, 15, Numbers.WORLDBUFFAMOUNT);
	}
	
	public void InitializeButtonLevel2() {
		Char1 = new EntityButton(LoadResource.knight2Icon, 100 , 1);
		Char2 = new EntityButton(LoadResource.knight3Icon, 100, 1);
		Char3 = new EntityButton(LoadResource.wizardFireIcon, 100, 1);
		Char4 = new EntityButton(LoadResource.wizardLaserIcon, 100, 1);
		Char5 = new EntityButton(LoadResource.angleIcon, 100, 1);
		rateUp = new RateButton(LoadResource.rateUpCd, 300, RateButton.getLevel());
		attackUp = new AttackBuffButton(LoadResource.atkUpCd, 200, 20, Numbers.WORLDBUFFAMOUNT*2);
		defenceUp = new DefenceBuffButton(LoadResource.defUpCd, 200, 20, Numbers.WORLDBUFFAMOUNT*2);
		levelUp = new UpgradeButton(LoadResource.levelUpCd, 500, 1);
	}
}
