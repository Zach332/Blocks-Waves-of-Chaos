package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;

public class GenericEnemy extends GameObject{
	Color color;
	public GenericEnemy(Color color, int size, int velX, int velY, Handler h) {
		super(Game.r.nextInt(Game.WIDTH - 16), Game.r.nextInt(Game.HEIGHT - 38), ID.Enemy, size, h);
		this.velX = velX;
		this.velY = velY;
		this.color = color;
	}

	public void tick() {
		if(x>=Game.WIDTH - size || x<=0)velX *= -1;
		if(y>=Game.HEIGHT - (22+size) || y<=0)velY *= -1;
		x+=velX;
		y+=velY;
	}

	public void render(Graphics g) {
		g.setColor(color);
		g.fillRect(x,y,size,size);
	}
}
