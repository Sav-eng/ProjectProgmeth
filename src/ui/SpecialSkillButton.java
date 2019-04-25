package ui;

public class SpecialSkillButton extends GameButton{

	private int cooldownTime;
	
	public SpecialSkillButton(String character, int price, int cooldownTime) {
		super(character, price);
		// TODO Auto-generated constructor stub
		this.cooldownTime = cooldownTime;
	}

}
