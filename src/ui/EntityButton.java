package ui;

import static javafx.scene.layout.BorderStrokeStyle.SOLID;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class EntityButton extends Button {

	String character;
	boolean isPress;

	public EntityButton(String character) {
		super();
		this.setPadding(new Insets(5, 5, 5, 5));

		setBorder(new Border(new BorderStroke(Color.GRAY, SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		isPress = false;

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
}
