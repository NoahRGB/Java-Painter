package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.swing.Timer;

import graphics.Frame;
import graphics.LoopContext;
import shapes.Circle;
import shapes.Rect;
import shapes.Shape;

public abstract class Painter implements ActionListener{

	//loop context variables
	ArrayList<Shape> shapesToDraw = new ArrayList<Shape>();
	Set<Integer> keysDown = new HashSet<Integer>();
	Color bgColor;
	Color colour;
	
	//window setup
	Timer animationTimer;
	Frame mainFrame;
	int fps;

	public int width;
	public int height;
	
	public Painter(int width, int height, int fps) {
		this.width = width;
		this.height = height;
		this.fps = fps;
		mainFrame = new Frame(width, height, this);
		animationTimer = new Timer(1000 / fps, this);
		animationTimer.start();
	}
	
	public boolean isKeyDown(int toCheckKeyCode) {
		for (int keyCode : keysDown) {
			if (keyCode == toCheckKeyCode) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		shapesToDraw.clear();
		animationLoop();
		mainFrame.updateShapes(new LoopContext(shapesToDraw, keysDown, bgColor));
	}
	
	public void background(Color newBgColor) {
		bgColor = newBgColor;
	}
	
	public void colour(Color newColour) {
		colour = newColour;
	}
	
	public void circle(int x, int y, int width, int height) {
		shapesToDraw.add(new Circle(x, y, width, height, colour));
	}
	
	public void rect(int x, int y, int width, int height) {
		shapesToDraw.add(new Rect(x, y, width, height, colour));
	}

	abstract void animationLoop();
}
