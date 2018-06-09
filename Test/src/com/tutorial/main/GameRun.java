package com.tutorial.main;

import java.awt.Color;

public class GameRun {

	private static int cur = 0;
	private static Handler handler;
	public static int health = 100;
	public static int ticks = 0;
	public static int level = 1;
	public static int startTicks;
	static boolean firstLoad = true;
	public GameRun(Handler handler)
	{
		GameRun.handler = handler;
	}
	public static void tick()
	{
		if(Game.state == Game.State.Start) {
			health = 100;
			ticks = 0;
			level = 1;
			cur=0;
			startTicks++;
			System.out.println(startTicks);
			if(startTicks > 300)
			{
				firstLoad = false;
				Game.state = Game.State.Game;
			}
			if(!firstLoad&&startTicks>100)Game.state = Game.State.Game;
		}
		if(ticks == 1){
			new Player(Game.WIDTH/2,Game.HEIGHT/2,ID.Player, 25,handler);
			new BasicEnemy(handler);
		}
		if(Game.state == Game.State.Game)
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
				if(level==6) {new GenericEnemy(Color.pink,36,2,2,handler);new GenericEnemy(Color.pink,36,2,2,handler);new GenericEnemy(Color.pink,36,2,2,handler);}
				if(level==7){new GenericEnemy(Color.cyan,48,2,1,handler);new GenericEnemy(Color.cyan,48,1,2,handler);new GenericEnemy(Color.pink,36,2,2,handler);new GenericEnemy(Color.pink,36,2,2,handler);}
				if(level==8) {new SeekingEnemy(handler);new GenericEnemy(Color.cyan,48,2,1,handler);new GenericEnemy(Color.cyan,48,1,2,handler);}
				
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
}
