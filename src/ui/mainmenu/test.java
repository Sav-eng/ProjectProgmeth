package ui.mainmenu;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class test extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	public void start(Stage primaryStage) {

		// TODO Implement Main
		MainMenuScene root = new MainMenuScene();
//		HBox root = new HBox();

		Scene scene = new Scene(root);
		primaryStage.setTitle("test"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene
		primaryStage.show();
	}


}
