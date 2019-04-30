package constant;

import javafx.scene.image.Image;

public class LoadResource {
	
	private static double progress = 0;
	
	public static Image wizardFireIcon; 
	public static Image knight1Icon;
	public static Image thiefIcon;
	public static Image archerIcon;
	public static Image knight2Icon;
	public static Image knight3Icon;
	public static Image wizardLaserIcon;
	public static Image goblinIcon;
	public static Image golemIcon;
	public static Image orcIcon;
	public static Image troll1Icon;
	public static Image troll2Icon;
	public static Image orkIcon;
	public static Image angleIcon;
	public static Image fairyIcon;
	public static Image menuBg;
	public static Image playButtonIcon;
	public static Image exitButtonIcon;
	
	public static Image[] wizardFireWalk = new Image[5];
	public static Image[] wizardFireDie = new Image[5] ;
	public static Image[] wizardFireAttack = new Image[5] ;
	public static Image[] knight1Walk = new Image[7];
	public static Image[] knight1Die = new Image[7];
	public static Image[] knight1Attack = new Image[8];
	public static Image[] knight2Walk = new Image[7];
	public static Image[] knight2Die = new Image[7];
	public static Image[] knight2Attack = new Image[7];
	public static Image[] knight3Walk = new Image[7];
	public static Image[] knight3Die = new Image[7];
	public static Image[] knight3Attack = new Image[7];
	public static Image[] thiefWalk = new Image[5];
	public static Image[] thiefDie = new Image[5];
	public static Image[] thiefAttack = new Image[5];
	public static Image[] archerWalk = new Image[5];
	public static Image[] archerDie = new Image[5];
	public static Image[] archerAttack = new Image[5];
	public static Image[] wizardLaserWalk = new Image[5];
	public static Image[] wizardLaserDie = new Image[5];
	public static Image[] wizardLaserAttack = new Image[5];
	public static Image[] laser = new Image[3];
	public static Image[] goblinWalk = new Image[12];
	public static Image[] goblinDie = new Image[15];
	public static Image[] goblinAttack = new Image[12];
	public static Image[] golemWalk = new Image[12];
	public static Image[] golemDie = new Image[15];
	public static Image[] golemAttack = new Image[12];
	public static Image[] orcWalk = new Image[12];
	public static Image[] orcDie = new Image[15];
	public static Image[] orcAttack = new Image[12];
	public static Image[] troll1Walk = new Image[7];
	public static Image[] troll1Die = new Image[7];
	public static Image[] troll1Attack = new Image[7];
	public static Image[] troll2Walk = new Image[7];
	public static Image[] troll2Die = new Image[7];
	public static Image[] troll2Attack = new Image[7];
	public static Image[] orkWalk = new Image[7];
	public static Image[] orkDie = new Image[7];
	public static Image[] orkAttack = new Image[7];
	public static Image[] angleWalk = new Image[12];
	public static Image[] angleDie = new Image[15];
	public static Image[] angleAttack = new Image[12];
	public static Image[] fairyWalk = new Image[5];
	public static Image[] fairyDie = new Image[5];
	public static Image[] fairyAttack = new Image[5];
		
	public static void loadResource() {
		
//		setProgress(0);
		for(int i=0;i<5;i++) {
			wizardFireWalk[i] = loadImage("Wizard_fire/walk/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			wizardFireDie[i] = loadImage("Wizard_fire/die/" + (i+1) + ".png" , Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			wizardFireAttack[i] = loadImage("Wizard_fire/attack/" + (i+1) + ".png" , Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for(int i=0;i<7;i++) {
			knight1Walk[i] = loadImage("Knight_1/walk/" + (i+1) + ".png" , Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			knight1Attack[i] = loadImage("Knight_1/die/" + (i+1) + ".png" , Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			knight1Die[i] = loadImage("Knight_1/attack/" + (i+1) + ".png" , Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		knight1Attack[7] = loadImage("Knight_1/attack/8.png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		for(int i=0;i<7;i++) {
			knight2Walk[i] = loadImage("Knight_2/walk/" + (i+1) + ".png" , Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			knight2Attack[i] = loadImage("Knight_2/die/" + (i+1) + ".png" , Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			knight2Die[i] = loadImage("Knight_2/attack/" + (i+1) + ".png" , Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for(int i=0;i<7;i++) {
			knight3Walk[i] = loadImage("Knight_3/walk/" + (i+1) + ".png" , Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			knight3Attack[i] = loadImage("Knight_3/die/" + (i+1) + ".png" , Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			knight3Die[i] = loadImage("Knight_3/attack/" + (i+1) + ".png" , Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for(int i=0;i<5;i++) {
			thiefAttack[i] = loadImage("Thief/attack/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			thiefWalk[i] = loadImage("Thief/walk/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			thiefDie[i] = loadImage("Thief/die/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for(int i=0;i<5;i++) {
			archerAttack[i] = loadImage("Archer/attack/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			archerWalk[i] = loadImage("Archer/walk/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			archerDie[i] = loadImage("Archer/die/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for(int i=0;i<5;i++) {
			wizardLaserAttack[i] = loadImage("Wizard_laser/attack/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			wizardLaserDie[i] = loadImage("Wizard_laser/walk/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			wizardLaserWalk[i] = loadImage("Wizard_laser/die/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for(int i=0;i<3;i++) {
			archerAttack[i] = loadImage("Wizard_laser/laser/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for(int i=0;i<12;i++) {
			goblinAttack[i] = loadImage("Goblin/attack/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			goblinDie[i] = loadImage("Goblin/die/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			goblinWalk[i] = loadImage("Goblin/walk/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for(int i=12;i<15;i++) {
			goblinDie[i] = loadImage("Goblin/die/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for(int i=0;i<12;i++) {
			golemAttack[i] = loadImage("Golem/attack/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			golemDie[i] = loadImage("Golem/die/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			golemWalk[i] = loadImage("Golem/walk/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for(int i=12;i<15;i++) {
			golemDie[i] = loadImage("Golem/die/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for(int i=0;i<12;i++) {
			orcAttack[i] = loadImage("Orc/attack/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			orcDie[i] = loadImage("Orc/die/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			orcWalk[i] = loadImage("Orc/walk/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for(int i=12;i<15;i++) {
			orcDie[i] = loadImage("Orc/die/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for(int i=0;i<7;i++) {
			troll1Attack[i] = loadImage("Troll_1/attack/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			troll1Die[i] = loadImage("Troll_1/die/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			troll1Walk[i] = loadImage("Troll_1/walk/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for(int i=0;i<7;i++) {
			troll2Attack[i] = loadImage("Troll_2/attack/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			troll2Die[i] = loadImage("Troll_2/die/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			troll2Walk[i] = loadImage("Troll_2/walk/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for(int i=0;i<7;i++) {
			orkAttack[i] = loadImage("Ork/attack/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			orkDie[i] = loadImage("Ork/die/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			orkWalk[i] = loadImage("Ork/walk/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for(int i=0;i<12;i++) {
			angleAttack[i] = loadImage("Angle/attack/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			angleDie[i] = loadImage("Angle/die/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			angleWalk[i] = loadImage("Angle/walk/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for(int i=12;i<15;i++) {
			angleDie[i] = loadImage("Angle/die/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for(int i=0;i<5;i++) {
			fairyAttack[i] = loadImage("Fairy/attack/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			fairyDie[i] = loadImage("Fairy/die/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			fairyWalk[i] = loadImage("Fairy/walk/" + (i+1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		menuBg = loadImage("Other/mainBg.jpg", Numbers.WIN_WIDTH, Numbers.WIN_HEIGHT);
		playButtonIcon = loadImage("Other/playButton.png", 100, 50);
		exitButtonIcon = loadImage("Other/exitButton.png", 100, 50);
		
//		setProgress(0.1);
//		setProgress(0.2);
//		setProgress(0.3);
//		setProgress(0.4);
//		setProgress(0.5);
//		setProgress(0.6);
//		setProgress(0.7);
//		setProgress(0.8);
//		setProgress(0.9);
//		setProgress(1.0);
	}
	
	public static void setProgress(double progress) {
		LoadResource.progress = progress;
	}
	
	public static Image loadImage(String path, double width, double height){
        return new Image(ClassLoader.getSystemResourceAsStream(path), width, height, true, true);
    }
}
