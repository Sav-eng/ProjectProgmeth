package model;

public abstract class Character {
	private int hp;
	private int atk;
	private int def;

	public Character(int hp, int atk, int def) {
		if (hp <= 0) {
			this.hp = 1;
		} else {
			this.hp = hp;
		}
		if (atk <= 0) {
			this.atk = 1;
		} else {
			this.atk = atk;
		}
		if (def <= 0) {
			this.def = 1;
		} else {
			this.def = def;
		}
	}

	public int move() {
		// TODO add some move
		
	}

	public abstract int attack();

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
