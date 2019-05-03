package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import ui.scene.GamePlayScene;
import ui.scene.LoadingScene;
import ui.scene.MainMenuScene;

public class Main extends Application {

	private static int phase = 0;
	private static LoadingScene load = new LoadingScene();
	private static MainMenuScene start = new MainMenuScene();
	private static GamePlayScene game1 = new GamePlayScene(1);
	private static GamePlayScene game2 = new GamePlayScene(2);
	private static Scene scene = new Scene(load);
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		switch (phase) {
		case 1: scene.setRoot(start); break;
		case 2: scene.setRoot(game1); break;
		case 3: scene.setRoot(game2); break;
		}
		primaryStage.setScene(scene);
		primaryStage.setTitle("Age Of Progmeth");
		primaryStage.show();
	
	}

}
