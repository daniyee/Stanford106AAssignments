package week2;

import acm.program.GraphicsProgram;
import java.awt.*;
import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.*;
public class DrawingLines extends GraphicsProgram {

	public void run() {
		addMouseListeners();
		}


public void mousePressed(MouseEvent e) {
double x = e.getX();
double y = e.getY();
line = new GLine(x, y, x, y);
add(line);
}
public void mouseDragged(MouseEvent e) {
double x = e.getX();
double y = e.getY();
line.setEndPoint(x, y);
}

private GLine line;


}
















	
	


		
	

