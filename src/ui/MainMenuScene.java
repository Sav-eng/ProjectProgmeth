package ui;

import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.util.converter.NumberStringConverter;
import constant.Numbers;


public class MainMenuScene extends Scene {
	
	private Timeline menuTick;
	private Pane root;
	
	public MainMenuScene() {
		super(new Pane(),Numbers.WIN_WIDTH,Numbers.WIN_HEIGHT);
		root = (Pane) getRoot();
		
	}
}
