package main;

import constant.LoadResource;
import constant.Numbers;
import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import ui.scene.GamePlayScene;
import ui.scene.LoadingScene;
import ui.scene.MainMenuScene;

public class Main extends Application {

	private static LoadingScene load;
	private static MainMenuScene main;
	private static GamePlayScene game1;
	private static GamePlayScene game2;
	private static Scene scene;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		load = new LoadingScene();
		scene = new Scene(load,Numbers.WIN_WIDTH,Numbers.WIN_HEIGHT);
//		Main.getScene().setRoot(Main.getMain());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Age Of Progmeth");
		primaryStage.show();
		
		new Thread(()-> {
			Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
			LoadResource.loadResource();
			main = new MainMenuScene();
			game1 = new GamePlayScene(1);
//			game2 = new GamePlayScene(2);
			Main.getScene().setRoot(Main.getMain());
			System.out.println("RUN");
		}).start();
		
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
