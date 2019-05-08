package ui.hud;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.org.apache.bcel.internal.generic.ReturnaddressType;

import constant.LoadResource;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RateButton extends GameButton{
	
	private static int level = 1;
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
	
	public static void levelUp() {
		RateButton.level++;
	}

	public static int getProduceRate() {
		return produceRate;
	}

	public static void setProduceRate(int produceRate) {
		RateButton.produceRate = produceRate;
	}
	
	public static int getCost() {
		switch(RateButton.getLevel()) {
		case 1: return 90;
		case 2: return 180;
		case 3: return 300;
		case 4: return 450;
		case 5: return 660;
		case 6: return 900;
		case 7: return 1050;
		case 8: return 1200;
		case 9: return 1500;
		default: return 1800;
		}
	}
	
	
}
