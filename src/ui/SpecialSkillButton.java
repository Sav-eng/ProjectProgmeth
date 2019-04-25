package ui;

public abstract class SpecialSkillButton extends GameButton{

	private int cooldownTime;
	private Float buffAmount;
	
	public SpecialSkillButton(String character, int price, int cooldownTime, Float buffAmount) {
		super(character, price);
		// TODO Auto-generated constructor stub
		this.cooldownTime = cooldownTime;
		this.buffAmount = buffAmount;
	}
}
