package model.data;

import constant.Numbers;

public class Time {
	public static double time;

	public static void updateTime() {
		time += Numbers.TIMEFRAME;
	}
	public static double getTime() {
		return time;
	}

	public static void setTime(double time) {
		Time.time = time;
	}
	
}
