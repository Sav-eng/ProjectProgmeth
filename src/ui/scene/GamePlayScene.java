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
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import model.data.Player;
import ui.hud.ControlPane;
import ui.hud.PauseButton;

public class GamePlayScene extends BorderPane {

	private static Canvas bg;
	private static GraphicsContext gc;
	private int level;
	private ControlPane bottom;
	private BorderPane stopButt;
	
	public GamePlayScene(int level) {
		super();
		this.setPrefHeight(Numbers.WIN_HEIGHT);
		this.setPrefWidth(Numbers.WIN_WIDTH);
		this.setMinSize(Numbers.WIN_WIDTH, Numbers.WIN_HEIGHT);
		this.setMaxSize(Numbers.WIN_WIDTH, Numbers.WIN_HEIGHT);
		this.level = level;
//		bottom = new ControlPane(this.level);		
		bg = new Canvas();
		bg.setWidth(Numbers.WIN_WIDTH);
//		bg.setHeight(Numbers.WIN_HEIGHT);
		bg.setHeight(0.8 * Numbers.WIN_HEIGHT);
		
		gc = bg.getGraphicsContext2D();
		GamePlayScene.drawBg();
		GamePlayScene.drawBase(level);
		
		bottom = new ControlPane(level);
		
		this.setTop(bg);
		this.setBottom(bottom);
		this.setAlignment(bottom, Pos.BOTTOM_CENTER);
//		bottom.setAlignment(Pos.BOTTOM_CENTER);

//		this.getChildren().add(bottom);
//		bottom.setAlignment(Pos.TOP_CENTER);
		
//		this.getChildren().add(bg);
//		this.getChildren().add(bottom);
//		stopButt = new BorderPane();
//		PauseButton pauseButton = new PauseButton();
//		stopButt.setTop(pauseButton);
//		stopButt.setAlignment(pauseButton, Pos.TOP_RIGHT);
//		
//		this.getChildren().add(stopButt);
//		this.getChildren().add(bottom);
	}
	
	
	public static void drawBg() {
//			gc.drawImage(LoadResource.world2Bg, 100, -120);
//			gc.drawImage(LoadResource.pauseButton, 1452, 0);
//			gc.setFill(Color.BLACK);
//			gc.setStroke(Color.GOLDENROD);
//			gc.setLineWidth(1.0);
//			gc.setFont(new Font("AR ADGothicJP", 30));
//			gc.strokeText(Player.getMoney()+"", 150, 50, 100);
			gc.drawImage(LoadResource.world2Bg, 0, -120);
	}
	
	public static void drawBase(int level) {
		if(level == 1) {
//			gc.drawImage(LoadResource.world1Base, 70, 190);
//			gc.drawImage(LoadResource.enerymyBase, 1290, 185);
			gc.drawImage(LoadResource.world1Base, -30, 190);
			gc.drawImage(LoadResource.enerymyBase, 1190, 185);
			
		} else if(level ==2) {
			gc.drawImage(LoadResource.world2Base, 70, 190);
			gc.drawImage(LoadResource.enerymyBase, 1290, 180);
		}
	}


	public static Canvas getBg() {
		return bg;
	}


	public static GraphicsContext getGc() {
		return gc;
	}


	public int getLevel() {
		return level;
	}


	public ControlPane getBottomPane() {
		return bottom;
	}
	
	
	
}
