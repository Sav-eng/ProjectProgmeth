package model.mon;

import constant.Numbers;
import main.Game;
import model.base.Character;
import model.base.Melee;

public class MeleeMonster extends Character implements Melee{

	private int baseDef;
	public MeleeMonster(String name,int hp, int atk, int def, boolean player,int baseCooldown,int reward) {
		super(name, hp, atk, def , player, baseCooldown,reward);
		super.setRange(Numbers.MELEE_RANGE);
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
