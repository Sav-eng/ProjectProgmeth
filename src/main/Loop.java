package main;

import javafx.animation.AnimationTimer;
import model.base.AllCharacter;
<<<<<<< HEAD
import model.data.Player;
import ui.hud.RateButton;
import ui.render.AllSpriteUpdate;
import ui.render.RenderSprite;
||||||| merged common ancestors
import ui.render.AllSpriteUpdate;
import ui.render.RenderSprite;
=======
import model.data.Player;
import ui.render.AllUpdate;
import ui.render.Render;
>>>>>>> 9f8471a8d22a92597888091484437306fb39a627

public class Loop {
	public static AnimationTimer timer = new AnimationTimer() {
		int frameCount = 0;

		@Override
		public void handle(long now) {

			if (frameCount % 2 == 0) {
				
				Render.clearCanvas();
//				set new canvas
				//update all data
				Player.updateMoney();
				AllCharacter.updateCharacter();
//				//update money
				//update time
				AllUpdate.update();
				//render character
				Render.render();
				//render cooldown
				//update money
				
			}
			frameCount++;
		}
	};

	public static AnimationTimer geTimer() {
		return timer;
	}
}
