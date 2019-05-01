package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import ui.scene.MainMenuScene;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Scene scene = new MainMenuScene();
		primaryStage.setScene(scene);
		primaryStage.setTitle("Age Of Progmeth");
		
		scene.setRoot(value);
		
		
		primaryStage.show();
	
	}

}
