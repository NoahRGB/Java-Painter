package graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

import shapes.Circle;
import shapes.Rect;
import shapes.Shape;

public class Panel extends JPanel {
	int width, height;
	LoopContext currentLoopContext;

	public Panel(int width, int height) {
		this.width = width;
		this.height = height;
		this.setPreferredSize(new Dimension(width, height));
		this.currentLoopContext = new LoopContext();
	}
	
	public void paint(Graphics graphics) {
		Graphics2D g = (Graphics2D) graphics;
		g.setColor(currentLoopContext.backgroundColor);
		g.fillRect(0, 0, 500, 500);
		for (Shape shape : currentLoopContext.shapesToDraw) {
			g.setColor(shape.colour);
			if (shape instanceof Circle) {
				g.fillOval(shape.x, shape.y, shape.width, shape.height);
			} else if (shape instanceof Rect) {
				g.fillRect(shape.x, shape.y, shape.width, shape.height);
			}
		}
	}
	
	public void updateShapes(LoopContext newLoopContext) {
		currentLoopContext = newLoopContext;
		repaint();
	}
}
