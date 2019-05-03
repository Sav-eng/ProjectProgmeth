package ui.hud;

import com.sun.glass.ui.TouchInputSupport;

import constant.LoadResource;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class PauseButton extends Button {
	
	public PauseButton() {
		// TODO Auto-generated constructor stub
		super();
		this.setPrefSize(30, 30);
		this.setGraphic(new ImageView(LoadResource.pauseButton));
	}
	
	
}
