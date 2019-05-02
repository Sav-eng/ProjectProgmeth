package model.mon;

import constant.Numbers;
import javafx.scene.canvas.GraphicsContext;
import main.Game;
import model.base.Character;
import model.base.Melee;
import model.base.Range;

public class HeroMonster extends Character implements Range,Melee{

	private int baseAtk;
	private int baseDef;
	
	public HeroMonster(String name,int hp, int atk, int def, int moveSpeed, int range, boolean player,int baseCooldown,int reward) {
		super(name, hp, atk, def, moveSpeed, range, player,baseCooldown,reward);
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
