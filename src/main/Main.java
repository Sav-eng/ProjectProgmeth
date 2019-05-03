package main;

import constant.LoadResource;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import ui.scene.GamePlayScene;
import ui.scene.LoadingScene;
import ui.scene.MainMenuScene;

public class Main extends Application {

	private static LoadingScene load = new LoadingScene();
	private static MainMenuScene main = new MainMenuScene();
	private static GamePlayScene game1 = new GamePlayScene(1);
	private static GamePlayScene game2 = new GamePlayScene(2);
	private static Scene scene = new Scene(load);
	
	public static void main(String[] args) {
		LoadResource.loadResource();
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Main.getScene().setRoot(Main.getMain());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Age Of Progmeth");
		primaryStage.show();
	
	}

	public static LoadingScene getLoad() {
		return load;
	}

	public static MainMenuScene getMain() {
		return main;
	}

	public static GamePlayScene getGame1() {
		return game1;
	}

	public static GamePlayScene getGame2() {
		return game2;
	}

	public static Scene getScene() {
		return scene;
	}

	
}
