package model.base;

import javafx.scene.canvas.GraphicsContext;

public interface IRenderable {
	public int getZ();
	public int getNowX();
	public void draw(GraphicsContext gc);
	public boolean isVisble();
	public boolean isDestroyed();
}
