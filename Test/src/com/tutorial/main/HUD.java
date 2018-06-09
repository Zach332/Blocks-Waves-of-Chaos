package com.tutorial.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class HUD {

	public void tick() {
		
	}
	
	public static void render(Graphics g) {
		if(Game.state == Game.State.Start) {
			g.setColor(Color.red);
			g.setFont(new Font("arial", 1,60));
			g.drawString("BLOCKS", Game.WIDTH/2-110, 100);
			g.fillRect(Game.WIDTH/4 -60, 30, 60, 60);
			g.fillRect(Game.WIDTH/4+Game.WIDTH/2+30, 30, 60, 60);
			g.setColor(Color.white);
			g.setFont(new Font("arial", 1,30));
			g.drawString("Waves of Chaos", Game.WIDTH/2-100, 200);
		}
		if(Game.state == Game.State.Stop || Game.state == Game.State.Game)
		{
			g.setColor(Color.gray);
			g.fillRect(10, 10, 100, 20);
			g.setColor(Color.green);
			g.fillRect(10, 10, GameRun.health, 20);
			g.drawString("Score: " + GameRun.ticks / 100,10, 48);
			g.drawString("Level: " + GameRun.level,10, 64);
			//System.out.println(GameRun.ticks);
		}
		
		
		if(Game.state == Game.State.Stop)
		{
			g.setColor(Color.red);
			g.fillRect(Game.WIDTH/2 - 50,Game.HEIGHT/2 - 70,180,40);
			g.setColor(Color.green);
			g.fillRect(Game.WIDTH/2 - 150,Game.HEIGHT/2 +40,380,40);
			g.setColor(Color.white);
			g.setFont(new Font("arial",1,30));
			g.drawString("Game Over", Game.WIDTH/2-45, Game.HEIGHT/2-40);
			g.setColor(Color.black);
			g.drawString("Press Enter to play again", Game.WIDTH/2-145, Game.HEIGHT/2+70);
		}
	}
}
