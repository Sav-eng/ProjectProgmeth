package ui.scene;


import constant.LoadResource;
import constant.Numbers;
import javafx.animation.AnimationTimer;
import javafx.application.Platform;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import main.Main;

public class LoadingScene extends StackPane {
	private static Canvas bg;
	private static GraphicsContext gContext;
	private static int progress;
	private static AnimationTimer timer;

	public LoadingScene() {
		// TODO Auto-generated constructor stub
		bg = new Canvas();
		gContext = bg.getGraphicsContext2D();
		//System.out.println("Hello");
		timer = new AnimationTimer() {
			
			@Override
			public void handle(long now) {
				StackPane root = new StackPane();
				gContext.clearRect(0, 0, Numbers.WIN_WIDTH, Numbers.WIN_HEIGHT);
				progress = LoadResource.getProgress();
				
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
				
			}
		};
		timer.start();
		this.getChildren().add(bg);
	}
	
	private static void drawLoadProgress(int pos) {
		gContext.fillRect((pos*80)+405, 265, 70, 70);
	}

	public static AnimationTimer getTimer() {
		return timer;
	}

	public static void setTimer(AnimationTimer timer) {
		LoadingScene.timer = timer;
	}
	
}