package main;

import javafx.animation.AnimationTimer;
import model.base.AllCharacter;
import ui.render.AllSpriteUpdate;
import ui.render.RenderSprite;

public class Loop {
	public static AnimationTimer timer = new AnimationTimer() {
		int frameCount = 0;

		@Override
		public void handle(long now) {

			if (frameCount % 2 == 0) {
				
				// TODO
//				clear canvas
				RenderSprite.clearCanvas();
//				set new canvas
				//update all data
				AllCharacter.updateCharacter();
//				//update money
				//update time
				AllSpriteUpdate.update();
				//render character
				RenderSprite.render();
				//render cooldown
				
			}
			frameCount++;
		}
	};

	public AnimationTimer geTimer() {
		return timer;
	}
}
