package ui;

import javafx.scene.control.Button;

public class UpgradeButton extends EntityButton{
	private int level;
	
	public UpgradeButton(String character, int price, int level) {
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
