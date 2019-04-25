package ui;

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
	
	public ControlPane(int level) {
		// TODO Auto-generated constructor stub
		super();
		this.setSpacing(10);
		this.setPrefHeight(0.2*Numbers.WIN_HEIGHT);
		this.setPadding(new Insets(5,0,0,0));
		
		switch(level) {
		case 1 : InitializeButtonLevel1(); break;
		case 2 : InitializeButtonLevel2(); break;
		}
	}
	
	public void InitializeButtonLevel1() {
		//TODO set entityButton
		Char1 = new EntityButton(character, price , cooldowmTime);
		rateUp = new RateButton(character, price, 1);
		levelUp = new UpgradeButton(character, price, cooldowmTime, 1);
	}
	
	public void InitializeButtonLevel2() {
		Char1 = new EntityButton(character, price, cooldownTime);
		rateUp = new RateButton(character, price, RateButton.getLevel());
			 
	}
}
