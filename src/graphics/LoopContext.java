package graphics;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import shapes.Shape;

public class LoopContext {
	ArrayList<Shape> shapesToDraw;
	Set<Integer> keysDown;
	Color backgroundColor;
	
	public LoopContext(ArrayList<Shape> shapesToDraw, Set<Integer> keysDown, Color backgroundColor) {
		this.shapesToDraw = shapesToDraw;
		this.keysDown = keysDown;
		this.backgroundColor = backgroundColor;
	}
	
	//An alternative constructor for the initial paint where an empty loopContext is needed
	public LoopContext() {
		this.shapesToDraw = new ArrayList<Shape>();
		this.keysDown = new HashSet<Integer>();
		this.backgroundColor = Color.black;
	}
}
