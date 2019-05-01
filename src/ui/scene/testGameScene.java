package ui.scene;

import constant.LoadResource;
import constant.Numbers;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import ui.hud.ControlPane;

public class testGameScene extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	public void start(Stage primaryStage) {

		// TODO Implement Main
		LoadResource.loadResource();
		BorderPane aPane = new BorderPane();
//		GamePlayScene root = new GamePlayScene();
		ControlPane root = new ControlPane(1);
		root.setAlignment(Pos.BOTTOM_CENTER);
		
		aPane.setBottom(root);
		
//		HBox root = new HBox();
//		LoadResource.loadResource();
		
		Scene scene = new Scene(aPane,Numbers.WIN_WIDTH,Numbers.WIN_HEIGHT);
		primaryStage.setTitle("test"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene
		primaryStage.show();
	}


	
}
