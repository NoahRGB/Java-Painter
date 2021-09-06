package main;

import java.awt.Color;
import java.awt.event.KeyEvent;

public class PainterDemo extends Painter {
	
	int x1, y1 = 100;
	int x2, y2 = 300;
	int speed = 4;
	
	public PainterDemo(int width, int height, int fps) {
		super(width, height, fps);
	}

	@Override
	void animationLoop() {
		background(Color.red);
		colour(Color.blue);
		circle(x1, y1, 200, 200);
		
		if (isKeyDown(KeyEvent.VK_D)) {
			x1 += speed;
		}
		if (isKeyDown(KeyEvent.VK_A)) {
			x1 -= speed;
		}
		if (isKeyDown(KeyEvent.VK_W)) {
			y1 -= speed;
		}
		if (isKeyDown(KeyEvent.VK_S)) {
			y1 += speed;
		}
		
		if (isKeyDown(KeyEvent.VK_RIGHT)) {
			x2 += speed;
		}
		if (isKeyDown(KeyEvent.VK_LEFT)) {
			x2 -= speed;
		}
		if (isKeyDown(KeyEvent.VK_UP)) {
			y2 -= speed;
		}
		if (isKeyDown(KeyEvent.VK_DOWN)) {
			y2 += speed;
		}
		
		colour(Color.white);
		circle(x2, y2, 50, 50);
	}

	public static void main(String[] args) {
		new PainterDemo(500, 500, 60);
	}

}
