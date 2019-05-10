package ui.scene;

import constant.Numbers;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class EndScene extends StackPane {
	private static Canvas canvas;
	private static GraphicsContext gc;

	public EndScene(boolean win) {
		super();
		this.setPrefSize(Numbers.WIN_WIDTH, Numbers.WIN_HEIGHT);

		canvas = new Canvas();
		canvas.setWidth(Numbers.WIN_WIDTH);
		canvas.setHeight(Numbers.WIN_HEIGHT);
		gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.BLACK);
		gc.fillRect(0, 0, Numbers.WIN_WIDTH, Numbers.WIN_HEIGHT);

		if(win) {
			drawVictory(gc);
		} else {
			drawDefeat(gc);
		}
		this.getChildren().add(canvas);
	}

	private static void drawVictory(GraphicsContext gc) {
		gc.setFill(Color.GOLD);
		gc.setStroke(Color.GOLDENROD);
		gc.setLineWidth(2.0);
		gc.setFont(new Font("koverwatch", 100));
		gc.fillText("Victory", 700, 300);
		gc.strokeText("Victory", 700, 300, 300);
	}

	private static void drawDefeat(GraphicsContext gc) {
		gc.setFill(Color.ORANGERED);
		gc.setStroke(Color.DARKORANGE);
		gc.setLineWidth(2.0);
		gc.setFont(new Font("koverwatch", 100));
		gc.fillText("Defeat", 700, 300);
		gc.strokeText("Defeat", 700, 300, 300);
	}
}
