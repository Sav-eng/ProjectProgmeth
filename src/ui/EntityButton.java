package ui;

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

public class EntityButton extends Button {

	private String character;
	private int price;
	private boolean isPress;
	private boolean isCooldown;

	public EntityButton(String character,int price) {
		super();
		this.setPadding(new Insets(5, 5, 5, 5));
		this.character = character;
		this.price = price;

		setBorder(new Border(new BorderStroke(Color.GRAY, SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		isPress = false;
		isCooldown = false;
		
		String url;
		switch(character) {
		//TODO fix path
			case "Wood" : url = "/res/Wood.png"; break;
			case "Iron" : url = "/res/Iron_ore.png"; break;
			case "Iron Plate" : url = "/res/Iron_plate.png"; break;
			case "Iron Sword" : url = "/res/Iron_Sword.png"; break;
			case "Gem"	: url = "/res/Gem.png"; break;
			default : url = "/res/Other.png";
		}
		Image image = new Image(getClass().getResourceAsStream(url));
		this.setGraphic(new ImageView(image));
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

	public String getCharacter() {
		return character;
	}

	public int getPrice() {
		return price;
	}
}
