package com.tutorial.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
	
	private Handler handler;
	private boolean[] keyDown = new boolean[4];
	
	public KeyInput(Handler h) {
		handler = h;
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		//System.out.println(KeyEvent.getKeyText(key));
		for(GameObject o: handler.object) {
			if(o.id == ID.Player) {
				if(key == KeyEvent.VK_A) {o.setVelX(-8);keyDown[0] = true;}
				if(key == KeyEvent.VK_D) {o.setVelX(8);keyDown[1] = true;}
				if(key == KeyEvent.VK_W) {o.setVelY(-8);keyDown[2] = true;}
				if(key == KeyEvent.VK_S) {o.setVelY(8);keyDown[3] = true;}
			}
		}
		if(Game.state == Game.State.Stop && key == KeyEvent.VK_ENTER) {
			Game.state = Game.State.Start;
			GameRun.startTicks = 0;
		}
			
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		for(GameObject o: handler.object) {
			if(o.id == ID.Player) {
				if(key == KeyEvent.VK_A) keyDown[0] = false;
				if(key == KeyEvent.VK_D) keyDown[1] = false;
				if(key == KeyEvent.VK_W) keyDown[2] = false;
				if(key == KeyEvent.VK_S)keyDown[3] = false;
				
				if(!keyDown[0] && !keyDown[1])o.setVelX(0);
				if(!keyDown[2] && !keyDown[3])o.setVelY(0);
			}
		}
	}
}
