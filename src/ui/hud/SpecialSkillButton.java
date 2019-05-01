package ui.hud;

import javafx.scene.image.Image;

public abstract class SpecialSkillButton extends GameButton{

	private int cooldownTime;
	private Double buffAmount;
	
	public SpecialSkillButton(Image character, int price, int cooldownTime, Double buffAmount) {
		super(character, price);
		// TODO Auto-generated constructor stub
		this.cooldownTime = cooldownTime;
		this.buffAmount = buffAmount;
	}
	
	
}
