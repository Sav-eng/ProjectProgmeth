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
//		EndScene root = new EndScene(true);
//		ControlPane root = new ControlPane(1);
//		StackPane root = new StackPane();
		Canvas out = new Canvas();
		out.setHeight(400);
		out.setWidth(400);
		GraphicsContext gContext = out.getGraphicsContext2D();
		gContext.drawImage(LoadResource.fairyAttack[0], 0, 0);
		gContext.drawImage(LoadResource.fairyAttack[1], 0, 0);
		gContext.drawImage(LoadResource.fairyAttack[2], 0, 0);
		gContext.drawImage(LoadResource.fairyAttack[3], 0, 0);
		gContext.drawImage(LoadResource.fairyAttack[4], 0, 0);
		gContext.drawImage(LoadResource.fairyWalk[0], 0, 0);
		gContext.drawImage(LoadResource.fairyWalk[1], 0, 0);
		gContext.drawImage(LoadResource.fairyWalk[2], 0, 0);
		gContext.drawImage(LoadResource.fairyWalk[3], 0, 0);
		gContext.drawImage(LoadResource.fairyWalk[4], 0, 0);
		gContext.drawImage(LoadResource.fairyDie[0], 0, 0);
		gContext.drawImage(LoadResource.fairyDie[1], 0, 0);
		gContext.drawImage(LoadResource.fairyDie[2], 0, 0);
		gContext.drawImage(LoadResource.fairyDie[3], 0, 0);
		gContext.drawImage(LoadResource.fairyDie[4], 0, 0);
		
		gContext.drawImage(LoadResource.orkAttack[0], 0, 200);
		gContext.drawImage(LoadResource.orkAttack[1], 0, 200);
		gContext.drawImage(LoadResource.orkAttack[2], 0, 200);
		gContext.drawImage(LoadResource.orkAttack[3], 0, 200);
		gContext.drawImage(LoadResource.orkAttack[4], 0, 200);
		gContext.drawImage(LoadResource.orkWalk[0], 0, 200);
		gContext.drawImage(LoadResource.orkWalk[1], 0, 200);
		gContext.drawImage(LoadResource.orkWalk[2], 0, 200);
		gContext.drawImage(LoadResource.orkWalk[3], 0, 200);
		gContext.drawImage(LoadResource.orkWalk[4], 0, 200);
		gContext.drawImage(LoadResource.orkDie[0], 0, 200);
		gContext.drawImage(LoadResource.orkDie[1], 0, 200);
		gContext.drawImage(LoadResource.orkDie[2], 0, 200);
		gContext.drawImage(LoadResource.orkDie[3], 0, 200);
		gContext.drawImage(LoadResource.orkDie[4], 0, 200);
		
//		StackPane root = new StackPane();
		BorderPane root = new BorderPane();
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