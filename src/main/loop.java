package main;

import javafx.animation.AnimationTimer;

public class Loop {
	public static AnimationTimer timer = new AnimationTimer() {
		int frameCount = 0;

		@Override
		public void handle(long now) {

			if (frameCount % 2 == 0) {
				
				// TODO
//				clear canvas
//				set new canvas
//				render all character
//				render point
//				render energy
//				update money
//				update time
//				update cooldown
			}
			frameCount++;
		}
	};

	public AnimationTimer geTimer() {
		return timer;
	}
}
