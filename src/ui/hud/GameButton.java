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
	private boolean isPress;
	private boolean isCooldown;

	public GameButton(Image character,int price) {
		super();
		this.setPadding(new Insets(5, 5, 5, 5));
		this.setPrefSize(100, 100);
		this.setMaxSize(100, 100);
		this.setMinSize(100, 100);
		this.character = character;
		this.price = price;

		setBorder(new Border(new BorderStroke(Color.GRAY, SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		isPress = false;
		isCooldown = false;

		this.setGraphic(new ImageView(character));
		this.setStyle("-fx-background-color: #ffffff;");
	}

	public void buttonPressed() {
		if (isPress == false) {
			isPress = true;
			//TODO add method
			System.out.println("test thing");
		}
	}

	public void buttonRelease() {
		isPress = false;
	}
	
	public boolean getIsCooldown() {
		return isCooldown;
	}
	public void buttonCooldown() {
		//TODO thread timer(countdown)
	}

	public boolean isPress() {
		return isPress;
	}

	public void setPress(boolean isPress) {
		this.isPress = isPress;
	}

	public Image getCharacter() {
		return character;
	}

	public int getPrice() {
		return price;
	}
}
