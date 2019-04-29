package model.mon;

import javafx.scene.canvas.GraphicsContext;
import model.base.*;
import model.base.Character;

public class Knight1 extends Character implements Melee{

	public Knight1(int hp, int atk, int def,int moveSpeed) {
		super(hp, atk, def,moveSpeed);
	}

	
	@Override
	public int getNowX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMoveSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void draw(GraphicsContext gc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isVisble() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDestroyed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void defenceBoost() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void renderMove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void renderAttck() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return 0;
	}

}
