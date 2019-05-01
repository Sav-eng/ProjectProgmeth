package ui.scene;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class testGameScene extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	public void start(Stage primaryStage) {

		// TODO Implement Main
//		LoadResource.loadResource();
		
		GamePlayScene root = new GamePlayScene();
//		HBox root = new HBox();
//		LoadResource.loadResource();
		Scene scene = new Scene(root);
		primaryStage.setTitle("test"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene
		primaryStage.show();
	}


	
}
