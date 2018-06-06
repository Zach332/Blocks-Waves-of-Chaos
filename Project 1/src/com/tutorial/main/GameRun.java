package com.tutorial.main;

public class GameRun {

	private static int cur = 0;
	private static Handler handler;
	public static int health = 100;
	public static int ticks = 0;
	public static int level = 0;
	
	public GameRun(Handler handler)
	{
		this.handler = handler;
	}
	public static void tick()
	{
		if(GameRun.ticks - cur > 500)
		{
			new BasicEnemy(handler);
			cur = GameRun.ticks;
			level++;
		}
	}
}
