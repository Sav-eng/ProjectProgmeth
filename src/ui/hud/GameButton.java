package ui.hud;

import static javafx.scene.layout.BorderStrokeStyle.SOLID;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public abstract class GameButton extends Button {

	private Image character;
	private int price;
	private boolean isCooldown;
	private int pressTime;

	public GameButton(Image character,int price) {
		super();
		this.setPadding(new Insets(5, 5, 5, 5));
		this.setPrefSize(100, 100);
		this.setMaxSize(100, 100);
		this.setMinSize(100, 100);
		this.character = character;
		this.price = price;

		setBorder(new Border(new BorderStroke(Color.GRAY, SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		isCooldown = false;

		this.setGraphic(new ImageView(character));
		this.setStyle("-fx-background-color: #ffffff;");
	}
	
	public boolean getIsCooldown() {
		return isCooldown;
	}

	public Image getCharacter() {
		return character;
	}

	public int getPrice() {
		return price;
	}

	public int getPressTime() {
		return pressTime;
	}

	public void setPressTime(int pressTime) {
		this.pressTime = pressTime;
	}
	
	
}
