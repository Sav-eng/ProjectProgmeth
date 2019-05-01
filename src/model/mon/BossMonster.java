package model.mon;

import javafx.scene.canvas.GraphicsContext;
import model.base.Character;

public class BossMonster extends Character {

	@Override
	public int getZ() {
		super.getZ();
		return 0;
	}

	@Override
	public int getNowX() {
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

}
