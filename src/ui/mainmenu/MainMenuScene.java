package ui.mainmenu;

import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.util.converter.NumberStringConverter;



import constant.Numbers;


public class MainMenuScene extends Scene {
	

	private Pane root;
	private VBox menus;
	private ButtonMainmenu playButtonMainmenu;
	private ButtonMainmenu creditButtonMainmenu;
	public MainMenuScene() {
		super(new Pane(),Numbers.WIN_WIDTH,Numbers.WIN_HEIGHT);
		
		root = (Pane)getRoot();
		
		menus = new VBox();
		
		Canvas menuBackgroud = new Canvas(Numbers.WIN_WIDTH,Numbers.WIN_HEIGHT);
		GraphicsContext gc = menuBackgroud.getGraphicsContext2D();
		gc.setFill(Color.BLACK);
		
		
		playButtonMainmenu = new ButtonMainmenu("PLAY");
		playButtonMainmenu.setAlignment(Pos.CENTER);
		creditButtonMainmenu = new ButtonMainmenu("CREDIT");
		creditButtonMainmenu.setAlignment(Pos.CENTER);
		playButtonMainmenu.setOnAction(e -> {
			// TODO set to gameplay
		});
		
		creditButtonMainmenu.setOnAction(e -> {
			// TODO set to action
		});
		
		menus.getChildren().addAll(playButtonMainmenu,creditButtonMainmenu);
//		menus.add(playButtonMainmenu,creditButtonMainmenu);
		
		root.getChildren().addAll(menuBackgroud,menus);
		
		
	}
}
