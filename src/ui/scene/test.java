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
		
		gContext.drawImage(LoadResource.troll2Attack[0], 0, 200);
		gContext.drawImage(LoadResource.troll2Attack[1], 0, 200);
		gContext.drawImage(LoadResource.troll2Attack[2], 0, 200);
		gContext.drawImage(LoadResource.troll2Attack[3], 0, 200);
		gContext.drawImage(LoadResource.troll2Attack[4], 0, 200);
		gContext.drawImage(LoadResource.troll2Walk[0], 0, 200);
		gContext.drawImage(LoadResource.troll2Walk[1], 0, 200);
		gContext.drawImage(LoadResource.troll2Walk[2], 0, 200);
		gContext.drawImage(LoadResource.troll2Walk[3], 0, 200);
		gContext.drawImage(LoadResource.troll2Walk[4], 0, 200);
		gContext.drawImage(LoadResource.troll2Die[0], 0, 200);
		gContext.drawImage(LoadResource.troll2Die[1], 0, 200);
		gContext.drawImage(LoadResource.troll2Die[2], 0, 200);
		gContext.drawImage(LoadResource.troll2Die[3], 0, 200);
		gContext.drawImage(LoadResource.troll2Die[4], 0, 200);
		
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