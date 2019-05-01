package model.base;

public abstract class Character implements IRenderable{
	private int hp;
	private int atk;
	private int def;
	private int x,z;
	private int range;
	private int xSprite;
	private int moveSpeed;
	private boolean player;
	
	public Character(int hp, int atk, int def,int moveSpeed,int range) {
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.moveSpeed = moveSpeed;
		this.x = 0;
		this.range = range;
	}

	public void move() {
		// TODO add some move
		x += moveSpeed;
	}	

	public void render() {
		if(canAttack)
	}
	
	private boolean canAttack(Character enemy) {
		if(enemy.getNowX()-this.x <= this.range) {
			return true;
		}
		return false;
	}
	public void attack(Character enemy) {
		int atkWithDef;
		if (this.atk-enemy.getDef()  <0)
			atkWithDef = 0;
		else
			atkWithDef = this.atk-enemy.getDef();
		enemy.setHp(enemy.getHp()-atkWithDef);
	}
	
	public void die() {
		// TODO delete from entities list and team list
	}
	
	public int getMoveSpeed() {
		return moveSpeed;
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
