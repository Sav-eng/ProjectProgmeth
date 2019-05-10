package ui.scene;

import constant.LoadResource;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import main.Main;
import ui.hud.ControlPane;

public class test extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	public void start(Stage primaryStage) {

		// TODO Implement Main
		LoadResource.loadResource();
//		EndScene root = new EndScene();
//		ControlPane root = new ControlPane(1);
//		StackPane root = new StackPane();
		Canvas out = new Canvas();
		out.setHeight(400);
		out.setWidth(400);
		GraphicsContext gContext = out.getGraphicsContext2D();
		gContext.drawImage(LoadResource.knight1Attack[1], 50, 50);
		gContext.drawImage(LoadResource.archerAttack[1], 50, 50);
		
		BorderPane root = new BorderPane();
//		root.getChildren().add(out);
		root.setTop(out);
		
//		HBox root = new HBox();
//		LoadResource.loadResource();
//		LoadingScene root = new LoadingScene();
		Scene scene = new Scene(root);
		primaryStage.setTitle("test"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene
		primaryStage.show();
	}


}