package ui.hud;

import javafx.scene.image.Image;

public class RateButton extends GameButton{
	
	private static int level;
	private static int produceRate;
	
	public RateButton(Image character, int price,int level) {
		super(character, price);
		RateButton.level = level;
		// TODO Auto-generated constructor stub
	}

	public static int getLevel() {
		return level;
	}

	public static void setLevel(int level) {
		RateButton.level = level;
	}
	
	public void levelUp() {
		RateButton.level++;
	}

	public static int getProduceRate() {
		return produceRate;
	}

	public static void setProduceRate(int produceRate) {
		RateButton.produceRate = produceRate;
	}
	
}
