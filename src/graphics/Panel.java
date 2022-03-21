package graphics;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

import elements.Circle;
import elements.Rect;
import elements.Shape;
import elements.Text;

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
		g.fillRect(0, 0, width, height);
		
		ArrayList<Shape> shapesToDraw = currentLoopContext.toDraw.get(0);
		ArrayList<Text> textToDraw = currentLoopContext.toDraw.get(1);
	
		for (Shape shape : shapesToDraw) {
			g.setColor(shape.colour);
			if (shape instanceof Circle) {
				g.fillOval(shape.x, shape.y, shape.width, shape.height);
			} else if (shape instanceof Rect) {
				g.fillRect(shape.x, shape.y, shape.width, shape.height);
			}
		}
		
		for (Text text : textToDraw) {
			g.drawString(text.text, text.x, text.y);
		}
	}
	
	public void updateElements(LoopContext newLoopContext) {
		currentLoopContext = newLoopContext;
		repaint();
	}
}
