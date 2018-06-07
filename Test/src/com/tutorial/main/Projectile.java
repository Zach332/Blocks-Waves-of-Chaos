package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject{

	public Projectile(int x, int size,Handler h) {
		super(x+size/2, 40, ID.Enemy, 8, h);
		velX = Game.r.nextInt(10)-5;
		velY = Game.r.nextInt(5)-1;
	}

	public void tick() {
		x+=velX;
		y+=velY;
	}

	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x,y,size,size);
	}

}
