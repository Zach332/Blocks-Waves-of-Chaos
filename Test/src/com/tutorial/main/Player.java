package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject{
	private Color color = Color.white;

	public Player(int x, int y, ID id, int size, Handler h) {
		super(x, y, id, size, h);
	}
	
	public void tick() {
		x = Game.clamp(x + velX, 0, Game.WIDTH - size);
		y = Game.clamp(y + velY, 0, Game.HEIGHT - (22+size));
		for(GameObject o: h.object) {
			if(o.id == ID.Enemy) {
				if(Game.isTouching(this,o) && GameRun.ticks > 99) {GameRun.health = Game.clamp(GameRun.health-1,0,100);color = Color.magenta;}
			}else {color = Color.white;}
		}
	}
	
	public void render(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, size, size);
	}
	

}
