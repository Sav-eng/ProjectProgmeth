package model.mon;

import constant.Numbers;
import javafx.scene.canvas.GraphicsContext;
import main.Game;
import model.base.Character;
import model.base.Melee;
import model.base.Range;

public class BossMonster extends Character implements Range,Melee{

	private int baseAtk;
	private int baseDef;
	
	public BossMonster(int hp, int atk, int def, int moveSpeed, int range, boolean player) {
		super(hp, atk, def, moveSpeed, range, player);
		baseAtk = atk;
		baseDef = def;
	}

	@Override
	public void deBuffAtk() {
		super.setAtk(baseAtk);
	}

	@Override
	public void defenceBoost() {
		super.setDef((int) (baseDef + baseDef*Numbers.WORLDBUFFAMOUNT*Game.getPhase()));
	}

	@Override
	public void attackBoost() {
		super.setAtk((int) (baseAtk + baseAtk*Numbers.WORLDBUFFAMOUNT*Game.getPhase()));
	}

	@Override
	public void deBuffDef() {
		super.setDef(baseDef);
	}


}
