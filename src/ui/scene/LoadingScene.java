package ui.scene;

import constant.LoadResource;
import constant.Numbers;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class LoadingScene extends StackPane {
	private static Canvas bg;
	private static GraphicsContext gContext;
	private static int progress;

	public LoadingScene() {
		// TODO Auto-generated constructor stub
		bg = new Canvas();
		gContext = bg.getGraphicsContext2D();
		//progress = LoadResource.getProgress();
		progress = 10;
		bg.setWidth(Numbers.WIN_WIDTH);
		bg.setHeight(Numbers.WIN_HEIGHT);
		gContext.setFill(Color.BLACK);
		gContext.setStroke(Color.BLACK);
		gContext.fillRect(0, 0, bg.getWidth(), bg.getHeight());
		
		gContext.setStroke(Color.WHITE);
		gContext.setLineWidth(10);
		gContext.strokeRect(390, 250, 820, 100);
		gContext.setFill(Color.WHITE);
		
		
		for (int i = 0; i < progress; i++) {
			drawLoadProgress(i);
		}
		
		this.getChildren().add(bg);
	}
	
	private static void drawLoadProgress(int pos) {
		gContext.fillRect((pos*80)+405, 265, 70, 70);
	}
}
