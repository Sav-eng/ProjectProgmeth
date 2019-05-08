package ui.scene;

import constant.LoadResource;
import constant.Numbers;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;
import main.Loop;
import main.Main;
import ui.hud.MainmenuButton;

public class MainMenuScene extends StackPane {

	private Canvas bg;
	private GraphicsContext gc;
	private VBox menuButton;
	private MainmenuButton playButtonMainmenu;
	private MainmenuButton exitButtonMainmenu;

	public MainMenuScene() {
		super();
		this.setPrefHeight(Numbers.WIN_HEIGHT);
		this.setPrefWidth(Numbers.WIN_WIDTH);

		bg = new Canvas();
		bg.setWidth(Numbers.WIN_WIDTH);
		bg.setHeight(Numbers.WIN_HEIGHT);
		gc = bg.getGraphicsContext2D();
		this.drawBg(gc);
		this.getChildren().add(bg);

		Media pick = new Media(LoadResource.mainMenuSound.getSource());
		MediaPlayer bgm = new MediaPlayer(pick);
		bgm.setOnEndOfMedia(() -> {
			bgm.seek(Duration.ZERO);
		});
		bgm.play();

		menuButton = new VBox();
		menuButton.setPadding(new Insets(10));
		menuButton.setSpacing(40);
		menuButton.setAlignment(Pos.CENTER);

		playButtonMainmenu = new MainmenuButton(LoadResource.playButtonIcon);
		exitButtonMainmenu = new MainmenuButton(LoadResource.exitButtonIcon);

		setMouseEvent(playButtonMainmenu);
		setMouseEvent(exitButtonMainmenu);

		exitButtonMainmenu.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.exit(1);
			}
		});

		// TODO add playButton OnPressEvent (go to game play scene)
		playButtonMainmenu.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Main.getScene().setRoot(Main.getGame1());
				Main.getGame1().setTop(GamePlayScene.getBg());
				Main.getGame1().setBottom(Main.getGame1().getBottomPane());
				bgm.stop();
				Loop.geTimer().start();
			}
		});

		menuButton.getChildren().addAll(playButtonMainmenu, exitButtonMainmenu);

		this.getChildren().add(menuButton);
	}

	public void drawBg(GraphicsContext gc) {
		gc.drawImage(LoadResource.menuBg, 0, 0, Numbers.WIN_WIDTH, Numbers.WIN_HEIGHT);
		gc.drawImage(LoadResource.logo, 500, 50);

	}

	private void setMouseEvent(MainmenuButton butt) {
		butt.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				butt.highlight();
			}
		});

		butt.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				butt.unHighlight();
			}
		});
	}
}