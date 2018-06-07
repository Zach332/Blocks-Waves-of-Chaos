package com.tutorial.main;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {

	LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	public void tick() {
		GameRun.ticks++;
		for(int i = 0; i<object.size();i++) {
			object.get(i).tick();
		}
		GameRun.tick();
	}
	
	public void render(Graphics g) {
		for(GameObject o : object) {
			o.render(g);
		}
		HUD.render(g);
	}
	
	public void addObject(GameObject o) {
		object.add(o);
	}
	
	public void removeObject(GameObject o) {
		object.remove(o);
	}
}
