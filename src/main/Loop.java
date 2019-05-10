package main;

import javafx.animation.AnimationTimer;
import model.base.AllCharacter;
import model.data.Bot;
import model.data.Player;
import model.data.Time;
import ui.render.AllUpdate;
import ui.render.Render;
import ui.scene.EndScene;


public class Loop {
	public static AnimationTimer timer = new AnimationTimer() {
		int frameCount = 0;

		@Override
		public void handle(long now) {

			if (frameCount % 2 == 0) {
				Time.updateTime();
				if(Time.buffATK==0)AllCharacter.debuffATK();
				if(Time.buffDEF==0)AllCharacter.debuffDEF();
				Render.clearCanvas();
				Player.updateMoney();
				Bot.summon();
				AllCharacter.checkDie();
				AllCharacter.updateCharacter();
				AllUpdate.update();
				Render.render();
				if(Game.getHpEnemyBase() <= 0 || Game.getHpPlayerBase() <=0) {
					if(Game.getHpEnemyBase() <= 0) {
						EndScene win  = new EndScene(true);
						Main.getScene().setRoot(win);
					} else {
						EndScene loss = new EndScene(false);
						Main.getScene().setRoot(loss);
					}
					Loop.timer.stop();
				}
			}
			frameCount++;
		}
	};

	public static AnimationTimer getTimer() {
		return timer;
	}
}
