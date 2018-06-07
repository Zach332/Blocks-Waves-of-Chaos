package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;

public class BasicEnemy extends GameObject{

	public BasicEnemy(Handler h) {
		super(Game.r.nextInt(Game.WIDTH - 16), Game.r.nextInt(Game.HEIGHT - 38), ID.Enemy, 16, h);
		velX = 6;
		velY = 6;
	}

	public void tick() {
		if(x>=Game.WIDTH - size || x<=0)velX *= -1;
		if(y>=Game.HEIGHT - (22+size) || y<=0)velY *= -1;
		x+=velX;
		y+=velY;
	}

	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x,y,size,size);
	}

}
