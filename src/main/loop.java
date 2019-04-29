package main;

import javafx.animation.AnimationTimer;

public class Loop {
	public static AnimationTimer timer = new AnimationTimer() {
		
		@Override
		public void handle(long now) {
			// TODO 
//			clear canvas
//			set new canvas
//			render all character
//			render point
//			render energy
		}
	};
	
	public AnimationTimer geTimer() {
		return timer;
	}
}
