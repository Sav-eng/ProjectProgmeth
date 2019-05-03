package model.mon;

import constant.Numbers;
import main.Game;
import model.base.Character;
import model.base.Range;

public class RangeMonster extends Character implements Range{

	private int baseAttack;
	
	public RangeMonster(String name,int hp, int atk, int def, boolean player, int baseCooldown,int reward) {
		super(name, hp, atk, def, player,baseCooldown, reward);
		baseAttack = atk;
		super.setRange(Numbers.LONG_RANGE);
	}

	@Override
	public void deBuffAtk() {
		super.setAtk(baseAttack);
	}

	@Override
	public void attackBoost() {
		super.setAtk((int) (baseAttack + baseAttack*Numbers.WORLDBUFFAMOUNT*Game.getPhase()));
	}
	
}
