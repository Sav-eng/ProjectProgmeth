package ui.scene;

import constant.LoadResource;
import constant.Numbers;
import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import ui.hud.ControlPane;
import ui.hud.PauseButton;

public class GamePlayScene extends StackPane {

	Canvas bg;
	GraphicsContext gc;
	int level;
	ControlPane bottom;
	BorderPane stopButt;
	
	public GamePlayScene(int level) {
		super();
		this.setPrefHeight(Numbers.WIN_HEIGHT);
		this.setPrefWidth(Numbers.WIN_WIDTH);
		this.level = level;
		bottom = new ControlPane(this.level);
		
		bg = new Canvas();
		bg.setWidth(Numbers.WIN_WIDTH);
		bg.setHeight(Numbers.WIN_HEIGHT);
		
		gc = bg.getGraphicsContext2D();
		this.drawBg();
		this.drawBase(level);
		
		bottom = new ControlPane(level);
//		bottom.setAlignment(Pos.BOTTOM_CENTER);
		
		this.getChildren().add(bottom);
		this.getChildren().add(bg);
		
		stopButt = new BorderPane();
		PauseButton pauseButton = new PauseButton();
		stopButt.setTop(pauseButton);
		stopButt.setAlignment(pauseButton, Pos.TOP_RIGHT);
		
		this.getChildren().add(stopButt);
//		this.getChildren().add(bottom);
	}
	
	
	public void drawBg() {
			gc.drawImage(LoadResource.world2Bg, 100, -120);
			gc.drawImage(LoadResource.pauseButton, 1452, 0);
	}
	
	public void drawBase(int level) {
		if(level == 1) {
			gc.drawImage(LoadResource.world1Base, 70, 190);
			gc.drawImage(LoadResource.enerymyBase, 1290, 185);
		} else if(level ==2) {
			gc.drawImage(LoadResource.world2Base, 70, 190);
			gc.drawImage(LoadResource.enerymyBase, 1290, 180);
		}
	}
		
}
