package ui.hud;

import constant.LoadResource;
import constant.Numbers;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

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
		this.setPadding(new Insets(5,0,0,0));
		
		switch(level) {
		case 1 : InitializeButtonLevel1(); break;
		case 2 : InitializeButtonLevel2(); break;
		}
		
		
	}
	
	public void InitializeButtonLevel1() {
		//TODO set entityButton
		Char1 = new EntityButton(LoadResource.knight1Icon, 100 , 1);
		Char2 = new EntityButton(LoadResource.thiefIcon, 100, 1);
		Char3 = new EntityButton(LoadResource.archerIcon, 100, 1);
		Char4 = new EntityButton(LoadResource.fairyIcon, 100, 1);
		Char5 = new EntityButton(LoadResource.wizardFireIcon, 100, 1);
		rateUp = new RateButton(LoadResource.rateUpCd, 300, RateButton.getLevel());
		levelUp = new UpgradeButton(LoadResource.levelUpCd, 500, 1);
		attackUp = new AttackBuffButton(LoadResource.atkUpCd, 200, 15, Numbers.world1BuffAmount);
		defenceUp = new DefenceBuffButton(LoadResource.defUpCd, 200, 15, Numbers.world1BuffAmount);
	}
	
	public void InitializeButtonLevel2() {
		Char1 = new EntityButton(LoadResource.knight2Icon, 100 , 1);
		Char2 = new EntityButton(LoadResource.knight3Icon, 100, 1);
		Char3 = new EntityButton(LoadResource.wizardFireIcon, 100, 1);
		Char4 = new EntityButton(LoadResource.wizardLaserIcon, 100, 1);
		Char5 = new EntityButton(LoadResource.angleIcon, 100, 1);
		rateUp = new RateButton(LoadResource.rateUpCd, 300, RateButton.getLevel());
		attackUp = new AttackBuffButton(LoadResource.atkUpCd, 200, 20, Numbers.world2BuffAmount);
		defenceUp = new DefenceBuffButton(LoadResource.defUpCd, 200, 20, Numbers.world2BuffAmount);
	}
}
