package model.mon;

import constant.Numbers;
import main.Game;
import model.base.Character;
import model.base.Melee;

public class MeleeMonster extends Character implements Melee{

	private int baseDef;
	public MeleeMonster(String name,int hp, int atk, int def, int moveSpeed,int range, boolean player,int baseCooldown) {
		super(name, hp, atk, def, moveSpeed , range , player, baseCooldown);
		baseDef = def;
	}
	@Override
	public void defenceBoost() {
		super.setDef((int) (baseDef + baseDef*(Numbers.WORLDBUFFAMOUNT)*Game.getPhase()));
	}
	
	public void deBuffDef() {
		super.setDef(baseDef);
	}
	
}
