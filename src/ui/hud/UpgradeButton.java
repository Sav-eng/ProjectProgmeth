package ui.hud;

import javafx.scene.control.Button;
import javafx.scene.image.Image;

public class UpgradeButton extends GameButton{
	private int level;
	
	public UpgradeButton(Image character, int price, int level) {
		super(character, price);
		this.level = level;
		// TODO Auto-generated constructor stub
		
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
}
