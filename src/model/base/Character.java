package model.base;

import constant.Numbers;

public abstract class Character{
	private int hp;
	private int atk;
	private int def;
	private int x;
	private int range;
	private int sprite;
	private int moveSpeed;
	private boolean player;
	private int doing; // 1=walk, 2=attack, 3=die
	
	public Character(int hp, int atk, int def,int moveSpeed,int range,boolean player) {
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.moveSpeed = moveSpeed;
		this.x = 0;
		this.range = range;
		this.player = player;
	}

	public void move() {
		// TODO add some move
		x += moveSpeed;
	}	

	public abstract void getbuff();
	
	public void render() {
		if(this.canAttack(AllCharacter.getFirstEnemy())) {
			this.attack(AllCharacter.getFirstEnemy());
		} else if (this.canAttackBase()) {
			this.attackBase();
		} else if(this.canMove()){
			
		}
	}
	
	private void attackBase() {
		if(this.playey) {
			enemy.base
		}
	}
	
	private boolean canAttackBase() {
		if(this.player == true && this.range >= Numbers.POSITION_ENEMY-this.getNowX()) {
			return true;
		} else if (this.player == false && this.range >= this.getNowX()-Numbers.POSITION_PLAYER) {
			return true;
		}
		return false;
	}
	
	private boolean canMove() {
		if(this.getNowX())
	}
	private boolean canAttack(Character enemy) {
		if(Math.abs(enemy.getNowX()-this.x) <= this.range) {
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

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getSprite() {
		return sprite;
	}

	public void setSprite(int sprite) {
		this.sprite = sprite;
	}

	public boolean isPlayer() {
		return player;
	}

	public void setPlayer(boolean player) {
		this.player = player;
	}

	public int getDoing() {
		return doing;
	}

	public void setDoing(int doing) {
		this.doing = doing;
	}

	public void setMoveSpeed(int moveSpeed) {
		this.moveSpeed = moveSpeed;
	}

	
}
