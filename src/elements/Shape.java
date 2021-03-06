package elements;

import java.awt.Color;

public abstract class Shape {
	public int x, y, width, height;
	private String name;
	public Color colour;
	
	public Shape(String name, int x, int y, int width, int height, Color colour) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.colour = colour;
	}
	
	//some elements are more basic and don't require width, height, colour
	public Shape (String name, int x, int y) {
		this.name = name;
		this.x = x;
		this.y = y;
	}
}
