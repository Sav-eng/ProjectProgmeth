package ui.scene;

import constant.Numbers;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import model.data.Player;

public class EndScene extends StackPane {
	private Canvas canvas;
	private GraphicsContext gc;

	public EndScene() {
		this.setPrefSize(Numbers.WIN_WIDTH, Numbers.WIN_HEIGHT);
		
		canvas = new Canvas();
		gc = canvas.getGraphicsContext2D();
		
		if() {
			drawVictory();
		} else if () {
			drawDefeat();
		}
		
		this.getChildren().add(canvas);
	}
	
	private void drawVictory() {
		gc.setLineWidth(1.0);
		gc.setFont(new Font("AR ADGothicJP", 30));
		gc.strokeText(Player.getMoney()+"", 150, 50, 100);
	}
	
	private void drawDefeat() {
		
	}
}
