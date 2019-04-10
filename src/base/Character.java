package base;

public abstract class Character {
	private int hp;
	private int atk;
	private int def;
	
	public Character(int hp, int atk, int def) {
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}
	
	public int move() { 
		//TODO add some move 
	}
	
	public abstract int attack();
	public boolean isDeath() {
		return this.hp==0;
	}
	
}
