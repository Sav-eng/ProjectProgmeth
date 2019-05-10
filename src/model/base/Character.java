package model.base;

import constant.LoadResource;
import constant.Numbers;
import javafx.scene.image.Image;
import main.Game;
import model.data.Player;

public class Character {
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
	private int reward;

	public Character(String name, int hp, int atk, int def, boolean player, int baseCooldown, int reward) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.moveSpeed = Numbers.CHA_MOVESPD;
		if (player)
			this.x = Numbers.POSITION_PLAYER;
		else
			this.x = Numbers.POSITION_ENEMY;
		this.player = player;
		this.baseCooldown = baseCooldown;
		this.reward = reward;
		pastDoing = -1;
		cooldown = 0;
	}

	public void move() {
		cooldown = 0;
		//System.out.println("FUCK");
		if (player)
			x += moveSpeed;
		else
			x -= moveSpeed;
	}

	public boolean isCooldown() {
		return cooldown > 0;
	}

	public void decreaseCooldown() {
		cooldown--;
	}

	public void update() {
		pastDoing = doing;
		if (!isCooldown() && canAttack() && doing != 4) {
			doing = 2;
			//System.out.println(cooldown);
		} else if (!isCooldown() && canAttackBase() && doing != 4) {
			doing = 3;
			//System.out.println(cooldown);
		} else if (isCooldown() && ( canAttack()|| canAttackBase())) {
			decreaseCooldown();
		} else if (canMove()) {
			this.move();
			doing = 1;
//			System.out.println(this.name + "is Moving");
		} 
		//System.out.println(sprite);
		//System.out.println(cooldown);
	}

	public void attackBase() {
		if (this.player) {
			Game.setHpEnemyBase(Game.getHpEnemyBase() - atk);
		} else {
			Game.setHpPlayerBase(Game.getHpPlayerBase() - atk);
		}
		cooldown = baseCooldown;
		System.out.println(cooldown);
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
		// System.out.println(this.player);
		if (player) {
			pos = AllCharacter.getPlayer().indexOf(this);
			if (pos >= 1) {
				if (AllCharacter.getPlayer().get(pos - 1) != null && Math
						.abs(this.getX() - AllCharacter.getPlayer().get(pos - 1).getX()) >= Numbers.SPACINGCHARACTER) {
					return true;
				}
			} else if (!canAttack() && !canAttackBase())
				return true;
		} else {
			pos = AllCharacter.getEnemy().indexOf(this);
			if (pos >= 1) {
				if (AllCharacter.getEnemy().get(pos - 1) != null && Math
						.abs(this.getX() - AllCharacter.getEnemy().get(pos - 1).getX()) >= Numbers.SPACINGCHARACTER) {
					return true;
				}
			} else if (!canAttack() && !canAttackBase()) {
				return true;
			}

		}
		return false;
	}

	private boolean canAttack() {
		Character enemy;
		if (player) {
			if (AllCharacter.getEnemy().size() > 0)
				enemy = AllCharacter.getFirstEnemy();
			else
				enemy = null;
		} else {
			if (AllCharacter.getPlayer().size() > 0)
				enemy = AllCharacter.getFirstPlayer();
			else
				enemy = null;
		}
		if (enemy == null)
			return false;
		if (Math.abs(enemy.getX() - this.x) <= this.range) {
			return true;
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
		System.out.println(enemy.getName() + ":"+ enemy.getHp());
		if (enemy.getHp() <= 0) {
			if (isPlayer())
				Player.setMoney(Player.getMoney() + enemy.reward);
			enemy.doing = 4;
			doing = 1;
		}
	}

	public void die() {
		if (this.player) {
			AllCharacter.getPlayer().remove(0);
		} else {
			AllCharacter.getEnemy().remove(0);
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
		if (this.getDoing() == 1 || this.getDoing() == 0) {
			switch (this.getName()) {
			case "Knight1":
				out = LoadResource.knight1Walk;
				break;
			case "Knight2":
				out = LoadResource.knight2Walk;
				break;
			case "Knight3":
				out = LoadResource.knight3Walk;
				break;
			case "Angle":
				out = LoadResource.angleWalk;
				break;
			case "Fairy":
				out = LoadResource.fairyWalk;
				break;
			case "Archer":
				out = LoadResource.archerWalk;
				break;
			case "Goblin":
				out = LoadResource.goblinWalk;
				break;
			case "Golem":
				out = LoadResource.golemWalk;
				break;
			case "Orc":
				out = LoadResource.orcWalk;
				break;
			case "Ork":
				out = LoadResource.orkWalk;
				break;
			case "Thief":
				out = LoadResource.thiefWalk;
				break;
			case "Troll1":
				out = LoadResource.troll1Walk;
				break;
			case "Troll2":
				out = LoadResource.troll2Walk;
				break;
			case "WizardFire":
				out = LoadResource.wizardFireWalk;
				break;
			case "WizardLaser":
				out = LoadResource.wizardLaserWalk;
				break;
			}
		} else if (this.getDoing() == 2 || this.getDoing() == 3) {
			switch (this.getName()) {
			case "Knight1":
				out = LoadResource.knight1Attack;
				break;
			case "Knight2":
				out = LoadResource.knight2Attack;
				break;
			case "Knight3":
				out = LoadResource.knight3Attack;
				break;
			case "Angle":
				out = LoadResource.angleAttack;
				break;
			case "Fairy":
				out = LoadResource.fairyAttack;
				break;
			case "Archer":
				out = LoadResource.archerAttack;
				break;
			case "Goblin":
				out = LoadResource.goblinAttack;
				break;
			case "Golem":
				out = LoadResource.golemAttack;
				break;
			case "Orc":
				out = LoadResource.orcAttack;
				break;
			case "Ork":
				out = LoadResource.orkAttack;
				break;
			case "Thief":
				out = LoadResource.thiefAttack;
				break;
			case "Troll1":
				out = LoadResource.troll1Attack;
				break;
			case "Troll2":
				out = LoadResource.troll2Attack;
				break;
			case "WizardFire":
				out = LoadResource.wizardFireAttack;
				break;
			case "WizardLaser":
				out = LoadResource.wizardLaserAttack;
				break;
			}
		} else if (this.doing == 4) {
			switch (this.getName()) {
			case "Knight1":
				out = LoadResource.knight1Die;
				break;
			case "Knight2":
				out = LoadResource.knight2Die;
				break;
			case "Knight3":
				out = LoadResource.knight3Die;
				break;
			case "Angle":
				out = LoadResource.angleDie;
				break;
			case "Fairy":
				out = LoadResource.fairyDie;
				break;
			case "Archer":
				out = LoadResource.archerDie;
				break;
			case "Goblin":
				out = LoadResource.goblinDie;
				break;
			case "Golem":
				out = LoadResource.golemDie;
				break;
			case "Orc":
				out = LoadResource.orcDie;
				break;
			case "Ork":
				out = LoadResource.orkDie;
				break;
			case "Thief":
				out = LoadResource.thiefDie;
				break;
			case "Troll1":
				out = LoadResource.troll1Die;
				break;
			case "Troll2":
				out = LoadResource.troll2Die;
				break;
			case "WizardFire":
				out = LoadResource.wizardFireDie;
				break;
			case "WizardLaser":
				out = LoadResource.wizardLaserDie;
				break;
			}
		}
		return out;
	}

}
