package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.swing.Timer;

import elements.Circle;
import elements.Rect;
import elements.Shape;
import elements.Text;
import graphics.Frame;
import graphics.LoopContext;

public abstract class Painter implements ActionListener{

	//loop context variables
	ArrayList<ArrayList> toDraw = new ArrayList<ArrayList>();
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
		
		//the first array of toDraw contains all the shapes,
		//and the second array contains all the text elements
		toDraw.add(new ArrayList<Shape>());
		toDraw.add(new ArrayList<Text>());
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
		toDraw.get(0).clear();
		toDraw.get(1).clear();
		animationLoop();
		mainFrame.updateElements(new LoopContext(toDraw, keysDown, bgColor));
	}
	
	public void fps(int newFps) {
		this.fps = newFps;
		animationTimer.stop();
		animationTimer = new Timer(1000 / fps, this);
		animationTimer.start();
	}
	
	public void background(Color newBgColor) {
		bgColor = newBgColor;
	}
	
	public void background(int r, int g, int b, int a) {
		Color newBgColor = new Color(r, g, b, a);
		bgColor = newBgColor;
	}
	
	public void background(int r, int g, int b) {
		background(r, g, b, 255);
	}
	
	public void colour(Color newColour) {
		colour = newColour;
	}
	
	public void colour(int r, int g, int b, int a) {
		Color newColour = new Color(r, g, b, a);
		colour = newColour;
	}
	
	public void colour (int r, int g, int b) {
		colour(r, g, b, 255);
	}
	
	public void text(String str, int x, int y) {
		toDraw.get(1).add(new Text(str, x, y));
	}
	
	public void circle(int x, int y, int width, int height) {
		toDraw.get(0).add(new Circle(x, y, width, height, colour));
	}
	
	public void rect(int x, int y, int width, int height) {
		toDraw.get(0).add(new Rect(x, y, width, height, colour));
	}

	abstract void animationLoop();
}
