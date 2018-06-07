package com.tutorial.main;

import java.awt.Color;

public class GameRun {

	private static int cur = 0;
	private static Handler handler;
	public static int health = 100;
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
				new BasicEnemy(handler);
				new BasicEnemy(handler);
			}
			
			if(level == 3)
			{
				
				new SeekingEnemy(handler);
			}
			if(level == 4) {new GenericEnemy(Color.blue,16,10,1,handler);new GenericEnemy(Color.blue,16,1,10,handler);}
			if(level == 5) {new BasicEnemy(handler);new BasicEnemy(handler);}
			if(level==6)new GenericEnemy(Color.pink,36,2,2,handler);
			if(level==7)new GenericEnemy(Color.pink,36,2,2,handler);
			if(level==8)new SeekingEnemy(handler);
			
			if(level==10) {
				health = 100;
				for(int i = 0; i < handler.object.size();i++)
				{
					if(handler.object.get(i).id != ID.Player)
					{
						handler.removeObject(handler.object.get(i));
						i--;
					}
				}
				new SeekingEnemy(handler);
				new Boss(Game.WIDTH/2,3,handler);
			}
			if(level==12)
			{
				new Boss(Game.WIDTH/4,2,handler);
				new Boss(Game.WIDTH/4 + Game.WIDTH/2,2,handler);
			}
			if(level==15)
			{
				for(int i = 0; i < handler.object.size();i++)
				{
					if(handler.object.get(i).id != ID.Player)
					{
						handler.removeObject(handler.object.get(i));
						i--;
					}
				}
				new SeekingEnemy(handler);
			}
			if(level==16||level==17)
			{
				new GenericEnemy(Color.RED,Game.r.nextInt(80)+1,Game.r.nextInt(9),Game.r.nextInt(9),handler);
			}
			if(level>=16)
			{
				new GenericEnemy(Color.RED,Game.r.nextInt(80)+1,Game.r.nextInt(9),Game.r.nextInt(9),handler);
			}
			
		}
	}
}
