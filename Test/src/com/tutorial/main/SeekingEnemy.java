package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;

public class SeekingEnemy extends GameObject{
	
	Handler h;

	public SeekingEnemy(Handler h) {
		super(Game.r.nextInt(Game.WIDTH - 16), Game.r.nextInt(Game.HEIGHT - 38), ID.Enemy, 16, h);
		velX = 1;
		velY = 1;
		this.h = h;
	}

	public void tick() {
		GameObject player = null;;
		for(GameObject o: h.object)
		{
			if(o.id == ID.Player)player = o;
		}
		if(player.getX() > x)x+=velX;
		if(player.getX() < x)x-=velX;
		if(player.getY() > y)y+=velY;
		if(player.getY() < y)y-=velY;
	}

	public void render(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(x,y,size,size);
	}
}
