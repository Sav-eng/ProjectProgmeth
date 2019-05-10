package model.data;

import constant.Numbers;

public class Time {
	public static int time=0;
	public static int buffATK = 0;
	public static int buffDEF = 0;
	
	public static void updateTime() {
		time++;
		buffATK--;
		buffDEF--;
	}
	public static int getTime() {
		return time;
	}
	
}
