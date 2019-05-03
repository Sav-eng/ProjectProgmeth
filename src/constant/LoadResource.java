package constant;

import javafx.scene.image.Image;

public class LoadResource {

	private static int progress = 0;

	public static Image wizardFireIcon;
	public static Image knight1Icon;
	public static Image thiefIcon;
	public static Image archerIcon;
	public static Image knight2Icon;
	public static Image knight3Icon;
	public static Image wizardLaserIcon;
	public static Image angleIcon;
	public static Image fairyIcon;
	public static Image menuBg;
	public static Image playButtonIcon;
	public static Image exitButtonIcon;
	public static Image logo;
	public static Image rateUp;
	public static Image levelUp;
	public static Image atkUp;
	public static Image defUp;
	public static Image rateUpCd;
	public static Image levelUpCd;
	public static Image atkUpCd;
	public static Image defUpCd;
	public static Image world1Bg;
	public static Image world2Bg;
	public static Image world1Base;
	public static Image world2Base;
	public static Image enerymyBase;
	
	public static Image[] wizardFireWalk = new Image[5];
	public static Image[] wizardFireDie = new Image[5];
	public static Image[] wizardFireAttack = new Image[5];
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
	public static Image[] ice = new Image[5];
	
	
	
	public static void loadResource() {

		setProgress(1);
		for (int i = 0; i < 5; i++) {
			wizardFireWalk[i] = loadImage("Wizard_fire/walk/" + (i + 1) + ".png", Numbers.CHA_WIDTH,
					Numbers.CHA_HEIGHT);
			wizardFireDie[i] = loadImage("Wizard_fire/die/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			wizardFireAttack[i] = loadImage("Wizard_fire/attack/" + (i + 1) + ".png", Numbers.CHA_WIDTH,
					Numbers.CHA_HEIGHT);
		}
		for (int i = 0; i < 7; i++) {
			knight1Walk[i] = loadImage("Knight_1/walk/" + (i + 1) + ".png", Numbers.KNIGHT1_WIDTH, Numbers.CHA_HEIGHT);
			knight1Attack[i] = loadImage("Knight_1/die/" + (i + 1) + ".png", Numbers.KNIGHT1_WIDTH, Numbers.CHA_HEIGHT);
			knight1Die[i] = loadImage("Knight_1/attack/" + (i + 1) + ".png", Numbers.KNIGHT1_WIDTH, Numbers.CHA_HEIGHT);
		}
		knight1Attack[7] = loadImage("Knight_1/attack/8.png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		for (int i = 0; i < 7; i++) {
			knight2Walk[i] = loadImage("Knight_2/walk/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			knight2Attack[i] = loadImage("Knight_2/die/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			knight2Die[i] = loadImage("Knight_2/attack/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for (int i = 0; i < 7; i++) {
			knight3Walk[i] = loadImage("Knight_3/walk/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			knight3Attack[i] = loadImage("Knight_3/die/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			knight3Die[i] = loadImage("Knight_3/attack/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for (int i = 0; i < 5; i++) {
			thiefAttack[i] = loadImage("Thief/attack/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			thiefWalk[i] = loadImage("Thief/walk/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			thiefDie[i] = loadImage("Thief/die/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for (int i = 0; i < 5; i++) {
			archerAttack[i] = loadImage("Archer/attack/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			archerWalk[i] = loadImage("Archer/walk/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			archerDie[i] = loadImage("Archer/die/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for (int i = 0; i < 5; i++) {
			wizardLaserAttack[i] = loadImage("Wizard_laser/attack/" + (i + 1) + ".png", Numbers.CHA_WIDTH,
					Numbers.CHA_HEIGHT);
			wizardLaserDie[i] = loadImage("Wizard_laser/walk/" + (i + 1) + ".png", Numbers.CHA_WIDTH,
					Numbers.CHA_HEIGHT);
			wizardLaserWalk[i] = loadImage("Wizard_laser/die/" + (i + 1) + ".png", Numbers.CHA_WIDTH,
					Numbers.CHA_HEIGHT);
		}
		for (int i = 0; i < 3; i++) {
			laser[i] = loadImage("Wizard_laser/laser/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for (int i = 0; i < 12; i++) {
			goblinAttack[i] = loadImage("Goblin/attack/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			goblinDie[i] = loadImage("Goblin/die/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			goblinWalk[i] = loadImage("Goblin/walk/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for (int i = 12; i < 15; i++) {
			goblinDie[i] = loadImage("Goblin/die/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for (int i = 0; i < 12; i++) {
			golemAttack[i] = loadImage("Golem/attack/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			golemDie[i] = loadImage("Golem/die/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			golemWalk[i] = loadImage("Golem/walk/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for (int i = 12; i < 15; i++) {
			golemDie[i] = loadImage("Golem/die/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for (int i = 0; i < 12; i++) {
			orcAttack[i] = loadImage("Orc/attack/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			orcDie[i] = loadImage("Orc/die/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			orcWalk[i] = loadImage("Orc/walk/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for (int i = 12; i < 15; i++) {
			orcDie[i] = loadImage("Orc/die/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for (int i = 0; i < 7; i++) {
			troll1Attack[i] = loadImage("Troll_1/attack/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			troll1Die[i] = loadImage("Troll_1/die/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			troll1Walk[i] = loadImage("Troll_1/walk/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for (int i = 0; i < 7; i++) {
			troll2Attack[i] = loadImage("Troll_2/attack/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			troll2Die[i] = loadImage("Troll_2/die/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			troll2Walk[i] = loadImage("Troll_2/walk/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for (int i = 0; i < 7; i++) {
			orkAttack[i] = loadImage("Ork/attack/" + (i + 1) + ".png", Numbers.ORK_WIDTH, Numbers.BOSS_HEIGHT);
			orkDie[i] = loadImage("Ork/die/" + (i + 1) + ".png", Numbers.ORK_WIDTH, Numbers.BOSS_HEIGHT);
			orkWalk[i] = loadImage("Ork/walk/" + (i + 1) + ".png", Numbers.ORK_WIDTH, Numbers.BOSS_HEIGHT);
		}
		for (int i = 0; i < 12; i++) {
			angleAttack[i] = loadImage("Angle/attack/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			angleDie[i] = loadImage("Angle/die/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			angleWalk[i] = loadImage("Angle/walk/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for (int i = 12; i < 15; i++) {
			angleDie[i] = loadImage("Angle/die/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for (int i = 0; i < 5; i++) {
			fairyAttack[i] = loadImage("Fairy/attack/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			fairyDie[i] = loadImage("Fairy/die/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
			fairyWalk[i] = loadImage("Fairy/walk/" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		for(int i=0;i<5;i++) {
			ice[i] = loadImage("Ice/Ice" + (i + 1) + ".png", Numbers.CHA_WIDTH, Numbers.CHA_HEIGHT);
		}
		menuBg = loadImage("Other/mainBg.jpg", Numbers.WIN_WIDTH, Numbers.WIN_HEIGHT);
		playButtonIcon = loadImage("Other/playButton.png", 100, 50);
		exitButtonIcon = loadImage("Other/exitButton.png", 100, 50);
		logo = loadImage("Other/Logo.png", 700, 100);
		wizardFireIcon = loadImage("Icon/WizardFire.png", 100, 100);
		knight1Icon = loadImage("Icon/Knight1.png", 100, 100);
		thiefIcon = loadImage("Icon/Thief.png", 100, 100);
		archerIcon = loadImage("Icon/Archer.png", 100, 100);
		knight2Icon = loadImage("Icon/Knight2.png", 100, 100);
		knight3Icon = loadImage("Icon/Knight3.png", 100, 100);
		wizardLaserIcon = loadImage("Icon/WizardLaser.png", 100, 100);
		angleIcon = loadImage("Icon/Angle.png", 100, 100);
		fairyIcon = loadImage("Icon/Fairy.png", 100, 100);
		rateUp = loadImage("Other/energyRateBlue.png", 100, 100);
		levelUp = loadImage("Other/upgradeIcon.png", 100, 100);
		atkUp = loadImage("Other/atkUpRed.png", 100, 100);
		defUp = loadImage("Other/shieldUpRed.png", 100, 100);
		rateUpCd = loadImage("Other/energyRate.png", 100, 100);
		levelUpCd = loadImage("Other/upgrade.png", 100, 100);
		atkUpCd = loadImage("Other/atkUpBlack.png", 100, 100);
		defUpCd = loadImage("Other/shieldUpBlack.png", 100, 100);
		world1Bg = loadImage("Other/world1.jpg", Numbers.WIN_WIDTH, Numbers.WIN_HEIGHT);
		world2Bg = loadImage("Other/world2.jpg", Numbers.WIN_WIDTH, Numbers.WIN_HEIGHT);
		world1Base = loadImage("Other/base1Fliped.png", Numbers.BASE_WIDTH, Numbers.BASE_HEIGHT);
		enerymyBase = loadImage("Other/enermyBaseFlip.png", Numbers.BASE_WIDTH, Numbers.BASE_HEIGHT);
		
		setProgress(1);
		setProgress(2);
		setProgress(3);
		setProgress(4);
		setProgress(5);
		setProgress(6);
		setProgress(7);
		setProgress(8);
		setProgress(9);
		setProgress(10);
	}

	public static void setProgress(int progress) {
		LoadResource.progress = progress;
	}

	public static int getProgress() {
		return progress;
	}
	public static Image loadImage(String path, double width, double height) {
		return new Image(ClassLoader.getSystemResourceAsStream(path), width, height, false, true);
	}
}
