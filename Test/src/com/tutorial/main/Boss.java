package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Boss extends GameObject{
	ArrayList<Projectile> projectiles = new ArrayList<Projectile>();
	int counter = 0;
	int speed;

	public Boss(int x, int speed,Handler h) {
		super(x - 48, -150, ID.Enemy, 16+80, h);
		velX = 0;
		velY = 1;
		this.speed = speed;
	}

	public void tick() {
		counter++;
		if(y<=9)
		y+=velY;
		else if(counter%speed==0){
			projectiles.add(new Projectile(x,size,h));
		}
	}

	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x,y,size,size);
	}

}