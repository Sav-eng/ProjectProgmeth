package model.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import constant.LoadResource;

public class RenderableHolder {
	private List<IRenderable> entities;
	
	static {
		LoadResource.loadResource();
	}
	
	public void update() {
		for (int i = entities.size()-1; i>=0 ;i--) {
			if(entities.get(i).isDestroyed()) {
				entities.remove(i);
			}
		}
	}
}
