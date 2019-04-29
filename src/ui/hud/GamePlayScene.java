package ui.hud;

import constant.Numbers;
import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

public class GamePlayScene extends Scene {

	StackPane root;

	public GamePlayScene() {
		super(new StackPane(), Numbers.WIN_WIDTH , Numbers.WIN_HEIGHT);
		root = (StackPane)getRoot();
	
		
}
