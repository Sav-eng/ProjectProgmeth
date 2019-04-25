package ui;

public class EntityButton extends GameButton{

	private int cooldownTime;
	
	public EntityButton(String character, int price, int cooldownTime) {
		super(character, price);
		// TODO Auto-generated constructor stub
		this.cooldownTime = cooldownTime;
	}

	public int getCooldownTime() {
		return cooldownTime;
	}

	public void setCooldownTime(int cooldownTime) {
		this.cooldownTime = cooldownTime;
	}
	
	
	
}
