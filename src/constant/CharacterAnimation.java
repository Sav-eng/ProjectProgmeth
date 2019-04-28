package constant;

import java.util.ArrayList;
import java.util.Arrays;

import javafx.scene.image.Image;

public class CharacterAnimation {
	static final ArrayList<Image> wizardFire_Die = (ArrayList<Image>) Arrays.asList(loadImage("/res/Wizard_fire/die/7_DIE_000.png",60,60),
			loadImage("/res/Wizard_fire/die/7_DIE_003.png",60,60),loadImage("/res/Wizard_fire/die/7_DIE_007.png",60,60),loadImage("/res/Wizard_fire/die/7_DIE_009.png",60,60),
			loadImage("/res/Wizard_fire/die/7_DIE_014.png",60,60));
	static final ArrayList<Image> wizardFire_Walk = (ArrayList<Image>) Arrays.asList(loadImage("/res/Wizard_fire/walk/2_WALK_000.png",60,60),
			loadImage("/res/Wizard_fire/walk/2_WALK_001.png",60,60),loadImage("/res/Wizard_fire/walk/2_WALK_002.png",60,60),loadImage("/res/Wizard_fire/walk/2_WALK_003.png",60,60),
			loadImage("/res/Wizard_fire/walk/2_WALK_004.png",60,60));
	
	public static Image loadImage(String path, double width, double height){
        return new Image(ClassLoader.getSystemResource(path).toString(), width, height, true, true);
    }
}
