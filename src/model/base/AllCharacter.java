package model.base;

import java.util.ArrayList;
import java.util.List;

public class AllCharacter {
	List<Character> allCharacters;
	
	public AllCharacter() {
		allCharacters = new ArrayList<Character>();
		
	}
	
	public void addCharacter(Character x) {
		allCharacters.add(x);
	}
	
	public void renderCharacter() {
		for(Character x: allCharacters) {
			x.render();
		}
	}
	
	public void update() {
		for (int i = allCharacters.size()-1; i>=0 ;i--) {
			if(allCharacters.get(i).isDestroyed()) {
				allCharacters.remove(i);
			}
		}
	}
}
