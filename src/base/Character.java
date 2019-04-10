package base;

public abstract class Character {
	private int hp;
	private int atk;
	private int def;
	
	public void Character(int hp, int atk, int def) {
		this.hp = hp;
		this.def = def;
		this.atk = atk;
	}
	
	public void move() { 
		//TODO after finish GUI
	}
	
	public abstract int attack();
	public boolean isDeath() {
		return this.hp==0;
	}
	
}
