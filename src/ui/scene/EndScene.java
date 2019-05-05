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

	public EndScene() {
		super();
		this.setPrefSize(Numbers.WIN_WIDTH, Numbers.WIN_HEIGHT);

		canvas = new Canvas();
		canvas.setWidth(Numbers.WIN_WIDTH);
		canvas.setHeight(Numbers.WIN_HEIGHT);
		gc = canvas.getGraphicsContext2D();

//		if() {
//			drawVictory();
//		} else if () {
//			drawDefeat();
//		}
////		gc.strokeRect(100, 100, 100, 100);
//		gc.setFont(Font.font(50));
//		gc.setStroke(Color.BLACK);
//		gc.strokeText("Victory", 500, 500);
		drawVictory(gc);
		this.getChildren().add(canvas);
	}

	private static void drawVictory(GraphicsContext gc) {
		gc.setFill(Color.BLACK);
		gc.setStroke(Color.GOLDENROD);
		gc.setLineWidth(10.0);
		gc.setFont(new Font("koverwatch", 100));
		gc.fillText("Victory", 500, 500);
//		gc.strokeText("Victory", 500, 500, 100);
	}

	private static void drawDefeat(GraphicsContext gc) {
		gc.setLineWidth(1.0);
		gc.setFont(new Font("AR ADGothicJP", 100));
		gc.strokeText("Defeat", 150, 50, 100);
	}
}
