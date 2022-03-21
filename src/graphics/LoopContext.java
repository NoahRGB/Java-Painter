package graphics;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import elements.Shape;
import elements.Text;

public class LoopContext {
	ArrayList<ArrayList> toDraw;
	Set<Integer> keysDown;
	Color backgroundColor;
	
	public LoopContext(ArrayList<ArrayList> toDraw, Set<Integer> keysDown, Color backgroundColor) {
		this.toDraw = toDraw;
		this.keysDown = keysDown;
		this.backgroundColor = backgroundColor;
	}
	
	//An alternative constructor for the initial paint where an empty loopContext is needed
	public LoopContext() {
		this.toDraw = new ArrayList<ArrayList>();
		this.toDraw.add(new ArrayList<Shape>());
		this.toDraw.add(new ArrayList<Text>());
		this.keysDown = new HashSet<Integer>();
		this.backgroundColor = Color.black;
	}
}
