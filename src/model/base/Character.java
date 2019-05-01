package model.base;

import constant.Numbers;
import main.Game;

public abstract class Character{
	private int hp;
	private int atk;
	private int def;
	private int x;
	private int range;
	private int sprite;
	private int moveSpeed;
	private boolean player;
	private int doing; // 1=walk, 2=attack, 3=attackbase, 4=die
	private int cooldown;
	private int baseCooldown;
	
	public Character(int hp, int atk, int def,int moveSpeed,int range,boolean player,int baseCooldown) {
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.moveSpeed = moveSpeed;
		this.x = 0;
		this.range = range;
		this.player = player;
		this.baseCooldown = baseCooldown;
		cooldown = 0;
		if(player)AllCharacter.getPlayer().add(this);
		else AllCharacter.getEnemy().add(this);
	}

	public void move() {
		cooldown = 0;
		x += moveSpeed;
	}	

	public boolean isCooldown() {
		return cooldown > 0;
	}
	
	public void decreaseCooldown() {
		cooldown--;
	}
	
	public void update() {
		if(!isCooldown() && this.canAttack(AllCharacter.getFirstEnemy())) {
			doing = 2;
		} else if (!isCooldown() && this.canAttackBase()) {
			doing = 3;
		} else if(this.canMove()){
			this.move();
			
		}
	}
	
	private void attackBase() {
		if(this.player) {
			Game.setHpEnemyBase(Game.getHpEnemyBase()-atk);
		} else {
			Game.setHpPlayerBase(Game.getHpPlayerBase()-atk);
		}
	}
	
	private boolean canAttackBase() {
		if(this.player == true && this.range >= Numbers.POSITION_ENEMY-this.getX()) {
			return true;
		} else if (this.player == false && this.range >= this.getX()-Numbers.POSITION_PLAYER) {
			return true;
		}
		return false;
	}
	
	private boolean canMove() {
		int pos;
		if(player) {
			pos = AllCharacter.getPlayer().indexOf(this);
			if(AllCharacter.getPlayer().get(pos+1) != null && Math.abs(this.getX()-AllCharacter.getPlayer().get(pos+1).getX()) >= Numbers.SPACINGCHARACTER){
				return false;
			}
		} else {
			pos = AllCharacter.getEnemy().indexOf(this);
			if(AllCharacter.getEnemy().get(pos+1) != null && Math.abs(this.getX()-AllCharacter.getEnemy().get(pos+1).getX()) >= Numbers.SPACINGCHARACTER){
				return false;
			}
		}
		return false;
	}
	
	private boolean canAttack(Character enemy) {
		if(Math.abs(enemy.getX()-this.x) <= this.range && cooldown ==0) {
			return true;
		} else if (Math.abs(enemy.getX()-this.x) <= this.range) {
			decreaseCooldown();
		}
		return false;
	}
	
	public void attack(Character enemy) {
		int atkWithDef;
		cooldown = baseCooldown;
		if (this.atk-enemy.getDef()  <0)
			atkWithDef = 0;
		else
			atkWithDef = this.atk-enemy.getDef();
		enemy.setHp(enemy.getHp()-atkWithDef);
		if(enemy.getHp()<=0) {
			enemy.doing = 4;
			doing = 1;
		}
		
	}
	
	public void die() {
		if(this.player) {
			AllCharacter.getEnemy().remove(0);
		} else {
			AllCharacter.getPlayer().remove(0);
		}
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
