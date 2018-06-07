package com.tutorial.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class HUD {

	public void tick() {
		
	}
	
	public static void render(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(10, 10, 100, 20);
		g.setColor(Color.green);
		g.fillRect(10, 10, GameRun.health, 20);
		//System.out.println(GameRun.ticks);
		
		g.drawString("Score: " + GameRun.ticks / 100,10, 48);
		g.drawString("Level: " + GameRun.level,10, 64);
		if(!Game.running)g.drawString("gameover: " + GameRun.ticks / 100,10, 88);
	}
}
