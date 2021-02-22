package week2;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.Color;
import java.awt.color.*;




public class RobotFace extends GraphicsProgram {
	private static final int head_height = 200;
	private static final int head_width = 100;
	private static final int eye_radius = 15;
	private static final int mouth_height = 30;
	private static final int mouth_width = 60;
	
	public void run() {
		addHead();
		addLefteye();
		addRighteye();
		addMouth();
	}
	
	private void addHead() {
		GRect head = new GRect(getWidth()/2 - head_width/2, getHeight()/2 - head_height/2, head_width, head_height);
		head.setFilled(true);
		head.setFillColor(Color.gray);
		add(head);
	}
	
	private void addLefteye() {
		GOval lefteye = new GOval(getWidth()/2 - head_width/4 - eye_radius, getHeight()/2 - head_height/4 - eye_radius, eye_radius*2, eye_radius*2);
		lefteye.setColor(Color.yellow);
		lefteye.setFilled(true);
		lefteye.setFillColor(Color.yellow);
		add(lefteye);
	}
	
	private void addRighteye() {
		GOval righteye = new GOval(getWidth()/2 + head_width/4 - eye_radius, getHeight()/2 - head_height/4 - eye_radius, eye_radius*2, eye_radius*2);
		righteye.setFillColor(Color.yellow);
		righteye.setColor(Color.yellow);
		righteye.setFilled(true);
		add(righteye);
	}
	
	private void addMouth() {
		GRect mouth = new GRect(getWidth()/2 - mouth_width/2, getHeight()/2 + head_height/4 - mouth_height/2, mouth_width, mouth_height);
		
		mouth.setFillColor(Color.white);
		mouth.setColor(Color.white);
		mouth.setFilled(true);
		add(mouth);
	}
}




	



		
	

