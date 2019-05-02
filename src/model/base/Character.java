package model.base;

import constant.LoadResource;
import constant.Numbers;
import javafx.scene.image.Image;
import main.Game;

public abstract class Character {
	private String name;
	private int hp;
	private int atk;
	private int def;
	private int x;
	private int range;
	private int sprite;
	private int moveSpeed;
	private boolean player;
	private int doing; // 1=walk, 2=attack, 3=attackbase, 4=die
	private int pastDoing;
	private int cooldown;
	private int baseCooldown;

	public Character(String name, int hp, int atk, int def, int moveSpeed, int range, boolean player,
			int baseCooldown) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.moveSpeed = moveSpeed;
		this.x = 0;
		this.range = range;
		this.player = player;
		this.baseCooldown = baseCooldown;
		cooldown = 0;
		if (player)
			AllCharacter.getPlayer().add(this);
		else
			AllCharacter.getEnemy().add(this);
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
		if (!isCooldown() && this.canAttack(AllCharacter.getFirstEnemy())) {
			doing = 2;
		} else if (!isCooldown() && this.canAttackBase()) {
			doing = 3;
		} else if (this.canMove()) {
			this.move();

		}
	}

	public void attackBase() {
		if (this.player) {
			Game.setHpEnemyBase(Game.getHpEnemyBase() - atk);
		} else {
			Game.setHpPlayerBase(Game.getHpPlayerBase() - atk);
		}
	}

	private boolean canAttackBase() {
		if (this.player == true && this.range >= Numbers.POSITION_ENEMY - this.getX()) {
			return true;
		} else if (this.player == false && this.range >= this.getX() - Numbers.POSITION_PLAYER) {
			return true;
		}
		return false;
	}

	private boolean canMove() {
		int pos;
		if (player) {
			pos = AllCharacter.getPlayer().indexOf(this);
			if (AllCharacter.getPlayer().get(pos + 1) != null && Math
					.abs(this.getX() - AllCharacter.getPlayer().get(pos + 1).getX()) >= Numbers.SPACINGCHARACTER) {
				return false;
			}
		} else {
			pos = AllCharacter.getEnemy().indexOf(this);
			if (AllCharacter.getEnemy().get(pos + 1) != null && Math
					.abs(this.getX() - AllCharacter.getEnemy().get(pos + 1).getX()) >= Numbers.SPACINGCHARACTER) {
				return false;
			}
		}
		return false;
	}

	private boolean canAttack(Character enemy) {
		if (Math.abs(enemy.getX() - this.x) <= this.range && cooldown == 0) {
			return true;
		} else if (Math.abs(enemy.getX() - this.x) <= this.range) {
			decreaseCooldown();
		}
		return false;
	}

	public void attack(Character enemy) {
		int atkWithDef;
		cooldown = baseCooldown;
		if (this.atk - enemy.getDef() < 0)
			atkWithDef = 0;
		else
			atkWithDef = this.atk - enemy.getDef();
		enemy.setHp(enemy.getHp() - atkWithDef);
		if (enemy.getHp() <= 0) {
			enemy.doing = 4;
			doing = 1;
		}

	}

	public void die() {
		if (this.player) {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPastDoing() {
		return pastDoing;
	}

	public void setPastDoing(int pastDoing) {
		this.pastDoing = pastDoing;
	}

	public int getCooldown() {
		return cooldown;
	}

	public void setCooldown(int cooldown) {
		this.cooldown = cooldown;
	}

	public int getBaseCooldown() {
		return baseCooldown;
	}

	public void setBaseCooldown(int baseCooldown) {
		this.baseCooldown = baseCooldown;
	}

	public Image[] nameToSprite() {
		Image[] out = new Image[1];
		if (this.getDoing() == 1) {
			switch (this.getName()) {
			case "knight1": out = LoadResource.knight1Walk; break;
			case "Knight2": out = LoadResource.knight2Walk; break;
			case "Knight3": out = LoadResource.knight3Walk; break;
			case "Angle": out = LoadResource.angleWalk; break;
			case "Fairy" : out = LoadResource.fairyWalk; break;
			case "Archer" : out = LoadResource.archerWalk; break;
			case "Goblin" : out = LoadResource.goblinWalk; break;
			case "Golem" : out = LoadResource.golemWalk; break;
			case "Orc" : out = LoadResource.orcWalk; break;
			case "Ork" : out = LoadResource.orkWalk; break;
			case "Thief" : out = LoadResource.thiefWalk; break;
			case "Troll1" : out = LoadResource.troll1Walk; break;
			case "Troll2" : out = LoadResource.troll2Walk; break;
			case "WizardFire" : out = LoadResource.wizardFireWalk; break;
			case "WizardLaser" : out = LoadResource.wizardLaserWalk; break;
		}
			} else if (this.getDoing() == 2 || this.getDoing() ==3) {
				switch (this.getName()) {
				case "knight1": out = LoadResource.knight1Attack; break;
				case "Knight2": out = LoadResource.knight2Attack; break;
				case "Knight3": out = LoadResource.knight3Attack; break;
				case "Angle": out = LoadResource.angleAttack; break;
				case "Fairy" : out = LoadResource.fairyAttack; break;
				case "Archer" : out = LoadResource.archerAttack; break;
				case "Goblin" : out = LoadResource.goblinAttack; break;
				case "Golem" : out = LoadResource.golemAttack; break;
				case "Orc" : out = LoadResource.orcAttack; break;
				case "Ork" : out = LoadResource.orkAttack; break;
				case "Thief" : out = LoadResource.thiefAttack; break;
				case "Troll1" : out = LoadResource.troll1Attack; break;
				case "Troll2" : out = LoadResource.troll2Attack; break;
				case "WizardFire" : out = LoadResource.wizardFireAttack; break;
				case "WizardLaser" : out = LoadResource.wizardLaserAttack; break;
			}
		} else {
			switch (this.getName()) {
			case "knight1": out = LoadResource.knight1Die; break;
			case "Knight2": out = LoadResource.knight2Die; break;
			case "Knight3": out = LoadResource.knight3Die; break;
			case "Angle": out = LoadResource.angleDie; break;
			case "Fairy" : out = LoadResource.fairyDie; break;
			case "Archer" : out = LoadResource.archerDie; break;
			case "Goblin" : out = LoadResource.goblinDie; break;
			case "Golem" : out = LoadResource.golemDie; break;
			case "Orc" : out = LoadResource.orcDie; break;
			case "Ork" : out = LoadResource.orkDie; break;
			case "Thief" : out = LoadResource.thiefDie; break;
			case "Troll1" : out = LoadResource.troll1Die; break;
			case "Troll2" : out = LoadResource.troll2Die; break;
			case "WizardFire" : out = LoadResource.wizardFireDie; break;
			case "WizardLaser" : out = LoadResource.wizardLaserDie; break;
		}
		}
		return out;
	}
}
