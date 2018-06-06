package com.tutorial.main;

import java.awt.Graphics;

public abstract class GameObject {

	protected int x,y;
	protected ID id;
	protected int velX,velY;
	protected int size;
	Handler h;
	
	public GameObject(int x, int y, ID id, int size, Handler h) {
		this.x = x;
		this.y = y;
		this.id = id;
		this.h= h;
		this.size = size;
		h.addObject(this);
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	public int getVelX() {
		return velX;
	}

	public void setVelX(int velX) {
		this.velX = velX;
	}

	public int getVelY() {
		return velY;
	}

	public void setVelY(int velY) {
		this.velY = velY;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
