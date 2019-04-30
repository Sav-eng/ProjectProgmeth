package ui.mainmenu;

import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.util.converter.NumberStringConverter;
import sun.misc.GC;
import constant.Numbers;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

import constant.LoadResource;

public class MainMenuScene extends StackPane {
	
	private Canvas bg;
	private GraphicsContext gc;
	private VBox menuButton;
	private ButtonMainmenu playButtonMainmenu;
	private ButtonMainmenu exitButtonMainmenu;
	Image a;
	
	
	public MainMenuScene() {
		super();
		this.setPrefHeight(Numbers.WIN_HEIGHT);
		this.setPrefWidth(Numbers.WIN_WIDTH);

		bg = new Canvas();
		bg.setWidth(Numbers.WIN_WIDTH);
		bg.setHeight(Numbers.WIN_HEIGHT);
		gc = bg.getGraphicsContext2D();
		this.drawBg(gc);
		gc.setFill(Color.DARKRED);
		gc.fillRect(0, 0, 200, 200);
		this.getChildren().add(bg);

		
	}
	
	
	public void drawBg(GraphicsContext gc) {
		gc.drawImage(a, 0, 0, Numbers.WIN_WIDTH, Numbers.WIN_HEIGHT);
	}
}
