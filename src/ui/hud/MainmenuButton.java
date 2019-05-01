package ui.hud;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainmenuButton extends Button{
	
	public MainmenuButton(Image image) {
		this.setGraphic(new ImageView(image));
		this.setStyle("-fx-background-color: #bb0a1e;");
	}
	
	public void highlight() {
	    this.setStyle("-fx-background-color: #4CBB17;");
	}
	
	public void unHighlight() {
		this.setStyle("-fx-background-color: #bb0a1e;");
	}
}
