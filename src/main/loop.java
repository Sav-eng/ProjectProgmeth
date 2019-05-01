package main;

import javafx.animation.AnimationTimer;
import model.base.AllCharacter;

public class Loop {
	public static AnimationTimer timer = new AnimationTimer() {
		int frameCount = 0;

		@Override
		public void handle(long now) {

			if (frameCount % 2 == 0) {
				
				// TODO
//				clear canvas
//				set new canvas
				//update all data
				AllCharacter.updateCharacter();
//				//update money
				//update time
				//render character
				//render cooldown
				
			}
			frameCount++;
		}
	};

	public AnimationTimer geTimer() {
		return timer;
	}
}
