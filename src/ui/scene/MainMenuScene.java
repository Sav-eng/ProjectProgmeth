package ui.scene;

import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.util.converter.NumberStringConverter;
import sun.awt.image.ImageAccessException;
import sun.misc.GC;
import ui.hud.MainmenuButton;
import constant.Numbers;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javax.swing.text.Highlighter.Highlight;

import com.sun.org.apache.xalan.internal.xsltc.dom.ExtendedSAX;

import constant.LoadResource;

public class MainMenuScene extends StackPane {
	
	private Canvas bg;
	private GraphicsContext gc;
	private VBox menuButton;
	private MainmenuButton playButtonMainmenu;
	private MainmenuButton exitButtonMainmenu;
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
		this.getChildren().add(bg);

		menuButton = new VBox();
		menuButton.setPadding(new Insets(10));
		menuButton.setSpacing(40);
		menuButton.setAlignment(Pos.CENTER);
		
		Image b = LoadResource.loadImage("Other/playButton.png", 100, 50);
		Image c = LoadResource.loadImage("Other/exitButton.png", 100, 50);
//		playButtonMainmenu = new ButtonMainmenu(LoadResource.playButtonIcon);
//		exitButtonMainmenu = new ButtonMainmenu(LoadResource.exitButtonIcon);
		playButtonMainmenu = new MainmenuButton(b);
		exitButtonMainmenu = new MainmenuButton(c);
		

		setMouseEvent(playButtonMainmenu);
		setMouseEvent(exitButtonMainmenu);
		
		exitButtonMainmenu.setOnAction(new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
	            System.exit(1);
	        }
		});
		
		//TODO add playButton OnPressEvent (go to game play scene)
		
		
		menuButton.getChildren().addAll(playButtonMainmenu,exitButtonMainmenu);
		
		this.getChildren().add(menuButton);

		
	}
	
	
	public void drawBg(GraphicsContext gc) {
		a = LoadResource.loadImage("Other/mainBg.jpg", Numbers.WIN_WIDTH, Numbers.WIN_HEIGHT);
		//a = new Image(ClassLoader.getSystemResource("Other/mainBg.jpg").toString());
//		a = new Image(ClassLoader.getSystemResource("Other/mainBg.jpg").toString());
		Image d = LoadResource.loadImage("Other/Logo.png", 700, 100);
//		gc.drawImage(LoadResource.menuBg, 0, 0, Numbers.WIN_WIDTH, Numbers.WIN_HEIGHT);
//		gc.drawImage(LoadResource.logo, 500, 50);

		gc.drawImage(a, 0, 0, Numbers.WIN_WIDTH, Numbers.WIN_HEIGHT);
		gc.drawImage(d, 500, 50);
	}
	
	private void setMouseEvent(MainmenuButton butt) {
		butt.addEventHandler(MouseEvent.MOUSE_ENTERED,
		        new EventHandler<MouseEvent>() {
	          @Override
	          public void handle(MouseEvent e) {
	            butt.highlight();
	          }
	        });
		
		butt.addEventHandler(MouseEvent.MOUSE_EXITED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent e) {
		            butt.unHighlight();
		          }
		        });
	}
}