package main;

import javafx.animation.AnimationTimer;
import model.base.AllCharacter;
import model.data.Bot;
import model.data.Player;
import ui.render.AllUpdate;
import ui.render.Render;


public class Loop {
	public static AnimationTimer timer = new AnimationTimer() {
		int frameCount = 0;

		@Override
		public void handle(long now) {

			if (frameCount % 2 == 0) {
				
				Render.clearCanvas();
				Player.updateMoney();
				Bot.summon();
				AllCharacter.updateCharacter();
				AllUpdate.update();
				Render.render();
				
			}
			frameCount++;
		}
	};

	public static AnimationTimer geTimer() {
		return timer;
	}
}
