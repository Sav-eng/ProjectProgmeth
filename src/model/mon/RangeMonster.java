package model.mon;

import constant.Numbers;
import main.Game;
import model.base.Character;
import model.base.Range;

public class RangeMonster extends Character implements Range{

	private int baseAttack;
	
	public RangeMonster(int hp, int atk, int def, int moveSpeed, int range, boolean player) {
		super(hp, atk, def, moveSpeed, range, player);
		baseAttack = atk;
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
