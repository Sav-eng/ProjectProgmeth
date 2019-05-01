package ui.hud;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ButtonMainmenu extends Button{
	public ButtonMainmenu(Image image) {
		this.setGraphic(new ImageView(image));
		this.setStyle("-fx-background-color: #bb0a1e;");
	}
}
