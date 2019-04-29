package model.base;

public abstract class Character implements IRenderable{
	private int hp;
	private int atk;
	private int def;
	private int x,z;
	private int xSprite;
	private int moveSpeed;
	private boolean player;
	
	public Character(int hp, int atk, int def,int moveSpeed,int x) {
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.moveSpeed = moveSpeed;
		this.x = x;
	}

	public void move() {
		// TODO add some move
		x += moveSpeed;
	}	

	public void renderMove() {
		
	}
	public void renderAttck() {
		
	}
	public void attack(Character enemy) {
		
	}
	
	public int getMoveSpeed() {
		
	}
	
	public void die() {
		// TODO delete from entities list and team list
	}
	
	public int beAttacked() {
		
	}
	public void isAttack() {
		
	}
	public void die() {
		
	}
	
	public boolean isDeath() {
		return this.hp <= 0;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

}
