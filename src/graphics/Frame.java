package graphics;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;

import main.Painter;

import shapes.Shape;

public class Frame extends JFrame{
	
	Panel mainPanel;
	Painter painter;
	LoopContext currentLoopContext;
	
	public Frame(int width, int height, Painter painter) {
		this.mainPanel = new Panel(width, height);
		this.currentLoopContext = new LoopContext();
		this.painter = painter;
		this.add(mainPanel);
		this.pack();
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
		this.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				currentLoopContext.keysDown.add(e.getKeyCode());
			}

			@Override
			public void keyReleased(KeyEvent e) {
				currentLoopContext.keysDown.remove(e.getKeyCode());
			}
			
			@Override
			public void keyTyped(KeyEvent e) {}
		});
	}
	
	public void updateShapes(LoopContext newLoopContext) {
		currentLoopContext = newLoopContext;
		mainPanel.updateShapes(newLoopContext);
	}
}
