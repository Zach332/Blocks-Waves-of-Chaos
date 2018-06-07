package com.tutorial.main;

import java.awt.Color;

public class GameRun {

	private static int cur = 0;
	private static Handler handler;
	public static int health = 1;
	public static int ticks = 0;
	public static int level = 1;
	
	public GameRun(Handler handler)
	{
		this.handler = handler;
	}
	public static void tick()
	{
		if(GameRun.ticks - cur > 500)
		{
			cur = GameRun.ticks;
			level++;
			if(level == 2) {
				new BasicEnemy(handler);
			}
			if(level == 3)
			{
				new SeekingEnemy(handler);
			}
			if(level == 4)new GenericEnemy(Color.blue,16,10,1,handler);
			if(level == 5)new GenericEnemy(Color.blue,16,1,10,handler);
			if(level==6)new GenericEnemy(Color.pink,36,2,2,handler);
		}
	}
}
